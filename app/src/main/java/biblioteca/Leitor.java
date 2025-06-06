package biblioteca;

import java.util.HashSet;
import java.util.Set;

// Representa um leitor com id único, nome e telefone, além de controlar livros emprestados
public class Leitor {
    // Contador estático para garantir ids únicos para cada leitor criado
    private static int contador = 1;
    // Identificador único do leitor
    private int id;
    // Nome do leitor
    private String nome;
    // Telefone do leitor
    private String telefone;
    // Conjunto que guarda os ISBNs dos livros que o leitor atualmente tem emprestados
    private Set<String> livrosEmprestados = new HashSet<>();

    // Construtor que inicializa o leitor com nome e telefone, e gera um id automático
    public Leitor(String nome, String telefone) {
        this.id = contador++;
        this.nome = nome;
        this.telefone = telefone;
    }

    // Retorna o id do leitor
    public int getId() {
        return id;
    }

    // Retorna o nome do leitor
    public String getNome() {
        return nome;
    }

    // Retorna o telefone do leitor
    public String getTelefone() {
        return telefone;
    }

    // Verifica se o leitor pode emprestar um livro específico pelo ISBN
    // Condições: não pode estar com o livro emprestado e não pode ter mais que 5 livros emprestados
    public boolean podeEmprestar(String isbn) {
        return !livrosEmprestados.contains(isbn) && livrosEmprestados.size() < 5;
    }

    // Registra que o leitor emprestou um livro, adicionando o ISBN ao conjunto de livros emprestados
    public void registrarEmprestimo(String isbn) {
        livrosEmprestados.add(isbn);
    }

    // Representação em string do leitor no formato "id - nome (telefone)"
    @Override
    public String toString() {
        return id + " - " + nome + " (" + telefone + ")";
    }
}
