import java.util.HashMap;

public class Vaca extends Animal implements Herbivoro {

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Muuuhh...");
    }

    @Override
    public void ComeVegetais() {
        System.out.println("Comendo Capim");

    }
}
