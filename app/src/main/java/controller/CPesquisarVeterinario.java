package controller;

import java.util.ArrayList;

import Dao.VeterinarioDAO;
import model.Veterinario;

/**
 * Created by root on 13/12/16.
 */

public class CPesquisarVeterinario {

    private VeterinarioDAO vDao;

    public CPesquisarVeterinario(){
        vDao = new VeterinarioDAO();
    }

    public ArrayList<Veterinario> pesquisarVeterinario(String localidade){
       return vDao.buscarPorCidade(localidade);
    }
    public Veterinario pesquisarVeterinario(Veterinario v){
        return vDao.buscar(v);
    }
}
