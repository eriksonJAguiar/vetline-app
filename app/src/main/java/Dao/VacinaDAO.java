package Dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;


import model.Vacina;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class VacinaDAO implements GenericDao<Vacina> {



    public VacinaDAO(){

    }

    @Override
    public boolean inserir(Vacina vacina) {

        try{

            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean atualizar(Vacina old, Vacina novo) {
        return false;
    }


    @Override
    public boolean excluir(Vacina vacina) {
        return false;
    }

    @Override
    public Vacina buscar(Vacina vacina) {
        return null;
    }
}
