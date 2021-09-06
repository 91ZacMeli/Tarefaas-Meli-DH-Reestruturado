package exemplo3;
import java.text.NumberFormat;
import java.util.Locale;

public class Vendedor extends Funcionario{

    private static final Locale localeBrasil = new Locale("pt", "BR");

    private double faturamento;

    public Vendedor(String n, String s, double sal, double f) {
        super(n,s,sal);
        faturamento = f;
    }

    public double getComissao() {
        return faturamento * 0.05;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + getComissao();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "      " + NumberFormat.getCurrencyInstance(localeBrasil).format(getComissao()) + "     " + NumberFormat.getCurrencyInstance(localeBrasil).format(getSalario());
    }
}