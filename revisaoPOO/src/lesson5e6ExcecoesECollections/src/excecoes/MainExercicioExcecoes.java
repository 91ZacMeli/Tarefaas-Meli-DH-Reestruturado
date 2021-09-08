package excecoes;

import excecoes.Service.ClienteService;
import excecoes.model.Cliente;

import java.time.LocalDate;
import java.util.Scanner;

public class MainExercicioExcecoes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ClienteService clienteService = new ClienteService();

        while(true) {
            System.out.println("\nentre com o nome do cliente");
            String nome = console.nextLine();
            System.out.println("\nentre com a data de nascimento do cliente");
            String dataNascimento = console.nextLine();

            if(nome.equalsIgnoreCase("exit") || dataNascimento.equalsIgnoreCase("exit")) {
                console.close();
                System.exit(0);
            }
            try {
                Cliente cliente = new Cliente(nome, LocalDate.parse(dataNascimento));
                clienteService.adiciona(cliente);
                System.out.println("cliente cadastrado com sucesso!!!\n\n");
            }catch(ClienteMenorIdadeException | ClienteExistenteException e) {
                System.out.println(e.getMessage());
                continue;
            }
        }
    }
}
