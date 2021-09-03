import java.util.Date;

public abstract class AnimalPaciente {

    private int numeroPaciente;
    private String especie;
    private String raca;
    private String cor;
    private String DatedataNascimento;
    private String nome;
    private Proprietario dono;

    public AnimalPaciente(int numeroPaciente, String especie, String raca, String cor, String datedataNascimento, String nome,Proprietario dono) {
        this.numeroPaciente = numeroPaciente;
        this.especie = especie;
        this.raca = raca;
        this.cor = cor;
        DatedataNascimento = datedataNascimento;
        this.nome = nome;
        this.dono = dono;
    }

    public Proprietario getDono() {
        return dono;
    }

    public void setDono(Proprietario dono) {
        this.dono = dono;
    }

    public AnimalPaciente() {
    }

    public int getNumeroPaciente() {
        return numeroPaciente;
    }

    public void setNumeroPaciente(int numeroPaciente) {
        this.numeroPaciente = numeroPaciente;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDatedataNascimento() {
        return DatedataNascimento;
    }

    public void setDatedataNascimento(String datedataNascimento) {
        DatedataNascimento = datedataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
