package login;

import java.util.ArrayList;

/**
 * Classe que armazena e gerencia os dados dos usuários.
 * Permite cadastrar, remover, autenticar e listar usuários.
 */
public class SistemaLogin {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    /**
     * Cadastra um novo usuário caso o login ainda não exista.

     */
    public boolean cadastrarUsuario(String login, String senha) {
        if (buscarUsuario(login) != null) {
            return false; // Login já existe
        }
        usuarios.add(new Usuario(login, senha));
        return true;
    }

    /**
     * Remove um usuário pelo login.

     */
    public boolean removerUsuario(String login) {
        Usuario usuario = buscarUsuario(login);
        if (usuario != null) {
            usuarios.remove(usuario);
            return true;
        }
        return false;
    }

    /**
     * Lista todos os usuários cadastrados no sistema.
     * Exibe mensagem se não houver usuários.
     */
    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            System.out.println("Usuários cadastrados:");
            for (Usuario u : usuarios) {
                System.out.println("- " + u.getLogin());
            }
        }
    }

    /**
     * Autentica o usuário com login e senha.

     */
    public boolean autenticar(String login, String senha) {
        Usuario usuario = buscarUsuario(login);
        return usuario != null && usuario.getSenha().equals(senha);
    }

    /**
     * Busca um usuário pelo login ignorando caixa (case insensitive).
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
