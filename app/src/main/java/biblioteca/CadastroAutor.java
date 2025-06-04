package biblioteca;

import java.util.Scanner;

/**
 * Responsável por cadastrar um autor no sistema.
 */
public class CadastroAutor {
    private Scanner scanner;

    public CadastroAutor(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Executa o cadastro de um autor, solicitando dados e retornando um objeto Autor.
     */
    public Autor cadastrarAutor() {
        System.out.print("Nome do autor: ");
        String nome = scanner.nextLine();

        System.out.print("Idioma nativo: ");
        String idioma = scanner.nextLine();

        return new Autor(nome, idioma);
    }

    /**
     * Método para facilitar a execução dentro do menu.
     */
    public void executar(SistemaBiblioteca sistema) {
        Autor autor = cadastrarAutor();
        sistema.getAutores().add(autor);
        System.out.println("Autor cadastrado com sucesso!");
    }
}
