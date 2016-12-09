package controller;

import Dao.ConsultaDAO;
import model.Consulta;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class CMarcarConsulta {

    ConsultaDAO dao = new ConsultaDAO();

    public boolean novaConsulta(Consulta c){

        dao.inserir(c);

        return true;
    }



}
