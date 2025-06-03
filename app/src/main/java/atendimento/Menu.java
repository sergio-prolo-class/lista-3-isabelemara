package atendimento;

import java.util.Scanner;

public class Menu {
    private SistemaAtendimento sistema = new SistemaAtendimento();
    private Relatorio relatorio = new Relatorio(sistema);
    private Scanner sc = new Scanner(System.in);
    private Registrosolicitacao registro = new Registrosolicitacao(sistema, sc);

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
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> registro.registrar();
                case 2 -> sistema.listarTelefonesClientes();
                case 3 -> sistema.verProximoCliente();
                case 4 -> sistema.atenderProximoCliente();
                case 5 -> sistema.listarClientesAtendidos();
                case 6 -> sistema.listarTelefonesEmEspera();
                case 7 -> relatorio.exibirRelatorio();
                case 0 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
