package excecoes;

import excecoes.model.Cliente;
import excecoes.model.Desenvolvedor;
import excecoes.util.ArquivoUtil;

public class Main {
    public static void main(String[] args) {

        Desenvolvedor mauri = new Desenvolvedor("mauri", "m", 10000, "mauri", "123");
        Cliente nobre = new Cliente("nobre", "123");

        ArquivoUtil arquivoUtil = new ArquivoUtil();

        arquivoUtil.escreveObjetoArquivoTexto(mauri);
        arquivoUtil.fechaArquivo();

        nobre.autentica("nobre", "123");
        mauri.autentica("mauri", "1923");


    }
}
