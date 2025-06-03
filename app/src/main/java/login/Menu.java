package login;

import java.util.Scanner;

public class Menu {
    private SistemaLogin sistema = new SistemaLogin();
    private Scanner sc = new Scanner(System.in);

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
            sc.nextLine();  // Limpar buffer

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    remover();
                    break;
                case 3:
                    listar();
                    break;
                case 4:
                    autenticar();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private void cadastrar() {
        System.out.print("Digite o login: ");
        String login = sc.nextLine();
        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();
        sistema.cadastrarUsuario(login, senha);
    }

    private void remover() {
        System.out.print("Digite o login para remover: ");
        String login = sc.nextLine();
        sistema.removerUsuario(login);
    }

    private void listar() {
        sistema.listarUsuarios();
    }

    private void autenticar() {
        System.out.print("Digite o login: ");
        String login = sc.nextLine();
        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();
        sistema.autenticar(login, senha);
    }
}
