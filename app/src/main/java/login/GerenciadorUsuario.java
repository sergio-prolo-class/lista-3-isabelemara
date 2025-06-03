package login;

/**
 * Esta classe executa as ações solicitadas pelo menu:
 * cadastrar, remover, autenticar e listar usuários.
 * Ela serve como intermediária entre o menu e o SistemaLogin.
 */
public class GerenciadorUsuario {
    private SistemaLogin sistema = new SistemaLogin(); // Contém os dados dos usuários

    // Cadastra um novo usuário (chama o SistemaLogin)
    public void cadastrar(String login, String senha) {
        if (!sistema.cadastrarUsuario(login, senha)) {
            System.out.println("Erro: usuário já existe.");
        }
    }

    // Remove um usuário existente
    public void remover(String login) {
        if (!sistema.removerUsuario(login)) {
            System.out.println("Erro: usuário não encontrado.");
        }
    }

    // Lista os usuários cadastrados
    public void listar() {
        sistema.listarUsuarios();
    }

    // Autentica um usuário com login e senha
    public void autenticar(String login, String senha) {
        if (!sistema.autenticar(login, senha)) {
            System.out.println("Erro: login ou senha inválidos.");
        }
    }
}
