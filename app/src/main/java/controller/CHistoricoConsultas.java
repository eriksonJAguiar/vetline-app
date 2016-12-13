package controller;

import java.util.ArrayList;
import java.util.List;

import Dao.ItemConsultaDAO;
import model.Cliente;
import model.Consulta;
import model.ItemConsulta;
import model.Veterinario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class CHistoricoConsultas {

    private ItemConsultaDAO daoIt;

    public CHistoricoConsultas(){
        daoIt = new ItemConsultaDAO();
    }

    public ArrayList<ItemConsulta> buscaHistorico(String loginCliente){ //busca no banco os dados das consultas do veterinario

        return daoIt.buscar(loginCliente);
    }
}
