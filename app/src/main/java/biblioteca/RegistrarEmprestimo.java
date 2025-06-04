package biblioteca;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class RegistrarEmprestimo {
    private List<Leitor> leitores;
    private List<Livro> livros;
    private List<Emprestimo> emprestimos;
    private Scanner scanner;

    public RegistrarEmprestimo(List<Leitor> leitores, List<Livro> livros, List<Emprestimo> emprestimos, Scanner scanner) {
        this.leitores = leitores;
        this.livros = livros;
        this.emprestimos = emprestimos;
        this.scanner = scanner;
    }

    public void registrarEmprestimo() {
        if (leitores.isEmpty() || livros.isEmpty()) {
            System.out.println("É necessário ter pelo menos um leitor e um livro cadastrado para registrar um empréstimo.");
            return;
        }

        System.out.println("Selecione o leitor pelo número:");
        for (int i = 0; i < leitores.size(); i++) {
            System.out.println((i + 1) + " - " + leitores.get(i).getNome());
        }

        int leitorIndex = selecionarIndice(leitores.size());
        if (leitorIndex == -1) return;
        Leitor leitor = leitores.get(leitorIndex);

        System.out.println("Selecione o livro pelo número:");
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            System.out.printf("%d - %s (Cópias disponíveis: %d)%n", (i + 1), livro.getTitulo(), livro.getCopiasDisponiveis());
        }

        int livroIndex = selecionarIndice(livros.size());
        if (livroIndex == -1) return;
        Livro livro = livros.get(livroIndex);

        if (livro.getCopiasDisponiveis() <= 0) {
            System.out.println("Não há cópias disponíveis para este livro.");
            return;
        }

        // Reduz a quantidade de cópias disponíveis
        livro.setCopiasDisponiveis(livro.getCopiasDisponiveis() - 1);

        Emprestimo emprestimo = new Emprestimo(leitor, livro, LocalDate.now());
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado com sucesso!");
    }

    private int selecionarIndice(int tamanhoLista) {
        try {
            System.out.print("Número: ");
            int opcao = Integer.parseInt(scanner.nextLine()) - 1;
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
