package biblioteca;

import java.util.Scanner;

/**
 * Classe responsável por exibir o menu principal da aplicação
 * e controlar a interação do usuário com o sistema.
 */
public class Menu {
    // Instância do sistema que gerencia os dados da biblioteca
    private SistemaBiblioteca sistema;
    // Scanner para ler a entrada do usuário pelo console
    private Scanner scanner;

    // Construtor que inicializa o sistema e o scanner
    public Menu() {
        sistema = new SistemaBiblioteca();
        scanner = new Scanner(System.in);
    }

    // Método que exibe o menu repetidamente até o usuário escolher sair
    public void exibirMenu() {
        int opcao = -1;  // Variável para armazenar a opção escolhida

        // Loop principal do menu, continua enquanto a opção for diferente de 0
        while (opcao != 0) {
            // Exibe as opções do menu
            System.out.println("\n=== Sistema Biblioteca ===");
            System.out.println("1 - Cadastrar Autor");
            System.out.println("2 - Cadastrar Leitor");
            System.out.println("3 - Cadastrar Livro");
            System.out.println("4 - Registrar Empréstimo");
            System.out.println("5 - Listar Autores");
            System.out.println("6 - Listar Leitores");
            System.out.println("7 - Listar Livros");
            System.out.println("8 - Listar Empréstimos de um Leitor");
            System.out.println("9 - Listar Todos os Empréstimos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            // Lê a opção do usuário, tratando erros de formato
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida, tente novamente.");
                continue; // Reinicia o loop para pedir a opção novamente
            }

            // Executa a ação correspondente à opção escolhida
            switch (opcao) {
                case 1:
                    // Chama o cadastro de autor, passando o scanner e sistema
                    new CadastroAutor(scanner).executar(sistema);
                    break;
                case 2:
                    // Chama o cadastro de leitor
                    new CadastroLeitor(scanner).executar(sistema);
                    break;
                case 3:
                    // Chama o cadastro de livro, passando listas e scanner
                    new CadastroLivro(sistema.getLivros(), sistema.getAutores(), scanner).cadastrarLivro();
                    break;
                case 4:
                    // Registra um empréstimo, passando listas e scanner
                    new RegistrarEmprestimo(
                            sistema.getLeitores(),
                            sistema.getLivros(),
                            sistema.getEmprestimos(),
                            scanner
                    ).registrarEmprestimo();
                    break;
                case 5:
                    // Lista todos os autores cadastrados
                    new ListagemBiblioteca().listarAutores(sistema.getAutores());
                    break;
                case 6:
                    // Lista todos os leitores cadastrados
                    new ListagemBiblioteca().listarLeitores(sistema.getLeitores());
                    break;
                case 7:
                    // Lista todos os livros cadastrados
                    new ListagemBiblioteca().listarLivros(sistema.getLivros());
                    break;
                case 8:
                    // Lista os empréstimos de um leitor específico
                    new ListarEmprestimoDeLeitor(scanner).executar(sistema);
                    break;
                case 9:
                    // Lista todos os empréstimos existentes
                    new ListarEmprestimos().listaremp(sistema.getEmprestimos());
                    break;
                case 0:
                    // Mensagem de saída do sistema
                    System.out.println("Saindo do sistema. Até logo!");
                    break;
                default:
                    // Opção inválida, informa o usuário
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
        // Fecha o scanner ao sair do menu
        scanner.close();
    }
}
