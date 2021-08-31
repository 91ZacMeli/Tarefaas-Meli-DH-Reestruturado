package ClassBanco;

public class ClienteColetor extends Conta implements Coletores{

    private String nome;

    public ClienteColetor(String nome) {
        this.nome = nome;
    }

    public ClienteColetor(String conta, String agencia, String tipoConta, String nome) {
        super(conta, agencia, tipoConta);
        this.nome = nome;
    }

    @Override
    public void sacarDinheiro() {

    }

    @Override
    public void consultarSaldo() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
