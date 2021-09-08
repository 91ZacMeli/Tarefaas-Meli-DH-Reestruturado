package exemplo5.excecoes;

import exemplo4.excecoes.Classe1;
import exemplo4.model.Cliente;
import exemplo4.model.Desenvolvedor;
import exemplo4.util.ArquivoUtil;

public class Main {
    public static void main(String[] args) {

        Classe1 obj1 = new Classe1();
        try {
            obj1.metod1();
            System.out.println("programa finalizado");

        }catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
//			System.out.println(e.getCause());
//			System.out.println(e.getMessage());

        }
        Desenvolvedor mauri = new Desenvolvedor("mauri", "m", 10000, "mauri", "123");
        Cliente nobre = new Cliente("nobre", "123");

        ArquivoUtil arquivoUtil = new ArquivoUtil();
        arquivoUtil.escreveObjetoArquivoTexto(mauri);
        arquivoUtil.fechaArquivo();

        mauri.autentica("joice", "1923");
        nobre.autentica("nobre", "1293");
    }
}
