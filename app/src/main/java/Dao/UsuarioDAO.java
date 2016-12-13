package Dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import org.jongo.Jongo;
import org.jongo.MongoCollection;

import model.Usuario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class UsuarioDAO  implements GenericDAO<Usuario> {

    private DB jdb;
    private Jongo jongo;
    private MongoCollection collection;


    public UsuarioDAO(){

        jdb = new MongoClient().getDB("vetline");
        jongo = new Jongo(jdb);
        collection = jongo.getCollection("usuario");
    }
    @Override
    public boolean inserir(Usuario usuario) {

        try{
            collection.insert(usuario);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean atualizar(Usuario usuario) {
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
