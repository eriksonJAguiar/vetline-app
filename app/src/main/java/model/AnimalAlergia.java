package model;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Reference;

import java.util.Date;
import java.util.PriorityQueue;

/**
 * Created by root on 05/12/16.
 */

@Entity(value = "animalAlergia")
public class AnimalAlergia {

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
