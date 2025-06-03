package login;

import java.util.ArrayList;

/**
 * Responsável por armazenar e manipular os dados dos usuários.
 */
public class SistemaLogin {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public boolean cadastrarUsuario(String login, String senha) {
        if (buscarUsuario(login) != null) {
            return false;
        }
        usuarios.add(new Usuario(login, senha));
        return true;
    }

    public boolean removerUsuario(String login) {
        Usuario usuario = buscarUsuario(login);
        if (usuario != null) {
            usuarios.remove(usuario);
            return true;
        }
        return false;
    }

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

    public boolean autenticar(String login, String senha) {
        Usuario usuario = buscarUsuario(login);
        return usuario != null && usuario.getSenha().equals(senha);
    }

    private Usuario buscarUsuario(String login) {
        for (Usuario u : usuarios) {
            if (u.getLogin().equalsIgnoreCase(login)) {
                return u;
            }
        }
        return null;
    }
}
