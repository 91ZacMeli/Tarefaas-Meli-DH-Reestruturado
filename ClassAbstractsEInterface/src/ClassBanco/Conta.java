package ClassBanco;

public class Conta {
    private String conta;
    private String agencia;
    private String tipoConta;
    private double saldo;

    public Conta(String conta, String agencia, String tipoConta) {
        this.conta = conta;
        this.agencia = agencia;
        this.tipoConta = tipoConta;
    }

    public Conta() {
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
