package login;

/**
 * Lista os usuários cadastrados no sistema.
 */
public class ListarUsuarios {
    private SistemaLogin sistema;

    public ListarUsuarios(SistemaLogin sistema) {
        this.sistema = sistema;
    }

    public void executar() {
        sistema.listarUsuarios();
    }
}
