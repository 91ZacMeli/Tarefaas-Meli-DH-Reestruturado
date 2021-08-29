import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        SocorristaCarro socorristaCarro = new SocorristaCarro();
        SocorristaMoto socorristaMoto = new SocorristaMoto();
        Corrida fastRun = new Corrida("RachaDaQuebrada", 12000, 50000, 12);

        fastRun.adicionarCarro(new Carro("Carro","Subaru1", "H8PE31", 100, 3.6, 23.7));
        fastRun.adicionarCarro(new Carro("Carro","Subaru2", "H8PE32", 120, 3.8, 23.7));
        fastRun.adicionarCarro(new Carro("Carro","Subaru3", "H8PE33", 130, 3.2, 23.7));
        fastRun.adicionarCarro(new Carro("Carro","Subaru4", "H8PE34", 90, 3.0, 23.7));
        System.out.println("_____________________________________________________________________________________");
        fastRun.adicionarMoto(new Moto("Moto","Suzuki1", "S23RT1", 85, 4.1, 29.5));
        fastRun.adicionarMoto(new Moto("Moto","Suzuki2", "S23RT2", 95, 4.3, 29.5));
        fastRun.adicionarMoto(new Moto("Moto","Suzuki3", "S23RT3", 155, 4.5, 29.5));
        fastRun.adicionarMoto(new Moto("Moto","Suzuki4", "S23RT4", 115, 4.7, 29.5));
        System.out.println("_____________________________________________________________________________________");
        fastRun.adicionarCarro(new Carro("Carro","Subaru5", "Pkjxk", 145, 4, 25));
        fastRun.adicionarCarro(new Carro("Carro","Subaru6", "Pkjxk1", 95, 4, 25));
        fastRun.adicionarMoto(new Moto("Moto","Suzuki5", "H8PE332", 130, 3.2, 23.7));
        fastRun.adicionarMoto(new Moto("Moto","Suzuki6", "H8PE33", 130, 3.2, 23.7));

        System.out.println("_____________________________________________________________________________________");
        fastRun.adicionarMoto(new Moto("Moto","Suzuki7", "H8PE332", 130, 3.2, 23.7));
        fastRun.adicionarCarro(new Carro("Carro","Subaru7", "Pkjxk1", 95, 4, 25));
        fastRun.adicionarCarro(new Carro("Carro","Subaru8", "Pkjxk1", 95, 4, 25));
        fastRun.adicionarMoto(new Moto("Moto","Suzuki8", "H8PE33", 130, 3.2, 23.7));
        System.out.println("_____________________________________________________________________________________");

        fastRun.listarVeiculosDaCorrida();
        System.out.println("_________________________________________________________________________________________________________________________________");

        socorristaCarro.socorrerCarro(fastRun.veiculos.get(2));
        socorristaMoto.socorrerMoto(fastRun.veiculos.get(6));
        socorristaMoto.socorrerMoto(fastRun.veiculos.get(9));
        socorristaCarro.socorrerCarro(fastRun.veiculos.get(3));
        System.out.println("_____________________________________________________________________________________");

        fastRun.removeVeiculoComPlaca("S23RT2");
        fastRun.removerVeiculo(fastRun.veiculos.get(3));

        System.out.println("_________________________________________________________________________________________________________________________________");
        fastRun.listarVeiculosDaCorrida();
        System.out.println("_________________________________________________________________________________________________________________________________");


        System.out.println("\nO melhor desempenho com a pontuacão: " + fastRun.desempenhoCorrida(fastRun.vencedorCorrida()) + ", foi do veiculo: \n");
        System.out.println(fastRun.vencedorCorrida());
        System.out.println("\n________________________________________________________________________________________________________________________________");
    }

    }
