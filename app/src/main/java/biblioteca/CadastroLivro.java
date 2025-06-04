package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroLivro {
    private List<Livro> livros;
    private List<Autor> autores;
    private Scanner scanner;

    public CadastroLivro(List<Livro> livros, List<Autor> autores, Scanner scanner) {
        this.livros = livros;
        this.autores = autores;
        this.scanner = scanner;
    }

    public void cadastrarLivro() {
        System.out.print("Título do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();

        if (autores.isEmpty()) {
            System.out.println("Nenhum autor cadastrado. Cadastre um autor antes de cadastrar um livro.");
            return;
        }

        List<Autor> autoresLivro = new ArrayList<>();
        System.out.println("Selecione autores pelo número (0 para finalizar):");
        for (int i = 0; i < autores.size(); i++) {
            System.out.println((i + 1) + " - " + autores.get(i));
        }

        while (true) {
            System.out.print("Número do autor (0 para finalizar): ");
            String entrada = scanner.nextLine().trim();
            if (entrada.isEmpty() || entrada.equals("0")) {
                break;
            }
            try {
                int opcao = Integer.parseInt(entrada);
                if (opcao > 0 && opcao <= autores.size()) {
                    Autor autorSelecionado = autores.get(opcao - 1);
                    if (!autoresLivro.contains(autorSelecionado)) {
                        autoresLivro.add(autorSelecionado);
                    } else {
                        System.out.println("Autor já selecionado.");
                    }
                } else {
                    System.out.println("Número inválido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido.");
            }
        }

        if (autoresLivro.isEmpty()) {
            System.out.println("Nenhum autor selecionado. O livro não foi cadastrado.");
            return;
        }

        System.out.print("Quantidade de cópias disponíveis: ");
        int copiasDisponiveis;
        try {
            copiasDisponiveis = Integer.parseInt(scanner.nextLine());
            if (copiasDisponiveis < 0) {
                System.out.println("A quantidade de cópias não pode ser negativa.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida para quantidade de cópias.");
            return;
        }

        Livro livro = new Livro(titulo, isbn, autoresLivro, copiasDisponiveis);
        livros.add(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }
}
