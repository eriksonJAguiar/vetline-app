package model;

/**
 * Created by root on 05/12/16.
 */

public class Usuario {
    private String login;
    private String senha;


    private static Usuario novo = null;

    public Usuario(){
        login = "";
        senha = "";
    }

    public Usuario getInstance(){
        if(novo == null){
            return new Usuario();
        }

        return novo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public static Usuario getNovo() {
        return novo;
    }

    public static void setNovo(Usuario novo) {
        Usuario.novo = novo;
    }
}
