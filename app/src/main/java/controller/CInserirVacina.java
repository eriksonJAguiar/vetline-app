package controller;

import Dao.VacinaDAO;
import model.Vacina;

/**
 * Created by root on 13/12/16.
 */

public class CInserirVacina {
    VacinaDAO dao = new VacinaDAO();

    public boolean inserirVacina(Vacina val){

        dao.inserir(val);

        return true;
    }
}
