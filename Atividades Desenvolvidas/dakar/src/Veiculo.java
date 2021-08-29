import java.util.ArrayList;
import java.util.List;

public abstract class Veiculo {
    List<Veiculo> corredores = new ArrayList<>();
    private String tipo;
    private String marca;
    private String placa;
    private double velocidade;
    private double aceleracao;
    private double anguloVirada;
    private int rodas;
    private double peso;


    public Veiculo(String tipo,String marca, String placa, double velocidade, double aceleracao, double anguloVirada) {
        this.tipo = tipo;
        this.marca = marca;
        this.placa = placa;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloVirada = anguloVirada;
    }

    public Veiculo(String tipo, double peso, int rodas, String marca, String placa, double velocidade, double aceleracao, double anguloVirada) {
        this.tipo = tipo;
        this.marca = marca;
        this.placa = placa;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloVirada = anguloVirada;
        this.peso = peso;
        this.rodas = rodas;

    }

    public Veiculo(String marca, String placa, double velocidade, double aceleracao, double anguloDeVirada, double pesoCarro, int quatidadeRodas) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                ", velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloVirada=" + anguloVirada +
                ", rodas=" + rodas +
                ", peso=" + peso +
                '}';
    }

    public List<Veiculo> getCorredores() {
        return corredores;
    }

    public void setCorredores(List<Veiculo> corredores) {
        this.corredores = corredores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public double getAnguloVirada() {
        return anguloVirada;
    }

    public void setAnguloVirada(double anguloVirada) {
        this.anguloVirada = anguloVirada;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
