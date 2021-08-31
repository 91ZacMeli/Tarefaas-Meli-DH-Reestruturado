public class Pereciveis extends Product {

    private int diasParaOVencimento;
    private double precoFinal;

    public Pereciveis(String name, double price, int diasParaOVencimento) {
        super(name, price);
        this.diasParaOVencimento = diasParaOVencimento;
        this.precoFinal = precoFinal;
    }

    public int getDiasParaOVencimento() {
        return diasParaOVencimento;
    }

    public void setDiasParaOVencimento(int diasParaOVencimento) {
        this.diasParaOVencimento = diasParaOVencimento;
    }

    @Override
    public double calcular(int quantidadeOfProdutos, double price) {
        return super.calcular(quantidadeOfProdutos, price);
    }

    public double calcular(int quantidadeOfProdutos, double price, int diasParaOVencimento) {


        if (diasParaOVencimento == 1) {
            precoFinal = (quantidadeOfProdutos * this.getPrice()) / 4;
        }
        else if (diasParaOVencimento == 2) {
            precoFinal = (quantidadeOfProdutos * this.getPrice()) / 3;
        }
        else if (diasParaOVencimento == 3){
            precoFinal = (quantidadeOfProdutos * this.getPrice()) / 2;
        }
        return precoFinal;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaOVencimento=" + diasParaOVencimento +
                ", precoFinal=" + precoFinal +
                '}';
    }
}
