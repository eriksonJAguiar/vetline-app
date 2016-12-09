package controller;

import Dao.ClienteDao;
import Dao.UsuarioDAO;
import model.Cliente;
import model.Usuario;

/**
 * Created by root on 05/12/16.
 */

public class CCadastrarCliente {

    ClienteDao dao = new ClienteDao();
    UsuarioDAO dao2 = new UsuarioDAO();

    public boolean cadastrarCliente(Cliente c){

        dao.inserir(c);

        return true;
    }
}
