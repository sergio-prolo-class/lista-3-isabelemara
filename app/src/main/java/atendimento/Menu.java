package atendimento;

import java.util.Scanner;

public class Menu {
    private SistemaAtendimento sistema = new SistemaAtendimento();
    private Scanner sc = new Scanner(System.in);

    public void exibir() {
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
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    sistema.registrarSolicitacao();
                    break;
                case 2:
                    sistema.listarTelefonesClientes();
                    break;
                case 3:
                    sistema.imprimirProximoCliente();
                    break;
                case 4:
                    sistema.atenderProximoCliente();
                    break;
                case 5:
                    sistema.listarClientesAtendidos();
                    break;
                case 6:
                    sistema.listarTelefonesEmEspera();
                    break;
                case 7:
                    sistema.gerarRelatorio().exibirRelatorio();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
