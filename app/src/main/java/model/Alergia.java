package model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;

/**
 * Created by root on 05/12/16.
 */

@Entity(value = "alergias")
public class Alergia implements Serializable{

    @Id
    private ObjectId codAlergia;

    private String alergia;
    private String descricao;

    public Alergia(){
        alergia = "";
        descricao = "";
    }


    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ObjectId getCodAlergia() {
        return codAlergia;
    }

    public void setCodAlergia(ObjectId codAlergia) {
        this.codAlergia = codAlergia;
    }
}
