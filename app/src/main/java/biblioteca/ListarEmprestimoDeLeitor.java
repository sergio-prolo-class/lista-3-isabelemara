package biblioteca;

import java.util.List;
import java.util.Scanner;

// Classe responsável por listar os empréstimos de um leitor, mostrando apenas o nome do leitor e o título do livro
public class ListarEmprestimoDeLeitor {
    private Scanner scanner;  // Scanner para ler a entrada do usuário

    // Construtor que recebe o Scanner para entrada de dados
    public ListarEmprestimoDeLeitor(Scanner scanner) {
        this.scanner = scanner;
    }

    // Método que realiza a listagem dos empréstimos de um leitor específico
    public void listar(List<Leitor> leitores, List<Emprestimo> emprestimos) {
        // Mostra a lista de leitores disponíveis para seleção
        System.out.println("Leitores disponíveis:");
        for (Leitor leitor : leitores) {
            System.out.println(leitor.getId() + " - " + leitor.getNome());
        }

        // Solicita que o usuário informe o ID do leitor desejado
        System.out.print("ID do leitor: ");
        int idLeitor = Integer.parseInt(scanner.nextLine());

        // Busca o leitor com o ID informado na lista de leitores
        Leitor leitorSelecionado = leitores.stream()
                .filter(l -> l.getId() == idLeitor)
                .findFirst()
                .orElse(null);

        // Se não encontrar o leitor, exibe mensagem e termina o método
        if (leitorSelecionado == null) {
            System.out.println("Leitor não encontrado.");
            return;
        }

        // Caso encontre, inicia a impressão dos empréstimos desse leitor
        System.out.println("Empréstimos do leitor " + leitorSelecionado.getNome() + ":");
        boolean achou = false;

        // Percorre todos os empréstimos e imprime os que pertencem ao leitor selecionado,
        // mostrando só o nome do leitor e o título do livro
        for (Emprestimo e : emprestimos) {
            if (e.getLeitor().getId() == leitorSelecionado.getId()) {
                System.out.println(leitorSelecionado.getNome() + " -> " + e.getLivro().getTitulo());
                achou = true;
            }
        }

        // Caso não tenha encontrado empréstimos para o leitor, informa ao usuário
        if (!achou) {
            System.out.println("Nenhum empréstimo encontrado para este leitor.");
        }
    }

    // Método para facilitar a chamada dentro do sistema principal
    public void executar(SistemaBiblioteca sistema) {
        listar(sistema.getLeitores(), sistema.getEmprestimos());
    }
}
