package controller;

import Dao.VeterinarioDAO;
import model.Veterinario;

/**
 * Created by root on 05/12/16.
 */

public class CCadastrarVeterinario {

    VeterinarioDAO dao = new VeterinarioDAO();

    public boolean cadastrarVeterinario(Veterinario vet){

        dao.inserir(vet);

        return true;
    }
}
