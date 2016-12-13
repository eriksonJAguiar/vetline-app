package Dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import org.jongo.Jongo;
import org.jongo.MongoCollection;

import model.HospitalVeterinario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class HospitalVeterinarioDAO implements GenericDAO<HospitalVeterinario> {

    private DB jdb;
    private Jongo jongo;
    private MongoCollection collection;


    public HospitalVeterinarioDAO(){

        jdb = new MongoClient().getDB("vetline");
        jongo = new Jongo(jdb);
        collection = jongo.getCollection("hospital_veterinario");
    }
    @Override
    public boolean inserir(HospitalVeterinario hospitalVeterinario) {
        try{
            collection.insert(hospitalVeterinario);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean atualizar(HospitalVeterinario hospitalVeterinario) {
        return false;
    }

    @Override
    public boolean excluir(HospitalVeterinario hospitalVeterinario) {
        return false;
    }

    @Override
    public HospitalVeterinario buscar(HospitalVeterinario hospitalVeterinario) {
        return null;
    }
}
