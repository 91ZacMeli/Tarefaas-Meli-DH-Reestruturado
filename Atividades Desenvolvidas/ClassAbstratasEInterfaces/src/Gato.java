public class Gato extends Animal implements Carnivoro{

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Miau... , Miau... ");
    }

    @Override
    public void ComeCarne() {
        System.out.println("Comendo Carne");
    }

}
