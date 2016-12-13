package controller;

import java.util.ArrayList;
import java.util.List;


import Dao.ClienteDAO;
import Dao.UsuarioDAO;
import model.Cliente;
import model.Usuario;

/**
 * Created by root on 05/12/16.
 */

public class CCadastrarCliente {

    ClienteDAO dao = new ClienteDAO();

    public boolean cadastrarCliente(Cliente c){

       if(dao.inserir(c))
           return true;

        return false;
    }

    public Cliente buscarCliente(Cliente c){
        return dao.buscar(c);
    }

    public boolean atualizaCliente(Cliente c){

        return true;
    }
    public boolean excluiCliente(Cliente c){
        return true;
    }

    public ArrayList<Cliente> buscaTodos(){
        return dao.buscarTodos();
    }
}
