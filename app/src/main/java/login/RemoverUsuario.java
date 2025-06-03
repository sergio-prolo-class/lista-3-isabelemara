package login;

/**
 * Remove um usuário a partir do login.
 */
public class RemoverUsuario {
    private SistemaLogin sistema;

    public RemoverUsuario(SistemaLogin sistema) {
        this.sistema = sistema;
    }

    public void executar(String login) {
        if (sistema.removerUsuario(login)) {
            System.out.println("Usuário removido com sucesso!");
        } else {
            System.out.println("Erro: usuário não encontrado.");
        }
    }
}
