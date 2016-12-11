package controller;

import Dao.AlergiaDAO;
import model.Alergia;

/**
 * Created by UltronI7 on 11/12/2016.
 */

public class CCadastrarAlergia {
    AlergiaDAO dao = new AlergiaDAO();

    public boolean inserirAlergia(Alergia al){

        dao.inserir(al);

        return true;
    }

}
