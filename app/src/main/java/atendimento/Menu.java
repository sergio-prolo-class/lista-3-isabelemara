package atendimento;

import java.util.Scanner;

/**
 * Classe responsável por exibir o menu principal e acionar as funcionalidades correspondentes.
 */
public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private GerenciadorSolicitacoes gerenciador = new GerenciadorSolicitacoes();

    // Instâncias de cada funcionalidade separada
    private RegistrarSolicitacao registrar = new RegistrarSolicitacao(gerenciador, scanner);
    private ListarTelefonesClientes listarTelefones = new ListarTelefonesClientes(gerenciador);
    private VerProximo verProximo = new VerProximo(gerenciador);
    private AtenderProximoCliente atenderProximo = new AtenderProximoCliente(gerenciador);
    private ListarClientesAtendidos listarAtendidos = new ListarClientesAtendidos(gerenciador);
    private ListarTelefonesEmEspera listarEspera = new ListarTelefonesEmEspera(gerenciador);
    private GerarRelatorio relatorio = new GerarRelatorio(gerenciador);

    /**
     * Exibe o menu principal em loop até o usuário escolher sair.
     */
    public void exibirMenu() {
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Registrar Solicitação");
            System.out.println("2 - Listar Telefones de Clientes");
            System.out.println("3 - Ver Próximo Cliente");
            System.out.println("4 - Atender Próximo Cliente");
            System.out.println("5 - Listar Clientes Atendidos");
            System.out.println("6 - Listar Telefones em Espera");
            System.out.println("7 - Gerar Relatório");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer do teclado

            switch (opcao) {
                case 1 -> registrar.registrar();
                case 2 -> listarTelefones.listar();
                case 3 -> verProximo.ver();
                case 4 -> atenderProximo.atender();
                case 5 -> listarAtendidos.listar();
                case 6 -> listarEspera.listar();
                case 7 -> relatorio.exibir();
                case 0 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
