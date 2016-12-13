package Dao;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;

import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.jongo.MongoCursor;

import java.util.ArrayList;

import model.Animal;
import model.Veterinario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class VeterinarioDAO implements GenericDao<Veterinario> {
    private DB jdb;
    private Jongo jongo;
    private MongoCollection collection;


    public VeterinarioDAO(){

        jdb = new MongoClient().getDB("vetline");
        jongo = new Jongo(jdb);
        collection = jongo.getCollection("veterinarios");
    }

    @Override
    public boolean inserir(Veterinario veterinario) {

        try{
            collection.insert(veterinario);

            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean atualizar(Veterinario old, Veterinario novo) {

       try {
           collection.update("{login: #}",old.getLogin()).with(novo);
           return true;
       }catch (Exception e){
           e.printStackTrace();
           return false;
       }
    }

    @Override
    public boolean excluir(Veterinario veterinario) {

        try {

            collection.remove("{login: #}",veterinario.getLogin());

            return true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Veterinario buscar(Veterinario veterinario) {

        try{
            Veterinario v = collection.findOne("{login: #}",veterinario.getCrmv()).as(Veterinario.class);

            return v;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<Veterinario> buscarPorCidade(String localidade){
        try{
            MongoCursor<Veterinario> v = collection.find("{cidade: #}",localidade).as(Veterinario.class);

            ArrayList<Veterinario> vList = new ArrayList<>();

            for(Veterinario vet:v){
                vList.add(vet);
            }

            return vList;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
