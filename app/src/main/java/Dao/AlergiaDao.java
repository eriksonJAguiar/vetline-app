package Dao;

import android.support.v7.app.AlertDialog;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.jongo.MongoCursor;

import java.util.ArrayList;

import model.Alergia;
import model.Cliente;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by root on 10/12/16.
 */

public class AlergiaDAO implements GenericDAO<Alergia> {


    private DB jdb;
    private Jongo jongo;
    private MongoCollection collection;

    public AlergiaDAO() {
        jdb = new MongoClient().getDB("vetline");
        jongo = new Jongo(jdb);
        collection = jongo.getCollection("alergias");
    }

    @Override
    public boolean inserir(Alergia alergia) {
        try {

            collection.insert(alergia);


            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean atualizar(Alergia alergia) {

        try {
            collection.insert(alergia);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean excluir(Alergia alergia) {
        return false;
    }

    @Override
    public Alergia buscar(Alergia alergia) {
        try{
            Alergia a = collection.findOne("{codAlergia: #}",alergia.getCodAlergia()).as(Alergia.class);

            return a;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<Alergia> buscarTodos(){
        try{

            MongoCursor<Alergia> cursor =  collection.find("{}").as(Alergia.class);
            final ArrayList<Alergia> array = new ArrayList<>();

            for(Alergia a:cursor){

                array.add(a);
            }

            return array;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
