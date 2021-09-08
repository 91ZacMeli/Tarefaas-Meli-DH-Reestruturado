package exemplo5.excecoes;
    public class FuncionarioExistenteException extends RuntimeException{


        public FuncionarioExistenteException(String mensagem) {
            super(mensagem);
        }

        public FuncionarioExistenteException(RuntimeException e) {
            super(e);
    }
}
