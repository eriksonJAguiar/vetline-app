package controller;

import Dao.ClienteDAO;
import Dao.UsuarioDAO;
import model.Cliente;
import model.Usuario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class CFazerLogin {

    ClienteDAO dao = new ClienteDAO();

    public boolean fazerLogin(Usuario u){
        try {
            Cliente c = new Cliente();
            c.setLogin(u.getLogin());
            c.setSenha(u.getSenha());
            if(!dao.buscar(c).getLogin().isEmpty())
                return true;

            return false;


        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
