package biblioteca;


import java.util.Comparator;
import java.util.List;

/**
 * Classe para listar leitores em ordem alfabética e por ID.
 */
public class ListarLeitores {

    public void listarPorNome(List<Leitor> leitores) {
        leitores.sort(Comparator.comparing(Leitor::getNome, String.CASE_INSENSITIVE_ORDER));
        System.out.println("\n--- Lista de Leitores (Ordem Alfabética) ---");
        for (Leitor leitor : leitores) {
            System.out.println(leitor);
        }
    }

    public void listarPorId(List<Leitor> leitores) {
        leitores.sort(Comparator.comparingInt(Leitor::getId));
        System.out.println("\n--- Lista de Leitores (Ordem por ID) ---");
        for (Leitor leitor : leitores) {
            System.out.println(leitor);
        }
    }
}
