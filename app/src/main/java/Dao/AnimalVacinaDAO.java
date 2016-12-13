package Dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;


import model.AnimalVacina;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class AnimalVacinaDAO implements GenericDao<AnimalVacina> {



    public AnimalVacinaDAO(){

    }
    @Override
    public boolean inserir(AnimalVacina animalVacina) {

        try{
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean atualizar(AnimalVacina old, AnimalVacina novo) {
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
