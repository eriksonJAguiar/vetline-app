package Dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;


import model.Consulta;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class ConsultaDAO implements GenericDao<Consulta> {




    public ConsultaDAO(){


    }
    @Override
    public boolean inserir(Consulta consulta) {


        try{
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean atualizar(Consulta old, Consulta novo) {
        return false;
    }

    @Override
    public boolean excluir(Consulta consulta) {
        return false;
    }

    @Override
    public Consulta buscar(Consulta consulta) {
        return null;
    }
}
