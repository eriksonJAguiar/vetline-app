package Dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.jongo.MongoCursor;

import java.util.ArrayList;

import model.Cliente;
import model.HospitalVeterinario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class HospitalVeterinarioDAO implements GenericDao<HospitalVeterinario> {

    private DB jdb;
    private Jongo jongo;
    private MongoCollection collection;


    public HospitalVeterinarioDAO(){

        jdb = new MongoClient().getDB("vetline");
        jongo = new Jongo(jdb);
        collection = jongo.getCollection("hospitaisVeterinarios");
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
    public boolean atualizar(HospitalVeterinario old, HospitalVeterinario novo) {
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
    public ArrayList<HospitalVeterinario> buscarPorCidade(HospitalVeterinario hospitalVeterinario){

        try{

            MongoCursor<HospitalVeterinario> cursor =  collection.find("{cidade: #}",hospitalVeterinario.getCidade()).as(HospitalVeterinario.class);
            final ArrayList<HospitalVeterinario> array = new ArrayList<>();

            for(HospitalVeterinario hv:cursor){

                array.add(hv);
            }

            return array;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
