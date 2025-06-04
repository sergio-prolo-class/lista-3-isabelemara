package biblioteca;

import java.util.List;
import java.util.Scanner;

/**
 * Responsável por listar todos os empréstimos feitos por um leitor.
 */
public class ListarEmprestimoDeLeitor {
    private Scanner scanner;

    public ListarEmprestimoDeLeitor(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Executa a listagem dos empréstimos de um leitor.
     */
    public void listar(List<Leitor> leitores, List<Emprestimo> emprestimos) {
        System.out.println("Leitores disponíveis:");
        for (Leitor leitor : leitores) {
            System.out.println(leitor.getId() + " - " + leitor.getNome());
        }

        System.out.print("ID do leitor: ");
        int idLeitor = Integer.parseInt(scanner.nextLine());
        Leitor leitorSelecionado = leitores.stream()
                .filter(l -> l.getId() == idLeitor)
                .findFirst()
                .orElse(null);

        if (leitorSelecionado == null) {
            System.out.println("Leitor não encontrado.");
            return;
        }

        System.out.println("Empréstimos do leitor " + leitorSelecionado.getNome() + ":");
        boolean achou = false;
        for (Emprestimo e : emprestimos) {
            if (e.getLeitor().getId() == leitorSelecionado.getId()) {
                System.out.println(e);
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Nenhum empréstimo encontrado para este leitor.");
        }
    }

    /**
     * Método para facilitar a execução dentro do menu.
     */
    public void executar(SistemaBiblioteca sistema) {
        listar(sistema.getLeitores(), sistema.getEmprestimos());
    }
}
