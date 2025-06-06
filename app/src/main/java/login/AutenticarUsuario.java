package login;

/**
 * Responsável por realizar a autenticação de um usuário.
 *
 * Recebe o sistema de login e executa a autenticação com login e senha fornecidos.
 */
public class AutenticarUsuario {
    private SistemaLogin sistema;

    /**
     * Construtor que recebe a instância do sistema de login para acessar os dados.
     * @param sistema Objeto que gerencia usuários cadastrados.
     */
    public AutenticarUsuario(SistemaLogin sistema) {
        this.sistema = sistema;
    }

    /**
     * Método que tenta autenticar o usuário com login e senha.
     * Exibe mensagens de sucesso ou erro.
     */
    public void executar(String login, String senha) {
        if (sistema.autenticar(login, senha)) {
            System.out.println("Autenticação bem-sucedida!");
        } else {
            System.out.println("Erro: login ou senha incorretos.");
        }
    }
}
