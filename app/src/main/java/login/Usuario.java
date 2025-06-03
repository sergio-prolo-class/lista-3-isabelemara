package login;

/**
 * Representa um usuário com login e senha.
 * Armazena os dados fornecidos no cadastro.
 */
public class Usuario {
    private String login;
    private String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}
