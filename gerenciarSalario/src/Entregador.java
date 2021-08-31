public class Entregador extends Funcionario{
    private String zona;
    public Entregador(String nome, int antiguidade, double salario) {
        super(nome, antiguidade, salario);
    }

    public Entregador(String nome, double antiguidade, double salario, String zona) {
        super(nome, antiguidade, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Entregador{" +
                "zona='" + zona + '\'' +
                '}';
    }

    @Override
    public void CalculePlus() {

    }

    @Override
    public double CalculePlus(double salario, double comissao) {
        return 0;
    }

    @Override
    public double CalculePlus(double salario, String zona) {
        if (this.getAntiguidade() > 3 && zona.equals("zona 3")) {
           salario = this.getSalario() + this.getPlus();
        }
        return salario;
    }
}
