package ClassBanco;

public class ClienteExecutivo extends Conta implements Executivos{

    private String nome;

    public ClienteExecutivo(String nome) {
        this.nome = nome;
    }

    public ClienteExecutivo(String conta, String agencia, String tipoConta, String nome) {
        super(conta, agencia, tipoConta);
        this.nome = nome;
    }

    @Override
    public void realizarTransferencia() {

    }

    @Override
    public void realizarDeposito() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
