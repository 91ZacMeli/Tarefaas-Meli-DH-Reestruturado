import java.lang.Math;
import java.util.Random;
public class Calculos {

    Random gerador = new Random();
    public int ehmaior(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public int ehmenor(int num1, int num2) {
        return Math.min(num1, num2);
    }

    public double potenciacao(int base, int potencia) {
        return Math.pow(base, potencia);
    }

    public double CossenoDoAngulo(double angulo) {
        return Math.cos(Math.toRadians(angulo));
    }

    public double radiacao(double numero) {
        return Math.sqrt(numero);
    }

    public int aleatorio() {
        return gerador.nextInt(1000);
    }
}
