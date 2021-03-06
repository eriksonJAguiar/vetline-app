package model;

import org.bson.types.ObjectId;

import java.io.Serializable;

/**
 * Created by root on 05/12/16.
 */

public class Veterinario  implements Serializable{

    private ObjectId _id;

    private String nome;
    private int crmv;
    private String especialidade;
    private int numConta;
    private int agencia;
    private String banco;
    private int operacao;
    private String email;
    private String login;
    private String senha;
    private boolean disponivel;

    public Veterinario(){
        banco = "";
        setOperacao(0);
        nome = "";
        crmv = 0;
        especialidade = "";
        numConta = 0;
        agencia = 0;
        email = "";
        login = "";
        senha = "";
        disponivel = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCrmv() {
        return crmv;
    }

    public void setCrmv(int crmv) {
        this.crmv = crmv;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }


    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getOperacao() {
        return operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
