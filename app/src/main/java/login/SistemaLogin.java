package login;

import java.util.ArrayList;

public class SistemaLogin {
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public void cadastrarUsuario(String nome, String senha) {
        listaUsuarios.add(new Usuario(nome, senha));
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public boolean fazerLogin(String nome, String senha) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNome().equals(nome) && usuario.getSenha().equals(senha)) {
                System.out.println("Login realizado com sucesso!");
                return true;
            }
        }
        System.out.println("Usuário ou senha incorretos.");
        return false;
    }
}
