package Dao;

/**
 * Created by root on 13/12/16.
 */

import com.mongodb.DB;
import com.mongodb.MongoClient;

import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.jongo.MongoCursor;

import java.util.ArrayList;

import model.Cliente;


/**
 * Created by root on 05/12/16.
 */

public class ClienteDAO implements GenericDao<Cliente> {


    private DB jdb;
    private Jongo jongo;
    private MongoCollection collection;


    public ClienteDAO(){

        jdb = new MongoClient().getDB("vetline");
        jongo = new Jongo(jdb);
        collection = jongo.getCollection("clientes");
    }

    @Override
    public boolean inserir(Cliente cliente) {
        try {

            collection.insert(cliente);


            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean atualizar(Cliente old, Cliente novo) {
        return false;
    }


    @Override
    public boolean excluir(Cliente cliente) {return false;}

    @Override
    public Cliente buscar(Cliente cliente) {
        try{
            Cliente c = collection.findOne("{login: #}",cliente.getLogin()).as(Cliente.class);

            return c;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<Cliente> buscarTodos(){
        try{

            MongoCursor<Cliente> cursor =  collection.find("{}").as(Cliente.class);
            final ArrayList<Cliente> array = new ArrayList<>();

            for(Cliente c:cursor){

                array.add(c);
            }

            return array;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}

