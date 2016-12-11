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

    public boolean cadastrarCliente(Cliente c){

        boolean gravou = dao.inserir(c);

        return gravou;
    }

    public Cliente buscarCliente(Cliente c){

        return c;
    }

    public boolean atualizaCliente(Cliente c){

        return true;
    }
    public boolean excluiCliente(Cliente c){
        return true;
    }
}
