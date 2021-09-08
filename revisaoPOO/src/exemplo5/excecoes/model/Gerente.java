package exemplo5.excecoes.model;

import java.text.NumberFormat;
import java.util.Locale;

public class Gerente extends Funcionario {

    private static final Locale localeBrasil = new Locale("pt", "BR");

    public Gerente(String n, String s, double sal) {
        super(n,s,sal);
    }

    public double getGratificacao() {
        return super.getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return super.toString() + "      " + NumberFormat.getCurrencyInstance(localeBrasil).format(getGratificacao());
    }

}