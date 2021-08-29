import java.util.Scanner;

public class exercicio4Java {
    public static void main(String[] args) {
//        Exercício Nº 4
//        Morador de uma pequena cidade soube pela mídia que é o vencedor da loteria de seu
//        país. O prêmio total é de $ 23.563.899, no entanto, uma série de impostos deve ser
//        aplicada a este valor a fim de conceder o prêmio final. Esses descontos fiscais incluem:
//● Imposto 1 → 2,45% sobre o valor total
//● Imposto 2 → 15% sobre o valor total
//● Imposto 3 → 3% sobre o valor total
//        Realizar um programa que dê a qualquer cidadão a possibilidade de inserir o valor bruto
//        do prémio e calcular a partir dele, o valor total que lhe corresponde a título de prémio em
//        função dos descontos. Lembre-se de que todas as porcentagens de desconto são
//        calculadas SOBRE O VALOR TOTAL.

        double premioTotal;
        double premioLiquido;
        double imposto1 = 0.0245;
        double imposto2 = 0.15;
        double imposto3 = 0.03;
        double totalEmImpostos;
        Scanner recebeValor = new Scanner(System.in);

        System.out.println("Entre com o valor bruto da premiacão");
        premioTotal = recebeValor.nextDouble();
        totalEmImpostos = (premioTotal * imposto1) + (premioTotal * imposto2) + (premioTotal * imposto3);
        premioLiquido = premioTotal - totalEmImpostos;

        System.out.println("O valor líquido a receber é : " + premioLiquido);
      }
}
