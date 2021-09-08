package excecoes.model;

import excecoes.LoginException;

import java.time.LocalDate;

public class Cliente implements UsuarioAutenticavel {


    private DadosAutenticacao dadosAutenticacao;
    private String nome;
    private LocalDate dataNascimento;

    public Cliente(String nome, LocalDate dataNascimento) {
        super();
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Cliente(String login, String senha) {
        dadosAutenticacao = new DadosAutenticacao(login, senha);
    }

    @Override
    public void autentica(String login, String senha) {
        if(login.equals(dadosAutenticacao.getLogin()) && senha.equals(dadosAutenticacao.getSenha()))
            System.out.println("usuario logado");
        else {
            throw new LoginException("Erro no login");
        }
    }
    public String getNome() {
        return nome;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }



}
