package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe principal que mantém as listas de autores, livros, leitores e empréstimos.
 * Atua como um repositório centralizado dos dados da biblioteca durante a execução do programa.
 */
public class SistemaBiblioteca {

    // Lista para armazenar os autores cadastrados na biblioteca
    private List<Autor> autores = new ArrayList<>();

    // Lista para armazenar os livros cadastrados na biblioteca
    private List<Livro> livros = new ArrayList<>();

    // Lista para armazenar os leitores cadastrados na biblioteca
    private List<Leitor> leitores = new ArrayList<>();

    // Lista para armazenar os empréstimos realizados
    private List<Emprestimo> emprestimos = new ArrayList<>();

    /**
     * Retorna a lista de autores cadastrados.
     */
    public List<Autor> getAutores() {
        return autores;
    }

    /**
     * Retorna a lista de livros cadastrados.
     */
    public List<Livro> getLivros() {
        return livros;
    }

    /**
     * Retorna a lista de leitores cadastrados.
     */
    public List<Leitor> getLeitores() {
        return leitores;
    }

    /**
     * Retorna a lista de empréstimos registrados.
     */
    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
}
