package Dao;

/**
 * Created by root on 13/12/16.
 */

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;

import org.jongo.Jongo;
import org.jongo.MongoCollection;

import java.util.ArrayList;

import model.Cliente;


/**
 * Created by root on 05/12/16.
 */

public class ClienteDAO implements GenericDao<Cliente> {


    private MongoClient jdb;
    private DB jongo;
    MongoCollection clientes;

    public ClienteDAO(){

        jdb = new MongoClient("172.16.105.58", 27017);
        jongo = jdb.getDB( "vetline" );
        Jongo jog = new Jongo(jongo);
        clientes = jog.getCollection("clientes");
    }

    @Override
    public boolean inserir(Cliente cliente) {
        try {
            clientes.insert(cliente);


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

            Cliente c = clientes.findOne("{login: #}",cliente.getLogin()).as(Cliente.class);

            System.out.println(c.getUf());
            System.out.println(c.getBairro());
            return c;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<Cliente> buscarTodos(){
        try{

            //MongoCursor<Cliente> cursor =  collection.find("{}").as(Cliente.class);
            //final ArrayList<Cliente> array = new ArrayList<>();

            //for(Cliente c:cursor){

            //    array.add(c);
           // }

            return null;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}

