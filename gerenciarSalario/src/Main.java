public class Main {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("José",4,3500.0,7000.0 );
        Vendedor vendedor2 = new Vendedor("Carlos", 7,4600.0,6000.0);

        Entregador entregador1 = new Entregador("Fábio", 3,2500.0,"zona 1");
        Entregador entregador2 = new Entregador("Joana", 7,3500.0,"zona 3");

        System.out.println("______________________________________________________________");
        System.out.println(" Salario Vendedor 1 não tem direito ao plus : "+ vendedor1.CalculePlus(vendedor1.getSalario(), vendedor2.getComissao()));
        System.out.println("______________________________________________________________");
        System.out.println(" Salario Vendedor 2 com o valor do plus incluso : "+ vendedor2.CalculePlus(vendedor2.getSalario(), vendedor2.getComissao()));
        System.out.println("______________________________________________________________");
        System.out.println(" Salario Entregador 1 não tem direito ao plus : "+ entregador1.CalculePlus(entregador1.getSalario(), entregador1.getZona()));
        System.out.println("______________________________________________________________");
        System.out.println(" Salario Entregador 2 com o valor do plus incluso : "+entregador2.CalculePlus(entregador2.getSalario(), entregador2.getZona()));
        System.out.println("______________________________________________________________");
    }
}
