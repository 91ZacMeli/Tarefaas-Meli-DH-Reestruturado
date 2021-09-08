package exemplo5.excecoes.model;

import java.text.NumberFormat;
import java.util.Locale;

public class Funcionario {

    private String nome;
    private String sexo;
    private double salario;

    private static final Locale localeBrasil = new Locale("pt", "BR");
    //private static DecimalFormat df = new DecimalFormat("#.##");

    public Funcionario() {
    }

    public Funcionario(String n, String s, double sal) {
        nome = n;
        sexo = s;
        salario = sal;

//        df.setRoundingMode(RoundingMode.UP);
//      //  String format = df.format(sal);
//        salario = df.format(sal)  Double.valueOf(format);
    }


    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome.toUpperCase();
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return nome + "         " + sexo + "        " + NumberFormat.getCurrencyInstance(localeBrasil).format(getSalario());
    }
}

