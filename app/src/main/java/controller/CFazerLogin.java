package controller;

import Dao.ClienteDAO;
import Dao.UsuarioDAO;
import Dao.VeterinarioDAO;
import model.Cliente;
import model.Usuario;
import model.Veterinario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class CFazerLogin {



    public boolean fazerLogin(Usuario u){
        ClienteDAO dao = new ClienteDAO();
        try {
            Cliente c = new Cliente();
            c.setLogin(u.getLogin());
            c.setSenha(u.getSenha());
            Cliente aux = dao.buscar(c);

            Usuario user = Usuario.getInstance();
            user.setLogin(u.getLogin());
            user.setSenha(u.getSenha());

            if((aux.getLogin().equals(c.getLogin()))&& (aux.getSenha().equals(c.getSenha())))
                return true;

            return false;


        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean fazerLoginVet(Usuario u){
        VeterinarioDAO dao = new VeterinarioDAO();
        try {
            Veterinario c = new Veterinario();
            c.setLogin(u.getLogin());
            c.setSenha(u.getSenha());
            Veterinario aux = dao.buscar(c);

            Usuario user = Usuario.getInstance();
            user.setLogin(u.getLogin());
            user.setSenha(u.getSenha());

            if((aux.getLogin().equals(c.getLogin()))&& (aux.getSenha().equals(c.getSenha())))
                return true;

            return false;


        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
