import java.util.Scanner;

//Exercício Nº 1
//          Uma loja de roupas compra seus produtos em 3 fábricas diferentes emtodo o país. Para
//        determinar o preço de venda de cada uma das peças, é necessário adicionar, ao preço
//        de custo, uma porcentagem (%) equivalente ao valor do frete dependendo do que você
//        comprou. Para fazer isso, o vendedor atualmente usa a seguinte tabela de valores:
//        A partir disso, o lojista precisa, a partir do preço de custo do produto e do número de
//        fábrica da qual o adquiriu, obter o valor estimado de venda como resultado, levando em
//        consideração que além do percentual do custo de frete, um 25% extra que corresponde
//        ao lucro que deseja obter.
//        Desenvolva um programa que torne mais fácil para o profissional realizar essa tarefa.

public class exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double precoCusto;
        double custoMaisEnvio;
        double precoVenda;
        double margemLucro = 0.25;
        final double[] fretes = {0.07,0.15,0.22};
        int idLoja;
        char continua;
        boolean continuar = true;

        do {
            System.out.println("Qual o preço de custo? ");
            precoCusto = entrada.nextDouble();
            System.out.println("Para qual loja? 1, 2 ou 3?");
            idLoja = entrada.nextInt();
            custoMaisEnvio = precoCusto+(precoCusto * fretes[idLoja-1]);
            precoVenda = custoMaisEnvio+(custoMaisEnvio*margemLucro);
            System.out.println("O preço de venda deve ser: "+precoVenda);
            System.out.println("Deseja Continuar calculando? S/N");
            continua = entrada.next().toUpperCase().charAt(0);
                if(continua=='N')
                    continuar = false;
        }while(continuar);
    }
}
