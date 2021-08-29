import java.util.Scanner;

//Exercício Nº 2
//        Uma empresa de encomendas deseja atualizar os salários de seus funcionários. Para
//        isso, pretendem a criação de um programa que, ao atribuir um RG e um montante,
//        determine se o empregado em questão tem ou não direito a um acréscimo. Para isso,
//        leva em consideração as seguintes condições:
//        a. Se o salário for menor ou igual a $ 20.000, um aumento de 20% corresponde a ele.
//        b. Se o salário for maior que $ 20.000, mas menor ou igual a $ 45.000, um aumento de
//        10% corresponderá.
//        c. Se o salário for maior que $ 45.000, um aumento de 5% corresponde a ele.
//        Execute um programa que determine o percentual de aumento de um funcionário a partir
//        da entrada dos dados mencionados acima

public class exercicio2 {
    public static void main(String[] args) {

        double salario;
        double percentualDeAumento;
        char continua = 'S';
        boolean continuar = true;
        Scanner entrada = new Scanner(System.in);

        do{
            System.out.println("Qual o Salário do Funcionário");
            salario = entrada.nextDouble();
            if (salario < 20000) {
                percentualDeAumento = 0.2;
                salario = salario + (salario * percentualDeAumento);
                System.out.println("O percentual de aumento foi de "+percentualDeAumento*100+"%");
                System.out.println("O novo salário será: "+ salario);
            } else if (salario < 45000) {
                percentualDeAumento = 0.1;
                salario = salario + (salario * percentualDeAumento);
                System.out.println("O percentual de aumento foi de "+percentualDeAumento*100+"%");
                System.out.println("O novo salário será: "+ salario);
            } else {
                percentualDeAumento = 0.05;
                salario = salario + (salario * percentualDeAumento);
                System.out.println("O percentual de aumento foi de "+percentualDeAumento*100+"%");
                System.out.println("O novo salário será: "+ salario);
            }
            System.out.println(" Deseja Continuar? S / N");
            continua = entrada.next().toUpperCase().charAt(0);
            if(continua == 'N')
                continuar = false;
        }while (continuar);
    }
}
