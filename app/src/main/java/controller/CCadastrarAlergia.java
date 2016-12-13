package controller;

import Dao.AlergiaDao;
import model.Alergia;

/**
 * Created by UltronI7 on 11/12/2016.
 */

public class CCadastrarAlergia {
    AlergiaDao dao = new AlergiaDao();

    public boolean inserirAlergia(Alergia al){

        dao.inserir(al);

        return true;
    }

}
