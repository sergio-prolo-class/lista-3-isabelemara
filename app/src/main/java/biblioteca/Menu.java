package biblioteca;

import java.util.Scanner;

/**
 * Classe responsável pelo menu principal da aplicação.
 */
public class Menu {
    private SistemaBiblioteca sistema;
    private Scanner scanner;

    public Menu() {
        sistema = new SistemaBiblioteca();
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== Sistema Biblioteca ===");
            System.out.println("1 - Cadastrar Autor");
            System.out.println("2 - Cadastrar Leitor");
            System.out.println("3 - Cadastrar Livro");
            System.out.println("4 - Registrar Empréstimo");
            System.out.println("5 - Listar Autores");
            System.out.println("6 - Listar Leitores");
            System.out.println("7 - Listar Livros");
            System.out.println("8 - Listar Empréstimos de um Leitor");
            System.out.println("9 - Listar Todos os Empréstimos (por data)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida, tente novamente.");
                continue;
            }

            switch (opcao) {
                case 1:
                    new CadastroAutor(scanner).executar(sistema);
                    break;
                case 2:
                    new CadastroLeitor(scanner).executar(sistema);
                    break;
                case 3:
                    new CadastroLivro(sistema.getLivros(), sistema.getAutores(), scanner).cadastrarLivro();
                    break;
                case 4:
                    new RegistrarEmprestimo(
                            sistema.getLeitores(),
                            sistema.getLivros(),
                            sistema.getEmprestimos(),
                            scanner
                    ).registrarEmprestimo();
                    break;
                case 5:
                    new ListagemBiblioteca().listarAutores(sistema.getAutores());
                    break;
                case 6:
                    new ListagemBiblioteca().listarLeitores(sistema.getLeitores());
                    break;
                case 7:
                    new ListagemBiblioteca().listarLivros(sistema.getLivros());
                    break;
                case 8:
                    new ListarEmprestimoDeLeitor(scanner).executar(sistema);
                    break;
                case 9:
                    new ListarEmprestimos().listarPorData(sistema.getEmprestimos());
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
        scanner.close();
    }
}
