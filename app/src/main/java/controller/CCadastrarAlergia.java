package controller;

import Dao.AlergiaDAO;
import Dao.AnimalAlegiaDAO;
import model.Alergia;
import model.AnimalAlergia;

/**
 * Created by UltronI7 on 11/12/2016.
 */

public class CCadastrarAlergia {
    AnimalAlegiaDAO dao = new AnimalAlegiaDAO();

    public boolean CadastrarAlergia(AnimalAlergia al){

        if(dao.inserir(al))
            return true;

        return false;
    }

}
