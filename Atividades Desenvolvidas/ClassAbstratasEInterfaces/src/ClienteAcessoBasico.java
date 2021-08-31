public class ClienteAcessoBasico extends Conta implements Basico{

    private String nome;

    public ClienteAcessoBasico(String conta, String agencia, String tipoConta, String nome) {
        super(conta, agencia, tipoConta);
        this.nome = nome;
    }

    public ClienteAcessoBasico(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void consultaSaldo() {

    }

    @Override
    public void pagarServico() {

    }

    @Override
    public void sacar() {

    }
}
