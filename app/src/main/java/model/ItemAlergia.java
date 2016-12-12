package model;

import org.mongodb.morphia.annotations.Reference;

import java.util.Date;

/**
 * Created by root on 12/12/16.
 */
public class ItemAlergia {

    @Reference
    private Alergia alergia;

    @Reference
    private Animal animal;

    private Date dataCadastro;

    public Alergia getAlergia() {
        return alergia;
    }

    public void setAlergia(Alergia alergia) {
        this.alergia = alergia;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
