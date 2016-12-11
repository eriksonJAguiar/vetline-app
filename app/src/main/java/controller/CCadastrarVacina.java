package controller;

import Dao.AlergiaDAO;
import Dao.VacinaDAO;
import model.Alergia;
import model.Vacina;

/**
 * Created by UltronI7 on 11/12/2016.
 */

public class CCadastrarVacina {
    VacinaDAO dao = new VacinaDAO();

    public boolean inserirVacina(Vacina val){

        dao.inserir(val);

        return true;
    }

}
