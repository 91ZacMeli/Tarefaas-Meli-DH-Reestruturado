package exemplo5.excecoes.util;

import exemplo4.excecoes.FuncionarioExistenteException;
import exemplo4.excecoes.PersistenciaException;
import exemplo4.model.Funcionario;

import java.io.*;

public class ArquivoUtil {

    private BufferedWriter bw;

    public ArquivoUtil() {
        FileOutputStream fos;
        try {
            fos = new FileOutputStream("funcionarios.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);
        } catch (FileNotFoundException e) {
            System.out.println("deu pau");
        }
    }

    public void escreveObjetoArquivoTexto(Funcionario funcionario) {
        try {
            funcionarioExistente(funcionario);
            bw.append(funcionario.toString());
            bw.newLine();
        } catch (IOException e) {
            //throw new IOException("Erro no momento de persistir o registro no arquivo");
            //neste caso exige o throws na assinatura do metodo
            throw new PersistenciaException("Erro no momento de persistir o registro no arquivo");
        } catch (FuncionarioExistenteException e) {
            throw new FuncionarioExistenteException(e);
        }
    }

    private void funcionarioExistente(Funcionario funcionario) {
        if (false) {
            throw new FuncionarioExistenteException("Funcionario já cadastrado");
        }
    }

    public void escreveObjetoArquivoTexto(Funcionario[] funcionarios) {
        for (int i = 0; i < funcionarios.length; i++) {
            escreveObjetoArquivoTexto(funcionarios[i]);
        }
    }

    public void fechaArquivo() {
        try {
            bw.close();
        } catch (IOException e) {
            System.out.println("deu pau");
        }
    }

}