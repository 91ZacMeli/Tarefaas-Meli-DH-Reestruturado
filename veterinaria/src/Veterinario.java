public class Veterinario {
    private int rg;
    private String nome;
    private String sobrenome;
    private int numeroRegistro;
    private String especialidade;

    public Veterinario(int rg, String nome, String sobrenome, int numeroRegistro, String especialidade) {
        this.rg = rg;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroRegistro = numeroRegistro;
        this.especialidade = especialidade;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
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

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
