package atendimento;

/**
 * Classe principal da aplicação.
 * Responsável por inicializar o sistema e exibir o menu principal.
 */
public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.exibirMenu(); // Inicia a interface de interação com o usuário
    }
}
