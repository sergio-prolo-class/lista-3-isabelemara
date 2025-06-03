package atendimento;

/**
 * Classe responsável por atender o próximo cliente da fila.
 */
public class AtenderSolicitacao {
    private GerenciadorSolicitacoes gerenciador;

    public AtenderSolicitacao(GerenciadorSolicitacoes gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void atender() {
        Solicitacao solicitacao = gerenciador.getFilaEspera().poll();
        if (solicitacao != null) {
            gerenciador.getAtendidos().add(solicitacao);
            System.out.println("Atendido: " + solicitacao.getCliente().getNome());
        } else {
            System.out.println("Nenhum cliente na fila.");
        }
    }
}
