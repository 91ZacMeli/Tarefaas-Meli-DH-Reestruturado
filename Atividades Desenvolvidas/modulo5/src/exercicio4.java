import java.util.Scanner;

//Exercício Nº 4
//        Um pesquisador conduziu uma pesquisa com 50 pessoas para descobrir quantas
//        delas têm assinaturas de jornais digitais. Para fazer isso, ele selecionou 3 jornais
//        digitais: Diário A, Diário B e Diário C.
//        Ao mesmo tempo, o entrevistador quer um programa que, a partir da digitação
//        dos dados já coletados no teclado, permita determinar os seguintes dados
//        estatísticos dessas 50 pessoas:
//        ● Quantos são assinantes dos 3 jornais?
//        ● Quantos são assinantes do Diário A e Diário C?
//        ● Quantos são assinantes do Diário A e Diário B?
//        ● Quantos são assinantes do Diário B e Diário C?
//        ● Quantos são assinantes apenas do Jornal A?

public class exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] assinaturas = {1,2,3,4,5};
        int somaTodos = 0;
        int somaA_c = 0;
        int somaA_b = 0;
        int somaB_c = 0;
        int somaA= 0;
        int x;

        for(int i = 0;i<50; i++) {
            System.out.println("Digite o numero Correspondente de 1 a 5");
            System.out.println("Quais jornais o entrevistado lê?\n\n1 todos os Jornais,\n2 joranal A e jornal C,\n3 jornal A e jornal B, \n4 joranal B e jornal C\n5 apenas o Jornal A?");
            x = entrada.nextInt();
            if(x>0 && x<6) {
                if (assinaturas[x - 1] == 1) {
                    somaTodos += 1;
                } else if (assinaturas[x - 1] == 2) {
                    somaA_c += 1;
                } else if (assinaturas[x - 1] == 3) {
                    somaA_b += 1;
                } else if (assinaturas[x - 1] == 4) {
                    somaB_c += 1;
                } else if (assinaturas[x - 1] == 5) {
                    somaA += 1;
                }
                }else {
                System.out.println("Valor inválido !!!\n");
                i--;
            }
        }
        System.out.println("São "+ somaTodos+" Assinantes de todos os Jornais");
        System.out.println("São "+ somaA_c+" Assinantes do jornal A e C");
        System.out.println("São "+ somaA_b+" Assinantes do jornal A e B");
        System.out.println("São "+ somaB_c+" Assinantes do jornal B e C");
        System.out.println("São "+ somaA+" Assinantes apenas do jornal A");
    }
}
