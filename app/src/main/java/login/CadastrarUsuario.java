package login;

/**
 * Realiza o cadastro de um novo usuário.
 */
public class CadastrarUsuario {
    private SistemaLogin sistema;

    public CadastrarUsuario(SistemaLogin sistema) {
        this.sistema = sistema;
    }

    public void executar(String login, String senha) {
        if (sistema.cadastrarUsuario(login, senha)) {
            System.out.println("Usuário cadastrado com sucesso!");
        } else {
            System.out.println("Erro: login já cadastrado.");
        }
    }
}
