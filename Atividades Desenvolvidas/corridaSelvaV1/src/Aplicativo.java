import java.util.ArrayList;
import java.util.List;

public class Aplicativo {
    public static void main(String[] args) {

        Categoria categoria = new Categoria();
        List<Participante>participantes=new ArrayList<>();

        participantes.add( new Participante("44.444.444-4", "Iosaias", "Oliveira", 19, 998877665, 467788989, "O-"));
        participantes.add( new Participante("44.444.444-4", "Isakias", "Oliveira", 18, 998877665, 467788989, "O-"));
        participantes.add( new Participante("44.444.444-4", "MaIsaias", "Oliveira", 27, 998877665, 467788989, "O-"));
        participantes.add( new Participante("44.444.444-4", "ROsaias", "Oliveira", 32, 998877665, 467788989, "O-"));
        participantes.add( new Participante("44.444.444-4", "MIsaias", "Oliveira", 31, 998877665, 467788989, "O-"));
        participantes.add( new Participante("54.244.244-2", "KIsac", "Santos", 13, 948877665, 465758981, "A+"));
        participantes.add( new Participante("63.434.443-3", "NIrael", "Silva", 22, 978877652, 469688983, "AB-"));

        categoria.inscreveMaratonista("pequeno",participantes.get(0));
        categoria.inscreveMaratonista("médio",participantes.get(1));
        categoria.inscreveMaratonista("pequeno",participantes.get(2));
        categoria.inscreveMaratonista("médio",participantes.get(3));
        categoria.inscreveMaratonista("grande",participantes.get(4));
        categoria.inscreveMaratonista("grande",participantes.get(5));
        categoria.inscreveMaratonista("pequeno",participantes.get(6));

        categoria.mostraListaPorCategoria("pequeno");

        categoria.mostraListaPorCategoria("médio");

        categoria.mostraListaPorCategoria("grande");

        categoria.cancelaInscricao("pequeno",1);

        categoria.mostraListaPorCategoria("pequeno");

    }

}

