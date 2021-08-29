import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> listaVeiculos = new ArrayList<>();

        Veiculo veiculo1 = new Veiculo("Ford", "Fiesta", 1000);
        listaVeiculos.add(veiculo1);

        Veiculo veiculo2 = new Veiculo("Ford", "Focus", 1200);
        listaVeiculos.add(veiculo2);

        Veiculo veiculo3 = new Veiculo("Ford", "Explorer", 2500);
        listaVeiculos.add(veiculo3);

        Veiculo veiculo4 = new Veiculo("Fiat", "Uno", 500);
        listaVeiculos.add(veiculo4);

        Veiculo veiculo5 = new Veiculo("Fiat", "Cronos", 1000);
        listaVeiculos.add(veiculo5);

        Veiculo veiculo6 = new Veiculo("Fiat", "Torino", 1250);
        listaVeiculos.add(veiculo6);

        Veiculo veiculo7 = new Veiculo("Chevrolet", "Aveo", 1250);
        listaVeiculos.add(veiculo7);

        Veiculo veiculo8 = new Veiculo("Chevrolet", "Spin", 2050);
        listaVeiculos.add(veiculo8);

        Veiculo veiculo9 = new Veiculo("Toyota", "Corola", 1200);
        listaVeiculos.add(veiculo9);

        Veiculo veiculo10 = new Veiculo("Toyota", "Fortuner", 3000);
        listaVeiculos.add(veiculo10);

        Veiculo veiculo11 = new Veiculo("Renault", "Logan", 950);
        listaVeiculos.add(veiculo11);

        listaVeiculos.forEach(v -> System.out.println(v.getPreco()));

        System.out.println("_______________________________________________");
//
//        Collections.sort(listaVeiculos, (Veiculo v1, Veiculo v2) -> v1.getPreco().compare(v2.getPreco()));
//        listaVeiculos.forEach(v -> System.out.println(v.getModelo()));

    }

}


