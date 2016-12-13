package Dao;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;


import org.jongo.MongoCollection;

import java.util.ArrayList;

import model.Animal;
import model.Cliente;
import model.Veterinario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class VeterinarioDAO implements GenericDao<Veterinario> {


    private  Connection c;
    MongoCollection coll;

    public VeterinarioDAO(){

        c = new Connection("veterinarios");
        coll = c.getCollection();

    }

    @Override
    public boolean inserir(Veterinario veterinario) {

        try{
            coll.insert(veterinario);

            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean atualizar(Veterinario old, Veterinario novo) {

       try {

           return true;
       }catch (Exception e){
           e.printStackTrace();
           return false;
       }
    }

    @Override
    public boolean excluir(Veterinario veterinario) {

        try {



            return true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Veterinario buscar(Veterinario veterinario) {

        try{
            Veterinario c = coll.findOne("{login: #}",veterinario.getLogin()).as(Veterinario.class);

            return c;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<Veterinario> buscarPorCidade(String localidade){
        try{


            ArrayList<Veterinario> vList = new ArrayList<>();



            return vList;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
