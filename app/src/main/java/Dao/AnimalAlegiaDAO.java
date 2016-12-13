package Dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.jongo.MongoCursor;

import java.util.ArrayList;

import model.Animal;
import model.AnimalAlergia;
import model.Cliente;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class AnimalAlegiaDAO implements GenericDao<AnimalAlergia> {


    private DB jdb;
    private Jongo jongo;
    private MongoCollection collection;

    public AnimalAlegiaDAO(){
        jdb = new MongoClient().getDB("vetline");
        jongo = new Jongo(jdb);
        collection = jongo.getCollection("animalAlergiaDao");
    }


    @Override
    public boolean inserir(AnimalAlergia animalAlergia) {
        try {

            collection.insert(animalAlergia);

            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean atualizar(AnimalAlergia animalAlergia) {
        return false;
    }

    @Override
    public boolean excluir(AnimalAlergia animalAlergia) {
        return false;
    }

    @Override
    public AnimalAlergia buscar(AnimalAlergia animalAlergia) {
        try{
            AnimalAlergia al = collection.findOne("{animal: #, alegia:#}",animalAlergia.getAnimal(),animalAlergia.getAlergia()).as(AnimalAlergia.class);

            return al;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<AnimalAlergia> buscarTodos(){
        try{

            MongoCursor<AnimalAlergia> cursor =  collection.find("{}").as(AnimalAlergia.class);
            final ArrayList<AnimalAlergia> array = new ArrayList<>();

            for(AnimalAlergia al:cursor){

                array.add(al);
            }

            return array;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
