package biblioteca;

import java.util.Scanner;

/**
 * Responsável por cadastrar um novo leitor no sistema.
 */
public class CadastroLeitor {
    private Scanner scanner;

    public CadastroLeitor(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Executa o cadastro do leitor solicitando dados e retorna o objeto Leitor.
     */
    public Leitor cadastrarLeitor() {
        System.out.print("Nome do leitor: ");
        String nome = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        return new Leitor(nome, telefone, endereco);
    }

    /**
     * Método para facilitar a execução dentro do menu.
     */
    public void executar(SistemaBiblioteca sistema) {
        Leitor leitor = cadastrarLeitor();
        sistema.getLeitores().add(leitor);
        System.out.println("Leitor cadastrado com sucesso!");
    }
}
