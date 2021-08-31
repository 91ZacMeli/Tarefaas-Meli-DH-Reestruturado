import java.util.ArrayList;
import java.util.List;

public class Distribuidor extends Product{

    public Distribuidor(String name, double price) {
        super(name, price);
    }

    public static void main(String[] args) {

        double totadeVendaProduto = 0.0;
        List<Product> produtos= new ArrayList<>();
        Product item = new Product();

        produtos.add(new Pereciveis("Carne", 39.99,2 ));
        produtos.add(new Pereciveis("Frango", 19.99,5));
        produtos.add(new Pereciveis("Queijo", 39.99,4));
        produtos.add(new Pereciveis("Iorgute", 3.99,4));

        produtos.add(new NaoPerecivel("Arroz",18.99));
        produtos.add(new NaoPerecivel("feijão",7.5));
        produtos.add(new NaoPerecivel("Oleo",6.49));
        produtos.add(new NaoPerecivel("Sal",3.79));
        produtos.add(new NaoPerecivel("Acucar",2.5));

        System.out.println("______________________________________________________________");
        item.inserirItem(produtos);
        item.mostrarProdutos();
        System.out.println("______________________________________________________________");

        for (Product p : produtos){
            if (p instanceof Pereciveis) {
               totadeVendaProduto += p.calcular(5,p.getPrice());
            }
        }

        System.out.println(totadeVendaProduto);
        System.out.println("______________________________________________________________");

        for (Product n : produtos){
            if (n instanceof NaoPerecivel) {
                totadeVendaProduto += n.calcular(5,n.getPrice());
            }
        }
        System.out.println(totadeVendaProduto);
        System.out.println("______________________________________________________________");

    }
}
