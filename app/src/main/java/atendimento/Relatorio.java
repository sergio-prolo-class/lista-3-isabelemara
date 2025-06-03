package atendimento;

public class Relatorio {
    private SistemaAtendimento sistema;

    public Relatorio(SistemaAtendimento sistema) {
        this.sistema = sistema;
    }

    public void exibirRelatorio() {
        int total = sistema.getTotalSolicitacoes();
        int atendidas = sistema.getAtendidas();
        int emEspera = sistema.getEmEspera();

        System.out.println("\n===== Relatório =====");
        System.out.println("Total de solicitações registradas: " + total);
        System.out.println("Total de atendidas: " + atendidas);
        System.out.println("Total em espera: " + emEspera);

        if (total > 0) {
            System.out.println("\nDistribuição percentual por categoria:");
            System.out.printf("Suporte Técnico: %.2f%%\n", (sistema.getSuporteTecnico() * 100.0) / total);
            System.out.printf("Informação: %.2f%%\n", (sistema.getInformacao() * 100.0) / total);
            System.out.printf("Atendimento Financeiro: %.2f%%\n", (sistema.getAtendimentoFinanceiro() * 100.0) / total);
        } else {
            System.out.println("\nNenhuma solicitação registrada.");
        }
        System.out.println("======================\n");
    }
}
