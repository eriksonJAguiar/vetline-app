package controller;

import Dao.ConsultaDAO;
import model.Consulta;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class CClassificarConsulta {

    ConsultaDAO dao = new ConsultaDAO();

    public boolean ClassificaConsulta(Consulta c) { // conectar com o banco para atualizar a classificação da consulta

        dao.atualizar(c);

        return false;
    }

}
