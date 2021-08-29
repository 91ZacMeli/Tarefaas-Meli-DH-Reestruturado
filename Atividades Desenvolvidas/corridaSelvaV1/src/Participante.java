import java.util.ArrayList;
import java.util.HashMap;

public class Participante {
    HashMap<String, ArrayList<Integer>> controle = new HashMap<>();
    // atributos da classe.
    public Integer inscricao;
    private String rg;
    private String nome;
    private double valorInscricao;
    private String sobrenome;
    private int idade;
    private int telCelelular;
    private int numEmercencia;
    private String grupoSanguineo;
    private boolean ehMaiorDeIdade;

    public Participante(String rg, String nome, String sobrenome, int idade, int telCelelular, int numEmercencia, String grupoSanguineo) {
        this.rg = rg;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.telCelelular = telCelelular;
        this.numEmercencia = numEmercencia;
        this.grupoSanguineo = grupoSanguineo;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "inscricao=" + inscricao +
                ", rg='" + rg + '\'' +
                ", nome='" + nome + '\'' +
                ", valorInscricao=" + valorInscricao +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", telCelelular=" + telCelelular +
                ", numEmercencia=" + numEmercencia +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                ", ehMaiorDeIdade=" + ehMaiorDeIdade +
                '}';
    }

    public Integer getInscricao() {
        return inscricao;
    }

    public void setInscricao(Integer inscricao) {
        this.inscricao = inscricao;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorInscricao() {
        return valorInscricao;
    }

    public void setValorInscricao(double valorInscricao) {
        this.valorInscricao = valorInscricao;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTelCelelular() {
        return telCelelular;
    }

    public void setTelCelelular(int telCelelular) {
        this.telCelelular = telCelelular;
    }

    public int getNumEmercencia() {
        return numEmercencia;
    }

    public void setNumEmercencia(int numEmercencia) {
        this.numEmercencia = numEmercencia;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public boolean isEhMaiorDeIdade() {
        return ehMaiorDeIdade;
    }

    public void setEhMaiorDeIdade(boolean ehMaiorDeIdade) {
        this.ehMaiorDeIdade = ehMaiorDeIdade;
    }
}
//    public void removerParticipante(String nomeCategoria, int participanteId) {
//        if (controle != null && controle.containsKey(nomeCategoria)) {
//            ArrayList<Integer> participantesDaCategoria = controle.get(nomeCategoria);
//            participantesDaCategoria.removeIf(e -> {
//                return e.equals(participanteId) ;
//            });
//            System.out.println("Participante excluido:");
//        }
//    }
//    public void registrarParticipante(Participante participante, Categoria categoria) {
//
//        if (participante.getInscricao() > 0) {
//            System.out.println("Participante ja cadastrado");
//            return;
//        }
//
//        if (!participante.ehMaiorDeIdade() && !categoria.isPermiteMenorDeIdade()) {
//            System.out.println("AQUI NAO PODE JUVENIL PARCA, so os brabo");
//            return;
//        }
//
//        // ja foi criada a categoria?
//        // se nao:
//        if (!controle.containsKey(categoria.getTipo())) {
//            participante.inscricao = 1;
//            controle.put(categoria.getTipo(), new ArrayList<>() {
//                {
//                    add(participante.inscricao);
//                }
//            });
//
//        } else { // se sim
//            ArrayList<Integer> participantesDaCategoria = controle.get(categoria.getTipo());
//            Integer novaInscricao = participantesDaCategoria.size() + 1;
//            participante.inscricao = novaInscricao;
//            participantesDaCategoria.add(participante.getInscricao());
//        }
//    }
//    public void printarParticipantes(Categoria categoria, List<Participante> nte) {
//        System.out.print("Categoria: " + categoria.getTipo());
//        System.out.print("Participantes:participantesDaCategoria");
//        List<Integer> participantesDaCategoria = controle.get(categoria);
//        if (participantesDaCategoria != null) {
//            for (int i = 0; i < participantesDaCategoria.size(); i++) {
//                System.out.print(participantesDaCategoria + " ");
//            }
//        }
//        System.out.println("");
//    }


