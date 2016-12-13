package controller;

import java.util.ArrayList;
import java.util.List;

import Dao.AnimalDAO;
import model.Animal;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class CCadastrarAnimal {

    AnimalDAO dao = new AnimalDAO();

    public boolean CadastrarAnimal(Animal a) { // conectar com o banco para cadatrar um novo animal

        if(dao.inserir(a))
            return true;

        return false;
    }
    public ArrayList<Animal> BuscarAnimal(String dono){

        return dao.buscar(dono);

    }
}
