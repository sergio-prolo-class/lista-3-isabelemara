package biblioteca;

import java.util.List;

// Classe responsável por listar os autores, livros e leitores cadastrados no sistema
public class ListagemBiblioteca {

    // Imprime no console a lista de autores cadastrados
    public void listarAutores(List<Autor> autores) {
        System.out.println("\n--- Lista de Autores ---");
        // Percorre cada autor da lista e imprime usando o método toString() da classe Autor
        for (Autor autor : autores) {
            System.out.println(autor);
        }
    }

    // Imprime no console a lista de livros cadastrados
    public void listarLivros(List<Livro> livros) {
        System.out.println("\n--- Lista de Livros ---");
        // Percorre cada livro da lista e imprime usando o método toString() da classe Livro
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    // Imprime no console a lista de leitores cadastrados
    public void listarLeitores(List<Leitor> leitores) {
        System.out.println("\n--- Lista de Leitores ---");
        // Percorre cada leitor da lista e imprime usando o método toString() da classe Leitor
        for (Leitor leitor : leitores) {
            System.out.println(leitor);
        }
    }
}
