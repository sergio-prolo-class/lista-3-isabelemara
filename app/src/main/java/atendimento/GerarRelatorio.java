package atendimento;

/**
 * Classe responsável por exibir o relatório geral das solicitações.
 */
public class GerarRelatorio {
    private GerenciadorSolicitacoes gerenciador;

    public GerarRelatorio(GerenciadorSolicitacoes gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void exibir() {
        int total = gerenciador.getTotalSolicitacoes();
        int atendidas = gerenciador.getAtendidos().size();
        int emEspera = gerenciador.getFilaEspera().size();

        System.out.println("\n===== Relatório =====");
        System.out.println("Total de solicitações registradas: " + total);
        System.out.println("Total de atendidas: " + atendidas);
        System.out.println("Total em espera: " + emEspera);

        if (total > 0) {
            System.out.println("\nDistribuição percentual por categoria:");
            System.out.printf("Suporte Técnico: %.2f%%\n", (gerenciador.getSuporteTecnico() * 100.0) / total);
            System.out.printf("Informação: %.2f%%\n", (gerenciador.getInformacao() * 100.0) / total);
            System.out.printf("Atendimento Financeiro: %.2f%%\n", (gerenciador.getAtendimentoFinanceiro() * 100.0) / total);
        } else {
            System.out.println("\nNenhuma solicitação registrada.");
        }

        System.out.println("======================\n");
    }
}
