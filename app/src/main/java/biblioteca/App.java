package biblioteca;

/**
 * Classe principal que inicia o sistema da biblioteca.
 * Executa o menu principal chamando a classe Menu.
 */
public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.exibirMenu();
    }
}
