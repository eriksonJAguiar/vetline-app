package model;

import java.util.PriorityQueue;

/**
 * Created by root on 05/12/16.
 */

public class Animal {

    private String nome;
    private int numRacaPedigre;
    private String raca;
    private int genero;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumRacaPedigre() {
        return numRacaPedigre;
    }

    public void setNumRacaPedigre(int numRacaPedigre) {
        this.numRacaPedigre = numRacaPedigre;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }
}
