package biblioteca;

import java.time.LocalDate;

// Representa um empréstimo feito por um leitor de um livro em uma data específica
public class Emprestimo {
    // Leitor que realizou o empréstimo
    private Leitor leitor;
    // Livro que foi emprestado
    private Livro livro;
    // Data em que o empréstimo foi realizado
    private LocalDate data;

    // Construtor que inicializa o empréstimo com leitor, livro e data
    public Emprestimo(Leitor leitor, Livro livro, LocalDate data) {
        this.leitor = leitor;
        this.livro = livro;
        this.data = data;
    }

    // Retorna o leitor que fez o empréstimo
    public Leitor getLeitor() {
        return leitor;
    }

    // Retorna o livro emprestado
    public Livro getLivro() {
        return livro;
    }

    // Retorna a data do empréstimo
    public LocalDate getData() {
        return data;
    }

    // Representação em String do empréstimo no formato "data - nome do leitor -> título do livro"
    @Override
    public String toString() {
        return data + " - " + leitor.getNome() + " -> " + livro.getTitulo();
    }
}
