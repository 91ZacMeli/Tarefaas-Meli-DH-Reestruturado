public class Main {

        public static void main(String[] args) {

            Pessoa pessoa = new Pessoa();
            Pessoa pessoa1 = new Pessoa("Iago",23,1);
            Pessoa pessoa2 = new Pessoa("Carla", 18, 2, 90.0, 1.80);

//            Pessoa Marcela = new Pessoa("Marcela",21);
//            Não é possivel criar pois não tem método construtor com apenas esses dois parametros


            System.out.println("___________________________________________________________");
            if (pessoa2.eMaiorDeIdade()) {
                System.out.print(pessoa2.nome+" é maior de idade\n");
            }else {
                System.out.print(pessoa2.nome+" é  menor de idade\n");
            }
            switch (pessoa2.calcularIMC()){
                case 1:
                    System.out.println(pessoa2.nome+" está com Sobrepeso!");
                    break;
                case -1:
                    System.out.println(pessoa2.nome+" esta abaixo do peso");
                    break;
                case 0:
                    System.out.println(pessoa2.nome+" Seu Peso é saudável");
                    break;
                default:
                    System.out.println("Inválido");
                    break;
        }
            System.out.println("___________________________________________________________");
            System.out.println("\n"+pessoa2.toString());
            System.out.println("___________________________________________________________");
    }
}
