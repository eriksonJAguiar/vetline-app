package Dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import model.Usuario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class UsuarioDAO  implements GenericDao<Usuario> {



    public UsuarioDAO(){

    }
    @Override
    public boolean inserir(Usuario usuario) {

        try{
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean atualizar(Usuario old, Usuario novo) {
        return false;
    }

    @Override
    public boolean excluir(Usuario usuario) {
        return false;
    }

    @Override
    public Usuario buscar(Usuario usuario) {
        return null;
    }
}
