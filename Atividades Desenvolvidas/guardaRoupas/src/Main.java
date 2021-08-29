import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Roupa> roupasNobre = new ArrayList<>();
        List<Roupa> roupasPedro = new ArrayList<>();
        GuardaRoupa guardaRoupa = new GuardaRoupa();

        roupasNobre.add(new Roupa("Nike","Calção"));
        roupasNobre.add(new Roupa("Nike","Camiseta"));
        roupasNobre.add(new Roupa("Umbro","Jaqueta"));
        roupasNobre.add(new Roupa("Umbro","Calça"));

        roupasPedro.add(new Roupa("Adidas","Camiseta"));
        roupasPedro.add(new Roupa("Umbro","Bermuda"));
        roupasPedro.add(new Roupa("Nicoboco","Blusa"));
        roupasPedro.add(new Roupa("Gangster","Meia"));

        guardaRoupa.guardarRoupas(roupasPedro);
        guardaRoupa.guardarRoupas(roupasNobre);

        System.out.println("_____________________________________________________");
        guardaRoupa.mostrarRoupas();
        System.out.println("_____________________________________________________");
        guardaRoupa.devolverRoupas(2);
        guardaRoupa.mostrarRoupas();
        System.out.println("_____________________________________________________");



    }
}
