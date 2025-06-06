package atendimento;

/**
 * Classe responsável por atender o próximo cliente na fila de espera.
 */
public class AtenderProximoCliente {
    private GerenciadorSolicitacoes gerenciador;

    /**
     * Construtor que recebe o gerenciador de solicitações como dependência.
     *
     * gerenciador Instância central que gerencia dados de atendimento.
     */
    public AtenderProximoCliente(GerenciadorSolicitacoes gerenciador) {
        this.gerenciador = gerenciador;
    }

    /**
     * Remove o próximo cliente da fila e o adiciona à lista de atendidos.
     * Caso a fila esteja vazia, exibe mensagem apropriada.
     */
    public void atender() {
        Solicitacao solicitacao = gerenciador.getFilaEspera().poll(); // Remove o primeiro da fila
        if (solicitacao != null) {
            gerenciador.getAtendidos().add(solicitacao); // Adiciona à lista de atendidos
            System.out.println("Atendido: " + solicitacao.getCliente().getNome());
        } else {
            System.out.println("Nenhum cliente na fila.");
        }
    }
}
