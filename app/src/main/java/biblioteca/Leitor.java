package biblioteca;

import java.util.HashSet;
import java.util.Set;

/**
 * Representa um leitor com id único, nome, telefone e endereço.
 */
public class Leitor {
    private static int contador = 1;
    private int id;
    private String nome;
    private String telefone;
    private String endereco;
    private Set<String> livrosEmprestados = new HashSet<>();

    public Leitor(String nome, String telefone, String endereco) {
        this.id = contador++;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    /**
     * Verifica se o leitor pode emprestar um livro com o ISBN dado.
     * Limite de 5 livros emprestados e sem repetição do mesmo livro.
     */
    public boolean podeEmprestar(String isbn) {
        return !livrosEmprestados.contains(isbn) && livrosEmprestados.size() < 5;
    }

    /**
     * Registra o empréstimo de um livro pelo ISBN.
     */
    public void registrarEmprestimo(String isbn) {
        livrosEmprestados.add(isbn);
    }

    @Override
    public String toString() {
        return id + " - " + nome + " (" + telefone + ", " + endereco + ")";
    }
}
