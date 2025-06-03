package atendimento;

/**
 * Representa um cliente no sistema.
 * Contém nome e telefone como identificadores principais.
 */
public class Cliente {
    private String nome;
    private String telefone;

    /**
     * Construtor da classe Cliente.
     *
     * @param nome     Nome do cliente.
     * @param telefone Telefone do cliente (deve ser único no sistema).
     */
    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Retorna o nome do cliente
    public String getNome() {
        return nome;
    }

    // Retorna o telefone do cliente
    public String getTelefone() {
        return telefone;
    }

    // Retorna a representação do cliente no formato "Nome (telefone)"
    @Override
    public String toString() {
        return nome + " (" + telefone + ")";
    }
}
