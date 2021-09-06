package exemplo3;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        Funcionario kenyo = new Funcionario("kenyo", "m", 3000.1955);
        Funcionario mauri = new Funcionario("mauri", "m", 5000.198);
        Funcionario joice = new Funcionario("joice", "f", 7000.198);
        Funcionario filipe = new Funcionario("filipe", "m", 10000.198);
        Gerente thiago = new Gerente("thiago", "m", 13000.678);
        Vendedor ana = new Vendedor("ana carolina", "f", 20000.234, 100000.987);
        Desenvolvedor isac = new Desenvolvedor("Isac", "m", 20000, "zac@mail.com","radioNobre");
        Cliente cliente = new Cliente("cliente@mail.com", "123456");


        boolean autenticacaoisac = isac.autentica("nobre@mail.com", "radioNobre");
        boolean autenticacaoCliente = cliente.autentica("cliente@mail.com", "123456");

        System.out.println("autenticacao do isac: " + autenticacaoisac);
        System.out.println("autenticacao do cliente: " + autenticacaoCliente);

        Funcionario[] array = new Funcionario[7];
        array[0] = kenyo;
        array[1] = mauri;
        array[2] = joice;
        array[3] = filipe;
        array[4] = thiago;
        array[5] = ana;
        array[6] = isac;


        CalculadoraFolha folha = new CalculadoraFolha();
        double total = folha.calcula(array);

        System.out.println("total da folha de pagamento: " + total);


        FileOutputStream fos = new FileOutputStream("funcionarios.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.append(isac.toString());
        bw.newLine();
        bw.append(kenyo.toString());
        bw.newLine();
        bw.append(mauri.toString());
        bw.newLine();
        bw.append(joice.toString());
        bw.newLine();
        bw.append(filipe.toString());
        bw.newLine();
        bw.append(thiago.toString());
        bw.newLine();
        bw.append(ana.toString());
        bw.close();
    }
}
