package atendimento;

import java.util.*;

public class SistemaAtendimento {
    private Map<String, Cliente> clientes = new LinkedHashMap<>();
    private Queue<Solicitacao> fila = new LinkedList<>();
    private List<Solicitacao> atendidos = new ArrayList<>();

    public void registrarSolicitacao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();
        System.out.print("Telefone do cliente (único): ");
        String telefone = sc.nextLine();

        Cliente cliente = clientes.getOrDefault(telefone, new Cliente(nome, telefone));
        clientes.putIfAbsent(telefone, cliente);

        System.out.print("Descrição da solicitação: ");
        String descricao = sc.nextLine();

        String categoria = escolherCategoria(sc);

        Solicitacao solicitacao = new Solicitacao(cliente, descricao, categoria);
        fila.add(solicitacao);
        System.out.println("Solicitação registrada com sucesso.");
    }

    private String escolherCategoria(Scanner sc) {
        System.out.println("\nSelecione a categoria:");
        System.out.println("1 - Suporte Técnico");
        System.out.println("2 - Informação");
        System.out.println("3 - Atendimento Financeiro");

        while (true) {
            System.out.print("Digite sua escolha (1-3): ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    return "Suporte Técnico";
                case "2":
                    return "Informação";
                case "3":
                    return "Atendimento Financeiro";
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public void listarTelefonesClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente registrado.");
            return;
        }
        System.out.println("Telefones dos clientes registrados:");
        for (Cliente c : clientes.values()) {
            System.out.println("- " + c.getTelefone());
        }
    }

    public void imprimirProximoCliente() {
        if (fila.isEmpty()) {
            System.out.println("Nenhum cliente na fila.");
        } else {
            Solicitacao s = fila.peek();
            System.out.println("Próximo cliente na fila: " + s.getCliente().getNome());
        }
    }

    public void atenderProximoCliente() {
        if (fila.isEmpty()) {
            System.out.println("Nenhum cliente na fila.");
        } else {
            Solicitacao s = fila.poll();
            atendidos.add(s);
            System.out.println("Atendendo cliente: " + s.getCliente().getNome());
        }
    }

    public void listarClientesAtendidos() {
        if (atendidos.isEmpty()) {
            System.out.println("Nenhum cliente atendido.");
            return;
        }
        System.out.println("Clientes atendidos:");
        for (Solicitacao s : atendidos) {
            System.out.println("- " + s.getCliente().getNome());
        }
    }

    public void listarTelefonesEmEspera() {
        if (fila.isEmpty()) {
            System.out.println("Nenhum cliente em espera.");
            return;
        }
        System.out.println("Telefones dos clientes em espera:");
        for (Solicitacao s : fila) {
            System.out.println("- " + s.getCliente().getTelefone());
        }
    }

    public Relatorio gerarRelatorio() {
        return new Relatorio(fila, atendidos);
    }
}
