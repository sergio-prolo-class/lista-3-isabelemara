package login;

/**
 * Classe responsável por remover um usuário do sistema a partir do login.
 */
public class RemoverUsuario {
    private SistemaLogin sistema;

    /**
     * Construtor que recebe o sistema para manipular os usuários.

     */
    public RemoverUsuario(SistemaLogin sistema) {
        this.sistema = sistema;
    }

    /**
     * Executa a remoção do usuário com o login informado.
     * Exibe mensagem de sucesso ou erro caso o usuário não exista.

     */
    public void executar(String login) {
        if (sistema.removerUsuario(login)) {
            System.out.println("Usuário removido com sucesso!");
        } else {
            System.out.println("Erro: usuário não encontrado.");
        }
    }
}
