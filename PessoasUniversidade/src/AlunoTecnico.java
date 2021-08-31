public class AlunoTecnico extends Aluno implements AtividadeExtraAlunoTecnico {
    public AlunoTecnico(String nome, String sobrenome, String cpf, int idade, int telefone) {
        super(nome, sobrenome, cpf, idade, telefone);
    }

    @Override
    public void colaborarNoSuportetecnico() {

    }
}
