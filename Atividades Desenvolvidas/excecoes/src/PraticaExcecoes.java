import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PraticaExcecoes {
    private int a = 0;
    private int b = 300;


    public double calcularQuociente(int numerador,  int denominador){
        return numerador/denominador;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void lerArquivo(String nomeArquivo) throws IOException {
        String texto = null;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo));
        while((texto = bufferedReader.readLine()) != null) {
            System.out.println(texto);
        }
        bufferedReader.close();
    }
}

