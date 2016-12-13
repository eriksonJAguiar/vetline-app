package controller;


import Dao.UsuarioDAO;
import model.Cliente;
import model.Usuario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class CRedefinirSenha {

    UsuarioDAO dao = new UsuarioDAO();
    Usuario a1 = Usuario.getInstance();

    public Usuario buscaUsuario(Usuario a){

        a1 = dao.buscar(a);

        return a1;
    }

    public boolean novaSenha(Usuario a2, String novaSenha){

        a2.setSenha(novaSenha);

        //dao.atualizar(a2);

        return false;
    }
}
