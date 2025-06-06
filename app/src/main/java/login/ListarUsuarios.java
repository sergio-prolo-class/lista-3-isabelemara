package login;

/**
 * Classe responsável por listar os usuários cadastrados no sistema.
 */
public class ListarUsuarios {
    private SistemaLogin sistema;

    /**
     * Construtor que recebe o sistema para acessar a lista de usuários.
     * @param sistema Sistema que mantém os usuários cadastrados.
     */
    public ListarUsuarios(SistemaLogin sistema) {
        this.sistema = sistema;
    }

    /**
     * Executa a listagem dos usuários cadastrados.
     * Exibe uma mensagem caso não haja usuários.
     */
    public void executar() {
        sistema.listarUsuarios();
    }
}
