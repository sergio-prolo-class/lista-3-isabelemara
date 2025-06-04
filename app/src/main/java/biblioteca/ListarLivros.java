package biblioteca;

import java.util.Comparator;
import java.util.List;

/**
 * Classe para listar livros ordenados por título, autor e ISBN.
 */
public class ListarLivros {

    public void listarPorTitulo(List<Livro> livros) {
        livros.sort(Comparator.comparing(Livro::getTitulo, String.CASE_INSENSITIVE_ORDER));
        System.out.println("\n--- Lista de Livros (Ordenados por Título) ---");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public void listarPorAutor(List<Livro> livros) {
        livros.sort(Comparator.comparing(l -> l.getAutores().get(0).getNome(), String.CASE_INSENSITIVE_ORDER));
        System.out.println("\n--- Lista de Livros (Ordenados por Autor) ---");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public void listarPorIsbn(List<Livro> livros) {
        livros.sort(Comparator.comparing(Livro::getIsbn));
        System.out.println("\n--- Lista de Livros (Ordenados por ISBN) ---");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
