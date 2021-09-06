package exemplo4;

import exemplo4.model.Desenvolvedor;
import exemplo4.model.Funcionario;
import exemplo4.model.Gerente;
import exemplo4.model.Vendedor;
import exemplo4.util.ArquivoUtil;

import java.io.IOException;

public class ProgramaArmazenarArquivo {

    public static void main(String[] args) throws IOException {
        Funcionario kenyo = new Funcionario("kenyo", "m", 3000.198);
        Funcionario mauri = new Funcionario("mauri", "m", 5000.198);
        Funcionario joice = new Funcionario("joice", "f", 7000.198);
        Funcionario filipe = new Funcionario("filipe", "m", 10000.198);
        Funcionario thiago = new Gerente("thiago", "m", 13000);
        Funcionario ana = new Vendedor("ana carolina", "f", 20000, 100000);
        Funcionario nobre = new Desenvolvedor("nobre", "m", 20000, "nobre@mail.com", "radioNobre");

        ArquivoUtil arquivoUtil = new ArquivoUtil();

        Funcionario[] funcionarios = {kenyo, mauri, joice, filipe, thiago, ana, nobre};

        arquivoUtil.escreveObjetoArquivoTexto(funcionarios);

        arquivoUtil.fechaArquivo();
    }

}
