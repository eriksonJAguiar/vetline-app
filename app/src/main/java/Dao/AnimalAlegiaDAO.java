package Dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import java.util.ArrayList;

import model.Animal;
import model.AnimalAlergia;
import model.Cliente;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class AnimalAlegiaDAO implements GenericDao<AnimalAlergia> {



    public AnimalAlegiaDAO(){

    }


    @Override
    public boolean inserir(AnimalAlergia animalAlergia) {
        try {

            //collection.insert(animalAlergia);

            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean atualizar(AnimalAlergia old, AnimalAlergia novo) {
        return false;
    }


    @Override
    public boolean excluir(AnimalAlergia animalAlergia) {
        return false;
    }

    @Override
    public AnimalAlergia buscar(AnimalAlergia animalAlergia) {
        try{
            //AnimalAlergia al = collection.findOne("{animal: #, alegia:#}",animalAlergia.getAnimal(),animalAlergia.getAlergia()).as(AnimalAlergia.class);

            return animalAlergia;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<AnimalAlergia> buscarTodos(){
        try{



            return null;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
