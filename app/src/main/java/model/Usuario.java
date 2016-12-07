package model;

/**
 * Created by root on 05/12/16.
 */

public class Usuario {
    private String login;
    private String senha;
    private String nome;
    private String email;
    private String telefone;
    private boolean status;

    private static Usuario novo = null;

    public Usuario(){}
    public Usuario(String nome, String email, String telefone, String usuario, String senha){
        this.login = usuario;
        this.senha = senha;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public static Usuario getNovo() {
        return novo;
    }

    public static void setNovo(Usuario novo) {
        Usuario.novo = novo;
    }
}
