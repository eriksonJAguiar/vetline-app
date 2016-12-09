package model;

import java.util.Date;

/**
 * Created by root on 05/12/16.
 */

public class AnimalVacina {

    private int numPedigree;
    private Date data;

    public AnimalVacina(){
        numPedigree = 0;
    }

    public int getNumPedigree() {
        return numPedigree;
    }

    public void setNumPedigree(int numPedigree) {
        this.numPedigree = numPedigree;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
