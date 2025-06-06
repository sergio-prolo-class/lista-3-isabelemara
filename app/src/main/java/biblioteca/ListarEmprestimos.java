package biblioteca;

import java.util.List;

// Classe responsável por listar todos os empréstimos,
// mostrando apenas o nome do leitor e o título do livro
public class ListarEmprestimos {

    // Método que exibe todos os empréstimos na tela
    public void listaremp(List<Emprestimo> emprestimos) {
        System.out.println("\n--- Lista de Empréstimos ---");

        // Percorre a lista de empréstimos e imprime nome do leitor e título do livro
        for (Emprestimo e : emprestimos) {
            String nomeLeitor = e.getLeitor().getNome();
            String tituloLivro = e.getLivro().getTitulo();
            System.out.println(nomeLeitor + " -> " + tituloLivro);
        }
    }
}
