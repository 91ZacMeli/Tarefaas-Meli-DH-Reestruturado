import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExcecoesMain {
    public static void main(String[] args) {

        PraticaExcecoes divisao =  new PraticaExcecoes();
        PraticaExcecoes readerFile= new PraticaExcecoes();

        try {
            divisao.calcularQuociente(divisao.getB(), divisao.getA());
        }catch (ArithmeticException exception){
            System.out.println("_________________________________________________");
            System.out.println(exception.getMessage()+"\nNão Pode ser Divido por Zero!! ");
        }finally {
            System.out.println("_________________________________________________");
            System.out.println("Programa Finalizado.");
            System.out.println("_________________________________________________");
            System.out.println("_________________________________________________");
        }

//Mensagem final
        String mensagemFinal = "Esta é a última mensagem";
//Código que lança exceção
        try {
        int[] numeros = new int[5];
        numeros[5] = 10;
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }finally {
            System.out.println("_________________________________________________");
            System.out.println("mensagemFinal");
            System.out.println("_________________________________________________");
        }
        System.out.println("_________________________________________________");
        try {
           readerFile.lerArquivo("arquivo");
       }catch (FileNotFoundException fnf){
           System.out.println("O Arquivo especeficado não foi encontrado");
       }catch (IOException io) {
           System.out.println("Erro ao ler o arquivo especificado");
       }

    }

}
