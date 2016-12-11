package model;

/**
 * Created by root on 05/12/16.
 */

public class Veterinario extends Usuario  {

    private String nome;
    private int crmv;
    private String especialidade;
    private int numConta;
    private int agencia;
    private String banco;
    private int operacao;
    private String email;

    public Veterinario(){
        banco = "";
        setOperacao(0);
        nome = "";
        crmv = 0;
        especialidade = "";
        numConta = 0;
        agencia = 0;
        email = "";
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
}
