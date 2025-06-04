package biblioteca;

import java.util.Comparator;
import java.util.List;

/**
 * Classe para listar todos os empréstimos ordenados por data.
 */
public class ListarEmprestimos {

    public void listarPorData(List<Emprestimo> emprestimos) {
        emprestimos.sort(Comparator.comparing(Emprestimo::getData));
        System.out.println("\n--- Lista de Empréstimos (Ordenados por Data) ---");
        for (Emprestimo e : emprestimos) {
            System.out.println(e);
        }
    }
}
