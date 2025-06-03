package login;

import java.util.ArrayList;

/**
 * Armazena e gerencia a lista de usuários.
 * Esta classe é responsável por validar e operar diretamente sobre os dados.
 */
public class SistemaLogin {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    /**
     * Cadastra um novo usuário se o login ainda não existir.
     * A verificação é insensível a maiúsculas e minúsculas.
     */
    public boolean cadastrarUsuario(String login, String senha) {
        if (buscarUsuario(login) != null) {
            return false;
        }
        usuarios.add(new Usuario(login, senha));
        System.out.println("Usuário cadastrado com sucesso!");
        return true;
    }

    /**
     * Remove um usuário a partir do login.
     */
    public boolean removerUsuario(String login) {
        Usuario usuario = buscarUsuario(login);
        if (usuario != null) {
            usuarios.remove(usuario);
            System.out.println("Usuário removido com sucesso!");
            return true;
        }
        return false;
    }

    /**
     * Lista todos os usuários cadastrados (logins).
     */
    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            System.out.println("Usuários:");
            for (Usuario u : usuarios) {
                System.out.println("- " + u.getLogin());
            }
        }
    }

    /**
     * Verifica se o login e senha correspondem a um usuário existente.
     */
    public boolean autenticar(String login, String senha) {
        Usuario usuario = buscarUsuario(login);
        return usuario != null && usuario.getSenha().equals(senha);
    }

    /**
     * Busca um usuário a partir do login (sem diferenciar maiúsculas/minúsculas).
     */
    private Usuario buscarUsuario(String login) {
        for (Usuario u : usuarios) {
            if (u.getLogin().equalsIgnoreCase(login)) {
                return u;
            }
        }
        return null;
    }
}
