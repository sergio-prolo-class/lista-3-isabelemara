package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe principal que mantém listas de autores, livros, leitores e empréstimos.
 */
public class SistemaBiblioteca {
    private List<Autor> autores = new ArrayList<>();
    private List<Livro> livros = new ArrayList<>();
    private List<Leitor> leitores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public List<Autor> getAutores() {
        return autores;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Leitor> getLeitores() {
        return leitores;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
}
