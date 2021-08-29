import java.util.*;

public class Corrida {

    public List<Veiculo> veiculos = new ArrayList<>();

    private String nome;
    private double distancia;
    private double premioEmDolares;
    private int quantidadeDeVeiculosPermitidos;
    private int inscricao = 0;
    private double valorMaximo = 1000000;
    double resultado;
    double classificaco[] = new double[15];


    public Corrida(String nome,double distancia, double premioEmDolares,
                   int quantidadeDeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeDeVeiculosPermitidos = quantidadeDeVeiculosPermitidos;
    }

    public boolean isListaCheia() {
        if (inscricao == quantidadeDeVeiculosPermitidos) {
            return true;
        }
        return false;
    }

    public void adicionarCarro(Carro carro) {
        if (isListaCheia()) {
            System.out.println("Limite maximo de inscritos!");
        }else if(!isListaCheia()) {
            veiculos.add(carro);
            System.out.println("Carro Adicionado na corrida");
            inscricao++;

        }

    }

    public void adicionarMoto(Moto moto) {
        // quantidade menor que o valor da corrida
        if (isListaCheia()) {
            System.out.println("Limite maximo de inscritos!");
        } else if (!isListaCheia()) {
            veiculos.add(moto);
            System.out.println("Moto Adicionada na corrida");
            inscricao++;
        }
    }
    public void removerVeiculo(Veiculo veiculo) {
        veiculos.remove(veiculo);
        System.out.println("Veiculo removido do Modelo " + veiculo.getMarca());
    }
    public void removeVeiculoComPlaca(String placa){
        for (int i = 0; i < veiculos.size(); i++){
            if(veiculos.get(i).getPlaca().equals(placa)){
                veiculos.remove(veiculos.get(i));
            }
        }
        System.out.println("Veiculo removido, Placa " + placa);
    }
    public double desempenhoCorrida(Veiculo veiculo){
        return veiculo.getVelocidade() * 1 / 2 * veiculo.getAceleracao() /(veiculo.getAnguloVirada() *
                (veiculo.getPeso() - veiculo.getRodas() * 100));
    }
    public void listarVeiculosDaCorrida(){
        System.out.println("*******VEÍCULOS INSCRITOS***********");
        for(Veiculo v: veiculos) {
            System.out.println(v.getPlaca());
        }
    }
    public Veiculo vencedorCorrida(){
        Veiculo vencedor = null;
        if(!veiculos.isEmpty()) {
            double melhorDesempenho=0;
            for (Veiculo veiculo : veiculos) {
                if(melhorDesempenho < desempenhoCorrida(veiculo)){
                    melhorDesempenho = desempenhoCorrida(veiculo);
                    vencedor=veiculo;
                }
            }
        }
        return vencedor;

    }
}