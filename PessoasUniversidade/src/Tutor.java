public class Tutor extends Aluno implements AtividadeExtraTutor{
    public Tutor(String nome, String sobrenome, String cpf, int idade, int telefone) {
        super(nome, sobrenome, cpf, idade, telefone);
    }

    @Override
    public void ensinaAlgo() {

    }
}
