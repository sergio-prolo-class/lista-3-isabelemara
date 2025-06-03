package atendimento;

public class VerProximo {
    private GerenciadorSolicitacoes gerenciador;

    public VerProximo(GerenciadorSolicitacoes gerenciador) {
        this.gerenciador = gerenciador;
    }

    // Método que você precisa criar
    public void ver() {
        Solicitacao solicitacao = gerenciador.getFilaEspera().peek();
        if (solicitacao != null) {
            System.out.println("Próximo cliente: " + solicitacao.getCliente().getNome());
        } else {
            System.out.println("Nenhum cliente na fila.");
        }
    }
}
