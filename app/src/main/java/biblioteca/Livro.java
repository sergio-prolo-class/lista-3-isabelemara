package biblioteca;

import java.util.List;

public class Livro {
    private String titulo;
    private String isbn;
    private List<Autor> autores;
    private int copiasDisponiveis;

    public Livro(String titulo, String isbn, List<Autor> autores, int copiasDisponiveis) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autores = autores;
        this.copiasDisponiveis = copiasDisponiveis;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public int getCopiasDisponiveis() {
        return copiasDisponiveis;
    }

    public void setCopiasDisponiveis(int copiasDisponiveis) {
        this.copiasDisponiveis = copiasDisponiveis;
    }

    @Override
    public String toString() {
        StringBuilder nomesAutores = new StringBuilder();
        for (int i = 0; i < autores.size(); i++) {
            nomesAutores.append(autores.get(i).getNome());
            if (i < autores.size() - 1) {
                nomesAutores.append(", ");
            }
        }
        return String.format("%s (ISBN: %s, Autores: %s, Cópias disponíveis: %d)",
                titulo, isbn, nomesAutores.toString(), copiasDisponiveis);
    }
}
