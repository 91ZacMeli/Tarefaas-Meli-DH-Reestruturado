public abstract class Funcionario {

    private String nome;
    private double antiguidade;
    private double salario;
    private final double plus = 5000;

    public Funcionario(String nome, double antiguidade, double salario) {
        this.nome = nome;
        this.antiguidade = antiguidade;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", antiguidade=" + antiguidade +
                ", salario=" + salario +
                ", plus=" + plus +
                '}';
    }
    public abstract void CalculePlus();

    public double getPlus() {
        return plus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAntiguidade() {
        return antiguidade;
    }

    public void setAntiguidade(double antiguidade) {
        this.antiguidade = antiguidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double CalculePlus(double salario, double comissao);

    public abstract double CalculePlus(double salario, String zona);
}
