package atendimento;

import java.util.*;

/**
 * Classe central que gerencia os dados das solicitações, clientes e estatísticas.
 */
public class GerenciadorSolicitacoes {
    private Map<String, Cliente> clientes = new HashMap<>();
    private Queue<Solicitacao> filaEspera = new LinkedList<>();
    private List<Solicitacao> atendidos = new ArrayList<>();

    private int suporteTecnico = 0;
    private int informacao = 0;
    private int atendimentoFinanceiro = 0;

    /**
     * Registra uma nova solicitação no sistema.
     */
    public void registrarSolicitacao(String nome, String telefone, String descricao, String categoria) {
        Cliente cliente = clientes.getOrDefault(telefone, new Cliente(nome, telefone));
        clientes.putIfAbsent(telefone, cliente);

        Solicitacao solicitacao = new Solicitacao(cliente, descricao, categoria);
        filaEspera.add(solicitacao);

        contarCategoria(categoria);

        System.out.println("Solicitação registrada com sucesso!");
    }

    // Incrementa a contagem conforme a categoria
    private void contarCategoria(String categoria) {
        switch (categoria) {
            case "Suporte Técnico" -> suporteTecnico++;
            case "Informação" -> informacao++;
            case "Atendimento Financeiro" -> atendimentoFinanceiro++;
        }
    }

    // Métodos de acesso usados pelas classes auxiliares

    public Map<String, Cliente> getClientes() {
        return clientes;
    }

    public Queue<Solicitacao> getFilaEspera() {
        return filaEspera;
    }

    public List<Solicitacao> getAtendidos() {
        return atendidos;
    }

    public int getTotalSolicitacoes() {
        return filaEspera.size() + atendidos.size();
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
