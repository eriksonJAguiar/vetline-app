package model;


import java.util.Date;

/**
 * Created by root on 05/12/16.
 */

public class ItemConsulta {



    private Date dataConsulta;
    private double preco;

    private Veterinario veterinario;

    private Consulta consulta;

    private Animal animal;

    public ItemConsulta(){

        preco = 0.0;
        veterinario = new Veterinario();
        consulta = new Consulta();
        dataConsulta = new Date();
        animal = new Animal();
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
