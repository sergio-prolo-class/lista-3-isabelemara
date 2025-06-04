package biblioteca;

import java.util.List;

/**
 * Responsável por listar autores, livros e leitores cadastrados.
 */
public class ListagemBiblioteca {

    public void listarAutores(List<Autor> autores) {
        System.out.println("\n--- Lista de Autores ---");
        for (Autor autor : autores) {
            System.out.println(autor);
        }
    }

    public void listarLivros(List<Livro> livros) {
        System.out.println("\n--- Lista de Livros ---");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public void listarLeitores(List<Leitor> leitores) {
        System.out.println("\n--- Lista de Leitores ---");
        for (Leitor leitor : leitores) {
            System.out.println(leitor);
        }
    }
}
