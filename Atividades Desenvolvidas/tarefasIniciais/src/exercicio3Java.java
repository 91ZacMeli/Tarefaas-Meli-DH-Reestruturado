import java.util.Scanner;

public class exercicio3Java {
    public static void main(String[] args) {
//        Exercício Nº 3
//        Um gerente de comunidade deseja veicular uma campanha publicitária para um de seus
//        clientes no Instagram. Para isso, você precisa de um aplicativo que seja capaz de calcular
//        o custo total da campanha a partir da concessão do número de dias de duração.
//                O preço por dia de campanha é de $ 2 dólares fixos. Execute um programa que, após
//        inserir o número de dias, retorne o valor total na tela.
//                Por exemplo: 5 dias de campanha → $ 2 * 5 = $ 10
//●                            8 dias de campanha → $ 2 * 8 = $ 16

        Scanner teclado = new Scanner(System.in);
        int custoTotal;
        int diasDeDuracao;
        final int precoDiario =2;
        System.out.println("Quantos dias de concessao?");
        diasDeDuracao = teclado.nextInt();
        custoTotal = diasDeDuracao * precoDiario;
        System.out.println("$"+custoTotal);
    }
}
