package Dao;

/**
 * Created by root on 13/12/16.
 */


import android.support.v7.app.AlertDialog;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import java.util.ArrayList;

import model.Alergia;
import model.Cliente;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by root on 10/12/16.
 */

public class AlergiaDAO implements GenericDao<Alergia> {


    public AlergiaDAO() {

    }

    @Override
    public boolean inserir(Alergia alergia) {
        try {



            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean atualizar(Alergia old, Alergia novo) {
        return false;
    }

    @Override
    public boolean excluir(Alergia alergia) {
        return false;
    }

    @Override
    public Alergia buscar(Alergia alergia) {
        try{
            Alergia a = alergia;

            return a;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<Alergia> buscarTodos(){
        try{

            final ArrayList<Alergia> array = new ArrayList<>();

            return array;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
