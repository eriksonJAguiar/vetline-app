package model;

import java.util.Date;

/**
 * Created by root on 05/12/16.
 */

public class Vacina {

    private String vacina;
    private String descricao;
    private Date data;
    private Date validaAte;


    public String getVacina() {
        return vacina;
    }

    public void setVacina(String vacina) {
        this.vacina = vacina;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getValidaAte() {
        return validaAte;
    }

    public void setValidaAte(Date validaAte) {
        this.validaAte = validaAte;
    }
}
