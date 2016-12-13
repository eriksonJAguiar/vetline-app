package controller;

import java.util.ArrayList;
import java.util.List;

import Dao.ConsultaDAO;
import Dao.ItemConsultaDAO;
import model.Consulta;
import model.ItemConsulta;
import model.Veterinario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class CConsultarAgenda {

    ItemConsultaDAO dao;

    public CConsultarAgenda(){
       dao = new ItemConsultaDAO();
    }


    public ArrayList<ItemConsulta> ConsultaAgenda(Veterinario v) { // conectar com o banco para buscar as consultas agendadas do veterinario

           return dao.buscar(v.getLogin(),false);
    }
}
