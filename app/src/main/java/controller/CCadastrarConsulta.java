package controller;

import java.util.Date;

import Dao.ConsultaDAO;
import model.Consulta;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class CCadastrarConsulta {

    ConsultaDAO dao = new ConsultaDAO();

    public boolean CadastrarConsulta(Consulta c) { // conectar com o banco para cadatrar um nova Consulta

        dao.inserir(c);

        return false;
    }

}
