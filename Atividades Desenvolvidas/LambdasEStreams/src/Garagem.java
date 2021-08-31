import java.util.ArrayList;
import java.util.List;

public class Garagem {
    private int id;
    private List<Veiculo> listaVeiculos;

    public Garagem() {
    }

    public Garagem(int id, List<Veiculo> listaVeiculos) {
        this.id = id;
        this.listaVeiculos = listaVeiculos;
    }

    public Garagem(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }
    public void listarVeiculos(List<Veiculo>list){

    }
}
