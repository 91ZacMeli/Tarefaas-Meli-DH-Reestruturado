public class Curriculo implements Impressora{
    private String nome;
    private String sobrenome;
    private String cpf;
    private int idade;
    private int telefone;

    public Curriculo() {
    }

    public Curriculo(String nome, String sobrenome, String cpf, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public void imprimirCurrriculo(Curriculo curriculo) {

    }

    @Override
    public void imprimirLivro(Livro livro) {

    }

    @Override
    public void imprimirRelatorio(Relatorio relatorio) {

    }
}
