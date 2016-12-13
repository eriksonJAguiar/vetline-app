package Dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import org.jongo.Jongo;
import org.jongo.MongoCollection;

/**
 * Created by UltronI7 on 13/12/2016.
 */

public class Connection {

    private MongoClient jdb;
    private DB jongo;
    MongoCollection clientes;

    public Connection(String coll){
        jdb = new MongoClient("172.16.105.58", 27017);
        jongo = jdb.getDB( "vetline" );
        Jongo jog = new Jongo(jongo);
        clientes = jog.getCollection(coll);
    }

    public MongoCollection getCollection(){
        return clientes;
    }


}
