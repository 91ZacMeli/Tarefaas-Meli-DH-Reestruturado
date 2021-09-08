package excecoes;

import excecoes.Service.ClienteService;
import excecoes.model.Cliente;

import java.time.LocalDate;
import java.util.List;

public class TesteStatic {
    public static void main(String[] args) {
        ClienteService service1 = new ClienteService();

        service1.adiciona(new Cliente("kenyo", LocalDate.parse("1980-02-25")));
        service1.adiciona(new Cliente("mauri", LocalDate.parse("1980-02-25")));
        service1.adiciona(new Cliente("filipe", LocalDate.parse("1980-02-25")));


        ClienteService service2 = new ClienteService();
        List<Cliente> listagem = service2.listagem();

        for (Cliente cliente : listagem) {
            System.out.println(cliente.getNome());
        }

        System.out.println("programa finalizado");
    }
}
