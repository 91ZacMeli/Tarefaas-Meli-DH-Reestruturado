import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Veiculo> listaVeiculos = new ArrayList<>();


        listaVeiculos.add(new Veiculo("Fiesta", "Ford", 1000.0));
        listaVeiculos.add(new Veiculo("Focus", "Ford", 1200.0));
        listaVeiculos.add(new Veiculo("Explorer", "Ford", 2500.0));
        listaVeiculos.add(new Veiculo("Uno", "Fiat", 500.0));
        listaVeiculos.add(new Veiculo("Cronos", "Fiat", 1000.0));
        listaVeiculos.add(new Veiculo("Torino", "Fiat", 1250.0));
        listaVeiculos.add(new Veiculo("Aveo", "Chevrolet", 1250.0));
        listaVeiculos.add(new Veiculo("Spin", "Chevrolet", 2500.0));
        listaVeiculos.add(new Veiculo("Corola", "Toyota", 1200.0));
        listaVeiculos.add(new Veiculo("Fortuner", "Toyota", 3000.0));
        listaVeiculos.add(new Veiculo("Logan", "Renault", 950.0));


        System.out.println("\n___________________*** Imprimindo Lista em ordem crescente de valor ***__________________________________________\n");

        listaVeiculos.stream().sorted(Comparator.comparing(Veiculo ::getPreco)
                .thenComparing(Veiculo ::getPreco)).forEach(System.out::println);

        System.out.println("\n_____________________*** Imprimindo Lista em ordem crescente de valor por Marca ***______________________________\n");


        listaVeiculos.stream().sorted(Comparator.comparing(Veiculo ::getMarca)
                .thenComparing(Veiculo ::getPreco)).forEach(System.out::println);

        System.out.println("\n___________________*** Imprimindo Lista de veículos Com precos abaixo de 1000,00 reais ***_______________________\n");


        List<Veiculo> veiculosPrecoBaixo = listaVeiculos.stream()
                .filter(v -> v.getPreco() <1000.0).collect(Collectors.toList());

        System.out.println(veiculosPrecoBaixo);

        System.out.println("\n_________________*** Imprimindo Lista de veículos Com precos a partir de 1000,00 reais ***_______________________________\n");

        List<Veiculo> veiculosPrecoAlto = listaVeiculos.stream().filter(v -> v.getPreco() >= 1000.0).sorted(Comparator.comparing(Veiculo ::getPreco)
                .thenComparing(Veiculo ::getPreco)).collect(Collectors.toList());
        System.out.println(veiculosPrecoAlto);

        System.out.println("\n___________________*** Calculando e Imprimindo a Média de preco dos veículos ***________________________________\n");

        double media = (listaVeiculos.stream().mapToDouble(Veiculo::getPreco).sum())/listaVeiculos.size();

        System.out.printf("A média total dos preços dos veículos é : R$ %.2f ", media);

        System.out.println("\n__________________________________________________________________________________");



    }

}
