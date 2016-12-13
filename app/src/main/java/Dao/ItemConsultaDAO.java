package Dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import org.jongo.Jongo;
import org.jongo.MongoCollection;

import model.ItemConsulta;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class ItemConsultaDAO implements GenericDAO<ItemConsulta> {
    private DB jdb;
    private Jongo jongo;
    private MongoCollection collection;


    public ItemConsultaDAO(){

        jdb = new MongoClient().getDB("vetline");
        jongo = new Jongo(jdb);
        collection = jongo.getCollection("item_consulta");
    }
    @Override
    public boolean inserir(ItemConsulta itemConsulta) {

        try{
            collection.insert(itemConsulta);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean atualizar(ItemConsulta itemConsulta) {
        return false;
    }

    @Override
    public boolean excluir(ItemConsulta itemConsulta) {
        return false;
    }

    @Override
    public ItemConsulta buscar(ItemConsulta itemConsulta) {
        return null;
    }
}
