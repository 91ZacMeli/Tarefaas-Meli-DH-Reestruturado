import java.util.HashMap;
import java.util.Map;


public class Categoria {
    int inscricao = 1;

    HashMap<Integer,Participante> pequenoCircuito = new HashMap<>();
    HashMap<Integer,Participante> circuitoMedio = new HashMap<>();
    HashMap<Integer,Participante> grandeCircuito = new HashMap<>();

    //Método para inscrever maratonista
    public void inscreveMaratonista(String percurso, Participante participante){
        switch (percurso){
            case "pequeno":
                pequenoCircuito.put(inscricao++, participante);
                if(participante.getIdade() >= 18)
                    participante.setValorInscricao(1500.0);
                else
                 participante.setValorInscricao(1300.0);

                break;
            case "médio":
                circuitoMedio.put(inscricao++, participante);
                if(participante.getIdade()>=18){
                    participante.setValorInscricao(2300.0);
                }else{
                    participante.setValorInscricao(2000.0);
                }
                break;
            case"grande":
                if(participante.getIdade()>=18){
                    grandeCircuito.put(inscricao++, participante);
                    participante.setValorInscricao(2800.0);
                }else {
                    cancelaInscricao("grande",this.inscricao);
                }
                break;
        }

    }

    //Método para mostrar inscrições por categoria
    public void mostraListaPorCategoria(String percurso){
        System.out.println("__________________________________________________________________________________________________________________________________");

        switch (percurso){
            case "pequeno":
                System.out.println("\n***********CATEGORIA PEQUENO CIRCUÍTO**************");
                for (Map.Entry<Integer, Participante> pessoaEntry: pequenoCircuito.entrySet()) {
                    System.out.println(pessoaEntry.getKey()+" - "+ pessoaEntry.getValue().toString());
                }
                System.out.println("__________________________________________________________________________________________________________________________________");
                break;
            case "médio":
                System.out.println("***********CATEGORIA CIRCUÍTO MÉDIO**************");
                for (Map.Entry<Integer, Participante> pessoaEntry: circuitoMedio.entrySet()) {
                    System.out.println(pessoaEntry.getKey()+" - "+ pessoaEntry.getValue().toString());
                }
                System.out.println("__________________________________________________________________________________________________________________________________");
                break;
            case "grande":
                System.out.println("*********** CATEGORIA CIRCUÍTO GRANDE **************");
                for (Map.Entry<Integer, Participante> pessoaEntry: grandeCircuito.entrySet()) {
                    System.out.println(pessoaEntry.getKey()+" - "+ pessoaEntry.getValue().toString());
                }
                System.out.println("__________________________________________________________________________________________________________________________________");
                break;
        }
    }

    //Metodo para cancelar inscrição
    public void cancelaInscricao(String percurso, int numeroInscricao){
        switch (percurso){
            case "pequeno":
                pequenoCircuito.remove(numeroInscricao);
                System.out.println("Removido a inscricão: "+ numeroInscricao);
                break;
            case "médio":
                circuitoMedio.remove(numeroInscricao);
                System.out.println("Removido a inscricão: "+ numeroInscricao);
                break;
            case "grande":
                grandeCircuito.remove(numeroInscricao);
                System.out.println("Removido a inscricão: "+ numeroInscricao);
                break;
        }
    }
}