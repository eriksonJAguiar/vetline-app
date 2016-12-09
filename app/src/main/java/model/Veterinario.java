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

    public Veterinario(){
        nome = "";
        crmv = 0;
        especialidade = "";
        numConta = 0;
        agencia = 0;
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
}
