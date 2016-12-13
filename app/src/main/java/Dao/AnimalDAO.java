package Dao;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mongodb.DB;
import com.mongodb.MongoClient;

import org.jongo.Jongo;
import org.jongo.MongoCollection;

import model.Animal;
import model.Cliente;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class AnimalDAO implements GenericDAO<Animal> {
    private DB jdb;
    private Jongo jongo;
    private MongoCollection collection;


    public AnimalDAO(){

        jdb = new MongoClient().getDB("vetline");
        jongo = new Jongo(jdb);
        collection = jongo.getCollection("animais");
    }
    @Override
    public boolean inserir(Animal animal) {
        try{
            collection.insert(animal);
            return true;
        }catch (Exception e){
            return false;
        }


    }

    @Override
    public boolean atualizar(   Animal animal) {
        return false;
    }

    @Override
    public boolean excluir(Animal animal) {
        return false;
    }

    @Override
    public Animal buscar(Animal animal) {
        return null;
    }
}
