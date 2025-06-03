package login;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaLogin sistema = new SistemaLogin();

        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Fazer Login");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();  // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome de usuário: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite a senha: ");
                    String senha = sc.nextLine();
                    sistema.cadastrarUsuario(nome, senha);
                    break;
                case 2:
                    System.out.print("Digite o nome de usuário: ");
                    String nomeLogin = sc.nextLine();
                    System.out.print("Digite a senha: ");
                    String senhaLogin = sc.nextLine();
                    sistema.fazerLogin(nomeLogin, senhaLogin);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
