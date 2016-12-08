package controller;

import Dao.AnimalDAO;
import model.Animal;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class CCadastrarAnimal {

    AnimalDAO dao = new AnimalDAO();

    public boolean CadastrarAnimal(Animal a) { // conectar com o banco para cadatrar um novo animal

        dao.inserir(a);

        return false;
    }

}
