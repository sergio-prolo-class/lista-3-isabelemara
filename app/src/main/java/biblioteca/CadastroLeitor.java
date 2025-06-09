package biblioteca;

import java.util.Scanner;

// Classe responsável por realizar o cadastro de um novo leitor no sistema.
public class CadastroLeitor {
    // Scanner para receber entrada do usuário.
    private Scanner scanner;

    // Construtor que recebe o scanner para leitura de dados.
    public CadastroLeitor(Scanner scanner) {
        this.scanner = scanner;
    }

    // Método que realiza o cadastro do leitor.
    // Solicita o nome e telefone do leitor, cria e retorna o objeto Leitor.
    public Leitor cadastrarLeitor() {
        System.out.print("Nome do leitor: ");
        String nome = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        // Cria e retorna o objeto Leitor com os dados informados.
        return new Leitor(nome, telefone);
    }

    // Método que facilita a chamada desse cadastro a partir do menu principal.
    // Adiciona o leitor cadastrado na lista de leitores do sistema e confirma o cadastro.
    public void executar(SistemaBiblioteca sistema) {
        Leitor leitor = cadastrarLeitor();
        sistema.getLeitores().add(leitor);
        System.out.println("Leitor cadastrado com sucesso!");
    }
}
