package ClassAnimais;

public class Cachorro extends Animal implements Carnivoro{

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("UAU! UAU!");
    }

    @Override
    public void ComeCarne() {
        System.out.println("Comendo Carne");


    }
}
