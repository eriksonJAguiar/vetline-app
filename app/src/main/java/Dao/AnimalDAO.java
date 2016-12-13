package Dao;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mongodb.DB;
import com.mongodb.MongoClient;

import org.jongo.Jongo;
import org.jongo.MongoCollection;

import java.util.ArrayList;

import model.Animal;
import model.Cliente;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class AnimalDAO implements GenericDao<Animal> {
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
    public boolean atualizar(Animal old, Animal novo) {
        return false;
    }


    @Override
    public boolean excluir(Animal animal) {
        return false;
    }

    @Override
    public Animal buscar(Animal animal) {
        try{
            Animal a = collection.findOne("{pedigree: #}",animal.getPedigree()).as(Animal.class);

            return a;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
