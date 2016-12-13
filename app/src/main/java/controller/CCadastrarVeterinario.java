package controller;

import android.os.Build;

import java.util.ArrayList;

import Dao.VeterinarioDAO;
import model.Veterinario;

/**
 * Created by root on 05/12/16.
 */

public class CCadastrarVeterinario {

    VeterinarioDAO dao = new VeterinarioDAO();

    public boolean cadastrarVeterinario(Veterinario vet){

        if(dao.inserir(vet))
            return true;

        return false;
    }

    public Veterinario buscaVeterinario(Veterinario vet){

        return dao.buscar(vet);
    }

    public boolean atualizaVeterinario(Veterinario old, Veterinario novo){

        if(dao.atualizar(old,novo))
            return true;

        return false;
    }

    public boolean excluiVeterinario(Veterinario vet){

        if(dao.excluir(vet))
            return false;

        return false;
    }
}
