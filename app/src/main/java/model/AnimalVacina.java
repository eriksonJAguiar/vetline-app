package model;


import java.util.Date;

/**
 * Created by root on 05/12/16.
 */

public class AnimalVacina {

    private Animal animal;

    private Vacina vancina;


    private Date data;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Vacina getVancina() {
        return vancina;
    }

    public void setVancina(Vacina vancina) {
        this.vancina = vancina;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
