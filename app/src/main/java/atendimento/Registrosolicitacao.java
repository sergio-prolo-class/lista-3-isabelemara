package atendimento;

import java.util.Scanner;

public class Registrosolicitacao {
    private SistemaAtendimento sistema;
    private Scanner sc;

    public Registrosolicitacao(SistemaAtendimento sistema, Scanner sc) {
        this.sistema = sistema;
        this.sc = sc;
    }

    public void registrar() {
        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("Telefone do cliente (único): ");
        String telefone = sc.nextLine();

        System.out.println("\nEscolha a categoria da solicitação:");
        System.out.println("1 - Suporte Técnico");
        System.out.println("2 - Informação");
        System.out.println("3 - Atendimento Financeiro");
        System.out.print("Opção: ");
        int opcaoCategoria = sc.nextInt();
        sc.nextLine(); // Limpa o buffer

        String categoria = switch (opcaoCategoria) {
            case 1 -> "Suporte Técnico";
            case 2 -> "Informação";
            case 3 -> "Atendimento Financeiro";
            default -> {
                System.out.println("Opção inválida! Categoria definida como Informação.");
                yield "Informação";
            }
        };

        System.out.print("Descrição da solicitação: ");
        String descricao = sc.nextLine();

        sistema.registrarSolicitacao(nome, telefone, descricao, categoria);
    }
}
