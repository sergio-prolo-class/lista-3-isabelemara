package biblioteca;

import java.util.List;

public class Livro {
    // Título do livro
    private String titulo;
    // Código ISBN do livro
    private String isbn;
    // Lista de autores do livro
    private List<Autor> autores;
    // Quantidade de cópias disponíveis para empréstimo
    private int copiasDisponiveis;

    // Construtor que inicializa o livro com título, ISBN, autores e número de cópias disponíveis
    public Livro(String titulo, String isbn, List<Autor> autores, int copiasDisponiveis) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autores = autores;
        this.copiasDisponiveis = copiasDisponiveis;
    }

    // Retorna o título do livro
    public String getTitulo() {
        return titulo;
    }

    // Retorna o ISBN do livro
    public String getIsbn() {
        return isbn;
    }

    // Retorna a lista de autores do livro
    public List<Autor> getAutores() {
        return autores;
    }

    // Retorna a quantidade de cópias disponíveis
    public int getCopiasDisponiveis() {
        return copiasDisponiveis;
    }

    // Atualiza a quantidade de cópias disponíveis
    public void setCopiasDisponiveis(int copiasDisponiveis) {
        this.copiasDisponiveis = copiasDisponiveis;
    }

    // Gera uma representação em texto do livro, listando título, ISBN, autores e cópias disponíveis
    public String toString() {
        StringBuilder nomesAutores = new StringBuilder();
        // Percorre os autores para criar uma string separada por vírgulas com os nomes
        for (int i = 0; i < autores.size(); i++) {
            nomesAutores.append(autores.get(i).getNome());
            if (i < autores.size() - 1) {
                nomesAutores.append(", ");
            }
        }
        // Formata a string final com as informações do livro
        return String.format("%s (ISBN: %s, Autores: %s, Cópias disponíveis: %d)",
                titulo, isbn, nomesAutores.toString(), copiasDisponiveis);
    }
}
