package atendimento;

import java.util.Scanner;

/**
 * Classe responsável por registrar uma nova solicitação no sistema.
 */
public class RegistrarSolicitacao {
    private GerenciadorSolicitacoes gerenciador;
    private Scanner sc;

    /**
     * Construtor da classe.
     *
     *  gerenciador Referência para o gerenciador central das solicitações.
     *  sc          Scanner para leitura dos dados no terminal.
     */
    public RegistrarSolicitacao(GerenciadorSolicitacoes gerenciador, Scanner sc) {
        this.gerenciador = gerenciador;
        this.sc = sc;
    }

    /**
     * Método que coleta os dados do usuário e registra a solicitação.
     */
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
        sc.nextLine(); // limpa o buffer

        // Determina a categoria com base na escolha
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

        // Envia os dados para o gerenciador registrar
        gerenciador.registrarSolicitacao(nome, telefone, descricao, categoria);
    }
}
