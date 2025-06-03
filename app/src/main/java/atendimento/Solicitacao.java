package atendimento;

/**
 * Representa uma solicitação feita por um cliente.
 * Contém informações sobre o cliente, descrição e categoria do atendimento.
 */
public class Solicitacao {
    private Cliente cliente;
    private String descricao;
    private String categoria;

    /**
     * Construtor da solicitação.
     *
     * @param cliente    Cliente que fez a solicitação.
     * @param descricao  Descrição do problema ou pedido.
     * @param categoria  Categoria da solicitação (ex: Suporte Técnico, Informação).
     */
    public Solicitacao(Cliente cliente, String descricao, String categoria) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    // Retorna o cliente que fez a solicitação
    public Cliente getCliente() {
        return cliente;
    }

    // Retorna a descrição da solicitação
    public String getDescricao() {
        return descricao;
    }

    // Retorna a categoria da solicitação
    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente.getNome() +
                ", Telefone: " + cliente.getTelefone() +
                ", Descrição: " + descricao +
                ", Categoria: " + categoria;
    }
}
