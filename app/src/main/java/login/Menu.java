package login;

import java.util.Scanner;

/**
 * Responsável por exibir o menu e capturar entradas do usuário.
 * Não realiza regras de negócio, apenas chama métodos do GerenciadorUsuario.
 */
public class Menu {
    private GerenciadorUsuario gerenciador = new GerenciadorUsuario(); // Lógica de usuários
    private Scanner sc = new Scanner(System.in); // Entrada de dados

    public void exibirMenu() {
        int opcao;
        do {
            // Exibe as opções do menu
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Remover Usuário");
            System.out.println("3 - Listar Usuários");
            System.out.println("4 - Autenticar Usuário");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();  // Limpa o buffer do teclado

            // Executa a opção escolhida
            switch (opcao) {
                case 1 -> {
                    System.out.print("Login: ");
                    String login = sc.nextLine();
                    System.out.print("Senha: ");
                    String senha = sc.nextLine();
                    gerenciador.cadastrar(login, senha);
                }
                case 2 -> {
                    System.out.print("Login para remover: ");
                    String login = sc.nextLine();
                    gerenciador.remover(login);
                }
                case 3 -> gerenciador.listar();
                case 4 -> {
                    System.out.print("Login: ");
                    String login = sc.nextLine();
                    System.out.print("Senha: ");
                    String senha = sc.nextLine();
                    gerenciador.autenticar(login, senha);
                }
                case 0 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0); // Repete até que o usuário escolha sair
    }
}
