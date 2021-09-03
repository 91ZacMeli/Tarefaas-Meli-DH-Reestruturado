public class AnimalDomestico extends AnimalPaciente{

    public AnimalDomestico() {
        super();
    }

    public AnimalDomestico(int numeroPaciente, String especie, String raca, String cor, String datedataNascimento, String nome,Proprietario dono) {
        super(numeroPaciente, especie, raca, cor, datedataNascimento, nome,dono);
    }
}
