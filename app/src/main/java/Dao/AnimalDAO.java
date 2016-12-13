package Dao;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mongodb.DB;
import com.mongodb.MongoClient;

import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.jongo.MongoCursor;

import java.util.ArrayList;

import model.Animal;
import model.Cliente;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class AnimalDAO implements GenericDao<Animal> {

    private  Connection c;
    MongoCollection coll;



    public AnimalDAO(){

        c = new Connection("animais");
        coll = c.getCollection();
    }
    @Override
    public boolean inserir(Animal animal) {
        try{
            coll.insert(animal);
            return true;
        }catch (Exception e){
            return false;
        }


    }

    @Override
    public boolean atualizar(Animal old, Animal novo) {
        return false;
    }


    @Override
    public boolean excluir(Animal animal) {
        return false;
    }

    @Override
    public Animal buscar(Animal animal) {
        try{
            Animal a = coll.findOne("{pedigree: #}",animal.getPedigree()).as(Animal.class);

            return a;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public  ArrayList<Animal> buscar(String dono){
        try{
            MongoCursor<Animal> a = coll.find("{dono: #}",dono).as(Animal.class);

            ArrayList<Animal> alist = new ArrayList<>();

            for (Animal an:a){
                alist.add(an);
            }

            return alist;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
