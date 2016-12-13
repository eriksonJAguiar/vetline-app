package Dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import org.jongo.Jongo;
import org.jongo.MongoCollection;

import model.Vacina;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class VacinaDAO implements GenericDAO<Vacina> {
    private DB jdb;
    private Jongo jongo;
    private MongoCollection collection;


    public VacinaDAO(){

        jdb = new MongoClient().getDB("vetline");
        jongo = new Jongo(jdb);
        collection = jongo.getCollection("vacinas");
    }

    @Override
    public boolean inserir(Vacina vacina) {

        try{
            collection.insert(vacina);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean atualizar(Vacina vacina) {
        return false;
    }

    @Override
    public boolean excluir(Vacina vacina) {
        return false;
    }

    @Override
    public Vacina buscar(Vacina vacina) {
        return null;
    }
}
