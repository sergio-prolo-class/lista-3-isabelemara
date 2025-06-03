package atendimento;

import java.util.Map;

/**
 * Classe responsável por listar os telefones dos clientes cadastrados.
 */
public class ListarTelefonesClientes {
    private GerenciadorSolicitacoes gerenciador;

    public ListarTelefonesClientes(GerenciadorSolicitacoes gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void listar() {
        Map<String, Cliente> clientes = gerenciador.getClientes();

        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        System.out.println("Telefones dos clientes:");
        for (Cliente cliente : clientes.values()) {
            System.out.println(cliente.getTelefone() + " (" + cliente.getNome() + ")");
        }
    }
}
