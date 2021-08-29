public class Moto extends Veiculo{


     public Moto(String tipo,String marca, String placa, double velocidade, double aceleracao, double anguloDeVirada) {
         super(tipo,marca, placa, velocidade, aceleracao, anguloDeVirada);
         setPeso(300);
         setRodas(2);
     }
    }