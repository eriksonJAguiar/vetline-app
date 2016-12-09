package controller;

import Dao.ConsultaDAO;
import Dao.VeterinarioDAO;
import model.Cliente;
import model.Consulta;
import model.Veterinario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class CcancelarConsulta {

    ConsultaDAO dao = new ConsultaDAO();

    public boolean CancelarConsulta(Consulta c){

        dao.buscar(c);

        dao.excluir(c);


        return false;
    }

}
