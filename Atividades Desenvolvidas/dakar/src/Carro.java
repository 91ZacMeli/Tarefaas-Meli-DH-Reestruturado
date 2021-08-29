public class Carro extends Veiculo {

    public Carro(String tipo,String marca, String placa, double velocidade, double aceleracao, double anguloDeVirada) {
        super(tipo,marca,placa,velocidade, aceleracao, anguloDeVirada);
        setPeso(1000);
        setRodas(4);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
