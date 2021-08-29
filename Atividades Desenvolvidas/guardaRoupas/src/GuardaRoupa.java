import java.util.HashMap;
import java.util.List;

public class GuardaRoupa {
    HashMap<Integer, List<Roupa>> gavetas = new HashMap<>();
    private int chave = 0;

    public Integer guardarRoupas(List<Roupa> listaRoupas){
        gavetas.put(++chave, listaRoupas);
        return chave;
    }
    public List<Roupa> devolverRoupas(int cod){
        List<Roupa> listaDeRoupas = gavetas.get(cod);
        gavetas.remove(cod);
        return listaDeRoupas;
    }
    public void mostrarRoupas(){
        for(Integer cod: gavetas.keySet()){
            List<Roupa> listaRoupas = gavetas.get(cod);
            for (Roupa roupa:listaRoupas){
                System.out.println(roupa.toString());
            }
        }
    }
}
