package biblioteca; // Define o pacote onde a classe está localizada.

// Classe que representa um autor com nome e idioma nativo.
public class Autor {

    // Armazena o nome do autor.
    private String nome;

    // Armazena o idioma nativo do autor.
    private String idioma;

    // Construtor da classe. Recebe o nome e o idioma do autor e armazena nos atributos.
    public Autor(String nome, String idioma) {
        this.nome = nome;
        this.idioma = idioma;
    }

    // Retorna o nome do autor.
    public String getNome() {
        return nome;
    }

    // Retorna o idioma nativo do autor.
    public String getIdioma() {
        return idioma;
    }

    // Retorna uma representação textual do autor no formato: nome (idioma).
    public String toString() {
        return nome + " (" + idioma + ")";
    }
}
