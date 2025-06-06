package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroLivro {
    // Lista onde os livros cadastrados serão armazenados
    private List<Livro> livros;
    // Lista dos autores disponíveis para seleção
    private List<Autor> autores;
    // Scanner para ler a entrada do usuário
    private Scanner scanner;

    // Construtor que recebe as listas de livros e autores, além do scanner para entrada de dados
    public CadastroLivro(List<Livro> livros, List<Autor> autores, Scanner scanner) {
        this.livros = livros;
        this.autores = autores;
        this.scanner = scanner;
    }

    // Método que realiza o cadastro de um novo livro
    public void cadastrarLivro() {
        // Solicita o título do livro
        System.out.print("Título do livro: ");
        String titulo = scanner.nextLine();

        // Solicita o ISBN do livro
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();

        // Verifica se há autores cadastrados antes de continuar
        if (autores.isEmpty()) {
            System.out.println("Nenhum autor cadastrado. Cadastre um autor antes de cadastrar um livro.");
            return; // Sai do método caso não haja autores
        }

        // Lista para armazenar os autores selecionados para este livro
        List<Autor> autoresLivro = new ArrayList<>();

        // Exibe os autores disponíveis para seleção
        System.out.println("Selecione autores pelo número (0 para finalizar):");
        for (int i = 0; i < autores.size(); i++) {
            System.out.println((i + 1) + " - " + autores.get(i));
        }

        // Loop para seleção dos autores
        while (true) {
            System.out.print("Número do autor (0 para finalizar): ");
            String entrada = scanner.nextLine().trim();

            // Se o usuário digitar 0 ou nada, finaliza a seleção
            if (entrada.isEmpty() || entrada.equals("0")) {
                break;
            }

            try {
                int opcao = Integer.parseInt(entrada);
                // Verifica se o número digitado é válido dentro da lista de autores
                if (opcao > 0 && opcao <= autores.size()) {
                    Autor autorSelecionado = autores.get(opcao - 1);
                    // Evita duplicação de autores na lista do livro
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

        // Se nenhum autor foi selecionado, o cadastro é cancelado
        if (autoresLivro.isEmpty()) {
            System.out.println("Nenhum autor selecionado. O livro não foi cadastrado.");
            return;
        }

        // Solicita a quantidade de cópias disponíveis
        System.out.print("Quantidade de cópias disponíveis: ");
        int copiasDisponiveis;

        try {
            // Tenta converter a entrada para número inteiro
            copiasDisponiveis = Integer.parseInt(scanner.nextLine());
            // Verifica se a quantidade não é negativa
            if (copiasDisponiveis < 0) {
                System.out.println("A quantidade de cópias não pode ser negativa.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida para quantidade de cópias.");
            return;
        }

        // Cria um novo objeto Livro com os dados fornecidos
        Livro livro = new Livro(titulo, isbn, autoresLivro, copiasDisponiveis);
        // Adiciona o livro à lista de livros cadastrados
        livros.add(livro);

        // Confirmação do cadastro
        System.out.println("Livro cadastrado com sucesso!");
    }
}
