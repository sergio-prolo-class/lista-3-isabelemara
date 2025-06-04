package biblioteca;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Classe para listar autores em ordem alfabética.
 */
public class ListarAutores {

    public void listar(List<Autor> autores) {
        autores.sort(Comparator.comparing(Autor::getNome, String.CASE_INSENSITIVE_ORDER));
        System.out.println("\n--- Lista de Autores (Ordem Alfabética) ---");
        for (Autor autor : autores) {
            System.out.println(autor);
        }
    }
}
