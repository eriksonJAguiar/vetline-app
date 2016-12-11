package controller;

import android.os.Build;

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

    public Veterinario buscaVeterinario(Veterinario vet){

        return vet;
    }

    public boolean atualizaVeterinario(Veterinario vet){

        return true;
    }

    public boolean excluiVeterinario(Veterinario vet){

     return true;
    }
}
