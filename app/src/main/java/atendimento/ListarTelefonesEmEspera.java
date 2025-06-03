package atendimento;

import java.util.Queue;

/**
 * Classe responsável por listar os telefones dos clientes na fila de espera.
 */
public class ListarTelefonesEmEspera {
    private GerenciadorSolicitacoes gerenciador;

    public ListarTelefonesEmEspera(GerenciadorSolicitacoes gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void listar() {
        Queue<Solicitacao> fila = gerenciador.getFilaEspera();

        if (fila.isEmpty()) {
            System.out.println("Nenhum cliente na fila.");
            return;
        }

        System.out.println("Telefones em espera:");
        for (Solicitacao solicitacao : fila) {
            System.out.println(solicitacao.getCliente().getTelefone());
        }
    }
}
