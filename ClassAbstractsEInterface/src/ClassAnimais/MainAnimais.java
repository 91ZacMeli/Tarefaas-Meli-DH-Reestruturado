package ClassAnimais;

public class MainAnimais {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        Vaca vaca =  new Vaca();
        Gato gato = new Gato();

        System.out.println("__________________________________________________");
        cachorro.emitirSom();
        cachorro.ComeCarne();

        System.out.println("__________________________________________________");
        vaca.emitirSom();
        vaca.ComeVegetais();

        System.out.println("__________________________________________________");
        gato.emitirSom();
        gato.ComeCarne();
        System.out.println("__________________________________________________");

        cachorro.comerAnimal(vaca);
        System.out.println("__________________________________________________");

    }
   
}
