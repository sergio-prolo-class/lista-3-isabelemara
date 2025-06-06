package login;

/**
 * Responsável pelo cadastro de novos usuários.
 * Verifica se o login já existe e, se não, cadastra o novo usuário.
 */
public class CadastrarUsuario {
    private SistemaLogin sistema;

    /**
     * Construtor que recebe o sistema de login para manipular os usuários.
     */
    public CadastrarUsuario(SistemaLogin sistema) {
        this.sistema = sistema;
    }

    /**
     * Executa o cadastro do usuário com login e senha informados.
     * Exibe mensagem de sucesso ou erro caso o login já exista.
     */
    public void executar(String login, String senha) {
        if (sistema.cadastrarUsuario(login, senha)) {
            System.out.println("Usuário cadastrado com sucesso!");
        } else {
            System.out.println("Erro: login já cadastrado.");
        }
    }
}
