package atendimento;

import java.util.*;

public class Relatorio {
    private int totalRegistradas;
    private int totalAtendidas;
    private int totalEmEspera;
    private Map<String, Integer> distribuicaoPorCategoria = new HashMap<>();

    public Relatorio(Queue<Solicitacao> fila, List<Solicitacao> atendidos) {
        totalAtendidas = atendidos.size();
        totalEmEspera = fila.size();
        totalRegistradas = totalAtendidas + totalEmEspera;

        List<Solicitacao> todas = new ArrayList<>(fila);
        todas.addAll(atendidos);

        for (Solicitacao s : todas) {
            String categoria = s.getCategoria();
            distribuicaoPorCategoria.put(categoria,
                    distribuicaoPorCategoria.getOrDefault(categoria, 0) + 1);
        }
    }

    public void exibirRelatorio() {
        System.out.println("\n=== RELATÓRIO ESTATÍSTICO ===");
        System.out.println("Total de solicitações registradas: " + totalRegistradas);
        System.out.println("Total de solicitações atendidas: " + totalAtendidas);
        System.out.println("Total de solicitações em espera: " + totalEmEspera);

        System.out.println("\nDistribuição por categoria:");
        for (Map.Entry<String, Integer> entry : distribuicaoPorCategoria.entrySet()) {
            double percentual = (entry.getValue() * 100.0) / (totalRegistradas == 0 ? 1 : totalRegistradas);
            System.out.printf("- %s: %d (%.2f%%)%n", entry.getKey(), entry.getValue(), percentual);
        }
        System.out.println("==============================\n");
    }
}
