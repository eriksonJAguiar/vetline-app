package controller;

import Dao.UsuarioDAO;
import model.Usuario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class CFazerLogin {

    UsuarioDAO dao = new UsuarioDAO();

    public boolean fazerLogin(Usuario u){
        try {
            if(dao.buscar(u).getLogin().isEmpty()){

                return false;
            }

        }catch (Exception e){
            return true;
        }

        return false;
    }

}
