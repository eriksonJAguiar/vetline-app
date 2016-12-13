package model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import java.util.Date;

/**
 * Created by root on 05/12/16.
 */

@Entity(value = "consulta")
public class Consulta {

    @Id
    private ObjectId _id;

    private Date data;
    private String descricao;
    private String local;
    private boolean status;
    private int classificacao;
    private String tipoPagamento;
    private String diagnostico;
    private boolean realizada;



    public Consulta(){
        descricao = "";
        local = "";
        status = false;
        classificacao = 0;
        setTipoPagamento("");
        data = new Date();
        diagnostico = "";
        realizada = false;
    }


    public Date getDataconsulta() {
        return data;
    }

    public void setDataconsulta(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }


    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }
}
