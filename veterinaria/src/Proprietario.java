import java.util.Date;

public class Proprietario {
    private int id;
    private String nome;
    private String spbrenome;
    private String dataNascmento;
    private String endereco;
    private int telContato;

    public Proprietario(int id, String nome, String spbrenome, String dataNascmento, String endereco, int telContato) {
        this.id = id;
        this.nome = nome;
        this.spbrenome = spbrenome;
        this.dataNascmento = dataNascmento;
        this.endereco = endereco;
        this.telContato = telContato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSpbrenome() {
        return spbrenome;
    }

    public void setSpbrenome(String spbrenome) {
        this.spbrenome = spbrenome;
    }

    public String getDataNascmento() {
        return dataNascmento;
    }

    public void setDataNascmento(String dataNascmento) {
        this.dataNascmento = dataNascmento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelContato() {
        return telContato;
    }

    public void setTelContato(int telContato) {
        this.telContato = telContato;
    }
}
