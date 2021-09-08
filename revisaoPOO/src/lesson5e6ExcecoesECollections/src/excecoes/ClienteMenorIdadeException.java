package excecoes;

public class ClienteMenorIdadeException extends RuntimeException{

    private static final long serialVersionUID = -5578654880199339534L;

    public ClienteMenorIdadeException(String mensagem) {
        super(mensagem);
    }
}
