package login;

import java.util.Scanner;

/**
 * Classe que exibe o menu principal do sistema e direciona as operações.
 * Utiliza Scanner para leitura de entradas do usuário.
 */
public class Menu {
    private SistemaLogin sistema = new SistemaLogin(); // Gerencia os usuários
    private Scanner sc = new Scanner(System.in);

    /**
     * Exibe o menu com opções e executa a ação escolhida pelo usuário.
     * Loop até que o usuário escolha sair (opção 0).
     */
    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Remover Usuário");
            System.out.println("3 - Listar Usuários");
            System.out.println("4 - Autenticar Usuário");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1 -> {
                    System.out.print("Login: ");
                    String login = sc.nextLine();
                    System.out.print("Senha: ");
                    String senha = sc.nextLine();
                    new CadastrarUsuario(sistema).executar(login, senha);
                }
                case 2 -> {
                    System.out.print("Login para remover: ");
                    String login = sc.nextLine();
                    new RemoverUsuario(sistema).executar(login);
                }
                case 3 -> new ListarUsuarios(sistema).executar();
                case 4 -> {
                    System.out.print("Login: ");
                    String login = sc.nextLine();
                    System.out.print("Senha: ");
                    String senha = sc.nextLine();
                    new AutenticarUsuario(sistema).executar(login, senha);
                }
                case 0 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
