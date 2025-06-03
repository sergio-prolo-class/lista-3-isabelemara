package login;

/**
 * Realiza a autenticação de um usuário.
 */
public class AutenticarUsuario {
    private SistemaLogin sistema;

    public AutenticarUsuario(SistemaLogin sistema) {
        this.sistema = sistema;
    }

    public void executar(String login, String senha) {
        if (sistema.autenticar(login, senha)) {
            System.out.println("Autenticação bem-sucedida!");
        } else {
            System.out.println("Erro: login ou senha incorretos.");
        }
    }
}
