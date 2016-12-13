package Dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import org.jongo.Jongo;
import org.jongo.MongoCollection;

import model.Consulta;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class ConsultaDAO implements GenericDAO<Consulta> {

    private DB jdb;
    private Jongo jongo;
    private MongoCollection collection;


    public ConsultaDAO(){

        jdb = new MongoClient().getDB("vetline");
        jongo = new Jongo(jdb);
        collection = jongo.getCollection("consultas");
    }
    @Override
    public boolean inserir(Consulta consulta) {


        try{
            collection.insert(consulta);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean atualizar(Consulta consulta) {
        return false;
    }

    @Override
    public boolean excluir(Consulta consulta) {
        return false;
    }

    @Override
    public Consulta buscar(Consulta consulta) {
        return null;
    }
}
