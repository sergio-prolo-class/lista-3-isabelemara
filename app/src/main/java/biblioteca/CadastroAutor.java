package biblioteca;

import java.util.Scanner;

// Esta classe é responsável por realizar o cadastro de um novo autor no sistema da biblioteca.
public class CadastroAutor {
    // Scanner para ler a entrada do usuário.
    private Scanner scanner;

    // Construtor que recebe o scanner para entrada de dados.
    public CadastroAutor(Scanner scanner) {
        this.scanner = scanner;
    }

    // Método que executa o processo de cadastro do autor.
    // Solicita ao usuário o nome e o idioma nativo do autor e cria um objeto Autor com esses dados.
    public Autor cadastrarAutor() {
        System.out.print("Nome do autor: ");
        String nome = scanner.nextLine();

        System.out.print("Idioma nativo: ");
        String idioma = scanner.nextLine();

        // Cria e retorna o novo autor com os dados fornecidos.
        return new Autor(nome, idioma);
    }

    // Método para facilitar a chamada dessa funcionalidade no menu principal do sistema.
    // Ele cadastra o autor e adiciona na lista de autores do sistema.
    public void executar(SistemaBiblioteca sistema) {
        Autor autor = cadastrarAutor();
        sistema.getAutores().add(autor);
        System.out.println("Autor cadastrado com sucesso!");
    }
}
