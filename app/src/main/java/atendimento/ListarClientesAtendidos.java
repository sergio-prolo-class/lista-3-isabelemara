package atendimento;

import java.util.List;

/**
 * Classe responsável por listar os clientes que já foram atendidos.
 */
public class ListarClientesAtendidos {
    private GerenciadorSolicitacoes gerenciador;

    public ListarClientesAtendidos(GerenciadorSolicitacoes gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void listar() {
        List<Solicitacao> atendidos = gerenciador.getAtendidos();

        if (atendidos.isEmpty()) {
            System.out.println("Nenhum cliente atendido ainda.");
            return;
        }

        System.out.println("Clientes atendidos:");
        for (Solicitacao solicitacao : atendidos) {
            System.out.println(solicitacao.getCliente().getNome());
        }
    }
}
