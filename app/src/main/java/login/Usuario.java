package login;

/**
 * Modelo simples de usuário contendo login e senha.
 */
public class Usuario {
    private String login;
    private String senha;

    /**
     * Construtor que inicializa o usuário com login e senha.
     */
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    /**
     * Retorna o login do usuário.

     */
    public String getLogin() {
        return login;
    }

    /**
     * Retorna a senha do usuário.

     */
    public String getSenha() {
        return senha;
    }
}
