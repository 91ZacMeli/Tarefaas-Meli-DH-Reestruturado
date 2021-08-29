import java.util.Scanner;

//Exercício Nº 3
//        Uma empresa de serviços de segurança tem 7 clientes que pagam a taxa por dois tipos
//        possíveis de serviço todos os meses:
//        Serviço 1: Segurança com câmeras - Preço fixo de US $ 1.500 por mês
//        Serviço 2: Câmera de segurança + patrulha - Preço de $ 1500 + $ 700 para
//        serviço de patrulha
//        Dependendo do tipo de serviço, pretende-se poder calcular o valor final da fatura de
//        cada um dos 7 clientes e informar o valor final a pagar no ecrã de cada um deles.

public class exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double servico1 = 1500.0;
        double servico2 = 2200.0;
        int opcao;

        for (int i = 0; i<7; i++){
            System.out.println("Qual o Serviço contratado 1 ou 2 ?");
            opcao = entrada.nextInt();
            if(opcao == 1){
                System.out.println("O valor da Sua fatura do cliente "+ (i +1)+ " é : "+ servico1);
            }
            else if(opcao == 2){
                System.out.println("O valor da Sua faturado cliente "+ (i+1) + " é : "+ servico2);
            }else{
                System.out.println("Código invalido, tente novamente");
                i--;
            }
        }

    }
}
