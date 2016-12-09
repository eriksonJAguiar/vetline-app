package controller;

import Dao.UsuarioDAO;
import model.Usuario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class CFazerLogin {

    UsuarioDAO dao = new UsuarioDAO();

    public boolean fazerLogin(Usuario u){

        dao.buscar(u);

        return true;
    }

}
