package model;

/**
 * Created by root on 05/12/16.
 */

public class Usuario {
    private String login;
    private String senha;
    private boolean status;

    private static Usuario novo = null;

    private  Usuario(){ }

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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
