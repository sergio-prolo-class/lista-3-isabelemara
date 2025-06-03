package atendimento;

public class Solicitacao {
    private Cliente cliente;
    private String descricao;
    private String categoria;

    public Solicitacao(Cliente cliente, String descricao, String categoria) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getDescricao() {
        return descricao;
    }

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
