package login;

import java.util.ArrayList;

public class SistemaLogin {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    // Cadastrar usuário (não permite login repetido)
    public boolean cadastrarUsuario(String login, String senha) {
        if (buscarUsuario(login) != null) {
            System.out.println("Erro: Login já cadastrado!");
            return false;
        }
        usuarios.add(new Usuario(login, senha));
        System.out.println("Usuário cadastrado com sucesso!");
        return true;
    }

    // Remover usuário pelo login
    public boolean removerUsuario(String login) {
        Usuario usuario = buscarUsuario(login);
        if (usuario != null) {
            usuarios.remove(usuario);
            System.out.println("Usuário removido com sucesso!");
            return true;
        }
        System.out.println("Erro: Usuário não encontrado.");
        return false;
    }

    // Listar todos os logins (na ordem de cadastro)
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

    // Autenticar usuário (login e senha)
    public boolean autenticar(String login, String senha) {
        Usuario usuario = buscarUsuario(login);
        if (usuario != null && usuario.getSenha().equals(senha)) {
            System.out.println("Autenticação bem-sucedida!");
            return true;
        } else {
            System.out.println("Erro: Login ou senha incorretos.");
            return false;
        }
    }

    // Método auxiliar: buscar usuário pelo login
    private Usuario buscarUsuario(String login) {
        for (Usuario u : usuarios) {
            if (u.getLogin().equals(login)) {
                return u;
            }
        }
        return null;
    }
}