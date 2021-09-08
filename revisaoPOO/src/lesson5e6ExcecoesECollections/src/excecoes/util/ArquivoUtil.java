package excecoes.util;

import excecoes.ClienteExistenteException;
import excecoes.PersistenciaException;
import excecoes.model.Funcionario;

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
        } catch (ClienteExistenteException e) {
            throw new ClienteExistenteException(e);
        }
    }

    private void funcionarioExistente(Funcionario funcionario) {
        if (false) {
            throw new ClienteExistenteException("Funcionario já cadastrado");
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