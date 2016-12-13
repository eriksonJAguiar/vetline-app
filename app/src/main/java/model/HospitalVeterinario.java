package model;

import org.bson.types.ObjectId;

/**
 * Created by root on 05/12/16.
 */

public class HospitalVeterinario {


    private ObjectId _id;

    private String nome;
    private int crmv;
    private int classificacao;
    private int numero;
    private String bairro;
    private String cidade;
    private String uf;

    public HospitalVeterinario(){
        nome = "";
        crmv = 0;
        classificacao = 0;
        numero = 0;
        bairro = "";
        cidade = "";
        uf = "";
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

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
