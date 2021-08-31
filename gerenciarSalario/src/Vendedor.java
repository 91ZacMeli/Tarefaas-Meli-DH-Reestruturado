public class Vendedor extends Funcionario{

    private double comissao;
    public Vendedor(String nome, double antiguidade, double salario) {
        super(nome, antiguidade, salario);
    }

    public Vendedor(String nome, double antiguidade, double salario, double comissao) {
        super(nome, antiguidade, salario);
        this.comissao = comissao;
    }

    @Override
    public double CalculePlus(double salario, double comissao) {
        if (this.getAntiguidade() > 5 && comissao > 5000) {
            salario = this.getSalario() + this.getPlus();
        }
        return salario;
    }

    @Override
    public double CalculePlus(double salario, String zona) {
        return 0;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "comissao=" + comissao +
                '}';
    }

    @Override
    public void CalculePlus() {
    }
}
