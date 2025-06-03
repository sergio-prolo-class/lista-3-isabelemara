package atendimento;

import java.util.*;

public class SistemaAtendimento {
    private Map<String, Cliente> clientes = new HashMap<>();
    private Queue<Solicitacao> filaEspera = new LinkedList<>();
    private List<Solicitacao> atendidos = new ArrayList<>();

    private int suporteTecnico = 0;
    private int informacao = 0;
    private int atendimentoFinanceiro = 0;

    public void registrarSolicitacao(String nome, String telefone, String descricao, String categoria) {
        Cliente cliente = clientes.getOrDefault(telefone, new Cliente(nome, telefone));
        clientes.putIfAbsent(telefone, cliente);

        Solicitacao solicitacao = new Solicitacao(cliente, descricao, categoria);
        filaEspera.add(solicitacao);

        contarCategoria(categoria);

        System.out.println("Solicitação registrada com sucesso!");
    }

    private void contarCategoria(String categoria) {
        switch (categoria) {
            case "Suporte Técnico" -> suporteTecnico++;
            case "Informação" -> informacao++;
            case "Atendimento Financeiro" -> atendimentoFinanceiro++;
        }
    }


    public void listarTelefonesClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        System.out.println("Telefones dos clientes:");
        for (Cliente c : clientes.values()) {
            System.out.println(c.getTelefone() + " (" + c.getNome() + ")");
        }
    }

    public void verProximoCliente() {
        Solicitacao solicitacao = filaEspera.peek();
        if (solicitacao != null) {
            System.out.println("Próximo cliente: " + solicitacao.getCliente().getNome());
        } else {
            System.out.println("Nenhum cliente na fila.");
        }
    }

    public void atenderProximoCliente() {
        Solicitacao solicitacao = filaEspera.poll();
        if (solicitacao != null) {
            atendidos.add(solicitacao);
            System.out.println("Atendido: " + solicitacao.getCliente().getNome());
        } else {
            System.out.println("Nenhum cliente na fila.");
        }
    }

    public void listarClientesAtendidos() {
        if (atendidos.isEmpty()) {
            System.out.println("Nenhum cliente atendido ainda.");
            return;
        }
        System.out.println("Clientes atendidos:");
        for (Solicitacao s : atendidos) {
            System.out.println(s.getCliente().getNome());
        }
    }

    public void listarTelefonesEmEspera() {
        if (filaEspera.isEmpty()) {
            System.out.println("Nenhum cliente na fila.");
            return;
        }
        System.out.println("Telefones em espera:");
        for (Solicitacao s : filaEspera) {
            System.out.println(s.getCliente().getTelefone());
        }
    }

    // Getters para a classe GerarRelatorio acessar
    public int getTotalSolicitacoes() {
        return filaEspera.size() + atendidos.size();
    }

    public int getAtendidas() {
        return atendidos.size();
    }

    public int getEmEspera() {
        return filaEspera.size();
    }

    public int getSuporteTecnico() {
        return suporteTecnico;
    }

    public int getInformacao() {
        return informacao;
    }

    public int getAtendimentoFinanceiro() {
        return atendimentoFinanceiro;
    }
}
