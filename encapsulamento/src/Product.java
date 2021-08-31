import java.util.HashMap;
import java.util.List;

public class Product {
    private String name;
    private double price;
    private int chave = 0;

    HashMap<Integer, List<Product>> productItens = new HashMap<>();

    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public Product() {

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", chave=" + chave +
                ", productItens=" + productItens +
                '}';
    }

    public Integer inserirItem(List<Product> produtos){
        productItens.put(++chave, produtos);
        return chave;
    }

    public void mostrarProdutos(){
        //for(Integer cod: productItens.keySet()){
            List<Product> produtos = productItens.get(chave);
           // for (Product item:produtos){
                System.out.println(produtos);
    //        }
      //  }
    }


    public double calcular(int quantidadeOfProdutos,double price){
        return quantidadeOfProdutos * this.getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
