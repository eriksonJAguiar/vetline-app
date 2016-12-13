package model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import java.lang.reflect.Array;
import java.util.ArrayList;


/**
 * Created by root on 05/12/16.
 */
@Entity(value = "animal")
public class Animal {

    @Id
    private ObjectId _id;

    private String nome;
    private int pedigree;
    private String raca;
    private String tamanho ;
    private String genero;

    @Reference
    private String dono;


    public Animal(){
        nome = "";
        pedigree = 0;
        raca = "";
        tamanho = "";
        genero = "";
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPedigree() {
        return pedigree;
    }

    public void setPedigree(int pedigree) {
        this.pedigree = pedigree;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
}
