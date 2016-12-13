package model;

/**
 * Created by root on 05/12/16.
 */

public class Usuario {
    public String login;
    public String senha;


    private static Usuario novo = null;

    private Usuario(){
        login = "";
        senha = "";
    }

    public static synchronized Usuario getInstance(){
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

}
