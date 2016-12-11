package model;

import java.util.Date;

/**
 * Created by root on 05/12/16.
 */

public class Vacina {

    private String vacina;
    private String data;
    private String descricao;
    private String validaAte;

    public Vacina(){
        vacina = "";
        descricao = "";
    }

    public String getVacina() {
        return vacina;
    }

    public void setVacina(String vacina) {
        this.vacina = vacina;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValidaAte() {
        return validaAte;
    }

    public void setValidaAte(String validaAte) {
        this.validaAte = validaAte;
    }
}
