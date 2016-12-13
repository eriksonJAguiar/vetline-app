package Dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import org.jongo.Jongo;
import org.jongo.MongoCollection;

import model.AnimalVacina;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class AnimalVacinaDAO implements GenericDAO<AnimalVacina> {

    private DB jdb;
    private Jongo jongo;
    private MongoCollection collection;


    public AnimalVacinaDAO(){

        jdb = new MongoClient().getDB("vetline");
        jongo = new Jongo(jdb);
        collection = jongo.getCollection("animal_vacina");
    }
    @Override
    public boolean inserir(AnimalVacina animalVacina) {

        try{
            collection.insert(animalVacina);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean atualizar(AnimalVacina animalVacina) {
        return false;
    }

    @Override
    public boolean excluir(AnimalVacina animalVacina) {
        return false;
    }

    @Override
    public AnimalVacina buscar(AnimalVacina animalVacina) {
        return null;
    }
}
