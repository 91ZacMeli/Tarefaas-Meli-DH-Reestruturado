public class NaoPerecivel extends Product{
    private String tipo;

    public NaoPerecivel(String tipo) {
        this.tipo = tipo;
    }

    public NaoPerecivel(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "NaoPerecivel{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
    public double calcular(int qtddProdutos){
        return qtddProdutos *= this.getPrice();
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
