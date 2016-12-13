package controller;

import Dao.AnimalVacinaDAO;
import Dao.VacinaDAO;
import model.Animal;
import model.AnimalVacina;
import model.Vacina;

/**
 * Created by UltronI7 on 11/12/2016.
 */

public class CCadastrarVacina {
    AnimalVacinaDAO dao = new AnimalVacinaDAO();

    public boolean CadastrarVacina(AnimalVacina val){

        if(dao.inserir(val))
            return true;

        return false;
    }

}
