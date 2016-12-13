package controller;

import Dao.AnimalDAO;
import model.Animal;
import model.Cliente;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class CDadosAnimal {

    AnimalDAO dao = new AnimalDAO();

    public Animal carregaDados(Animal a){ //busca no banco os dados do animal
        return null;
    }

    public boolean editaDadosAnimal(Animal a){ // atualiza no banco os dados do animal

        //dao.atualizar(a);

        return false;
    }
    public boolean excluiAnimal(Animal a){
        dao.excluir(a);

        return false;
    }
}
