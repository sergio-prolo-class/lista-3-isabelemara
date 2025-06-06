package biblioteca;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

/**
 * Classe responsável por registrar empréstimos de livros para leitores,
 * garantindo que haja livros e leitores cadastrados e que existam cópias disponíveis.
 */
public class RegistrarEmprestimo {
    private List<Leitor> leitores;       // Lista de leitores cadastrados
    private List<Livro> livros;           // Lista de livros cadastrados
    private List<Emprestimo> emprestimos; // Lista de empréstimos registrados
    private Scanner scanner;              // Scanner para ler entrada do usuário

    /**
     * Construtor que recebe as listas de leitores, livros, empréstimos e o scanner para entrada.
     */
    public RegistrarEmprestimo(List<Leitor> leitores, List<Livro> livros, List<Emprestimo> emprestimos, Scanner scanner) {
        this.leitores = leitores;
        this.livros = livros;
        this.emprestimos = emprestimos;
        this.scanner = scanner;
    }

    /**
     * Método principal para registrar um empréstimo.
     * Verifica se há leitores e livros cadastrados.
     * Permite que o usuário selecione um leitor e um livro para o empréstimo.
     * Confirma disponibilidade do livro e atualiza as cópias disponíveis.
     * Cria o empréstimo e adiciona à lista.
     */
    public void registrarEmprestimo() {
        // Verifica se existem leitores e livros cadastrados
        if (leitores.isEmpty() || livros.isEmpty()) {
            System.out.println("É necessário ter pelo menos um leitor e um livro cadastrado para registrar um empréstimo.");
            return;
        }

        // Exibe a lista de leitores para seleção
        System.out.println("Selecione o leitor pelo número:");
        for (int i = 0; i < leitores.size(); i++) {
            System.out.println((i + 1) + " - " + leitores.get(i).getNome());
        }

        // Lê a escolha do usuário para o leitor e valida
        int leitorIndex = selecionarIndice(leitores.size());
        if (leitorIndex == -1) return;  // Se inválido, retorna e encerra o método
        Leitor leitor = leitores.get(leitorIndex);

        // Exibe a lista de livros para seleção, mostrando as cópias disponíveis
        System.out.println("Selecione o livro pelo número:");
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            System.out.printf("%d - %s (Cópias disponíveis: %d)%n", (i + 1), livro.getTitulo(), livro.getCopiasDisponiveis());
        }

        // Lê a escolha do usuário para o livro e valida
        int livroIndex = selecionarIndice(livros.size());
        if (livroIndex == -1) return; // Se inválido, retorna e encerra o método
        Livro livro = livros.get(livroIndex);

        // Verifica se há cópias disponíveis para o livro escolhido
        if (livro.getCopiasDisponiveis() <= 0) {
            System.out.println("Não há cópias disponíveis para este livro.");
            return;
        }

        // Diminui a quantidade de cópias disponíveis em 1, pois o livro será emprestado
        livro.setCopiasDisponiveis(livro.getCopiasDisponiveis() - 1);

        // Cria o empréstimo com a data atual
        Emprestimo emprestimo = new Emprestimo(leitor, livro, LocalDate.now());
        // Adiciona o empréstimo à lista de empréstimos do sistema
        emprestimos.add(emprestimo);

        System.out.println("Empréstimo registrado com sucesso!");
    }

    /**
     * Método auxiliar para ler e validar a opção escolhida pelo usuário.
     * Recebe o tamanho da lista para validar o índice.
     * Retorna o índice (0-based) se válido, ou -1 se inválido.
     */
    private int selecionarIndice(int tamanhoLista) {
        try {
            System.out.print("Número: ");
            int opcao = Integer.parseInt(scanner.nextLine()) - 1; // Ajusta para índice 0
            if (opcao < 0 || opcao >= tamanhoLista) {
                System.out.println("Opção inválida.");
                return -1;
            }
            return opcao;
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida.");
            return -1;
        }
    }
}
