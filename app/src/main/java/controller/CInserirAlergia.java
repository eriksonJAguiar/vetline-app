package controller;

import Dao.AlergiaDAO;
import model.Alergia;

/**
 * Created by root on 13/12/16.
 */

public class CInserirAlergia {

    AlergiaDAO dao = new AlergiaDAO();

    public boolean inserirAlergia(Alergia al){

        dao.inserir(al);

        return true;
    }
}
