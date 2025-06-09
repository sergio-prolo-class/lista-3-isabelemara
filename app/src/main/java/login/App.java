package login;

/**
 * Classe principal que inicia o programa.
 *
 * Cria o menu principal e o exibe para interação com o usuário.
 */
public class App {
    public static void main(String[] args) {
        // Instancia o menu e inicia a interação
        Menu menu = new Menu();
        menu.exibirMenu();
    }
}
