package Dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import java.util.ArrayList;

import model.Cliente;
import model.HospitalVeterinario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class HospitalVeterinarioDAO implements GenericDao<HospitalVeterinario> {

    private DB jdb;


    public HospitalVeterinarioDAO(){

    }
    @Override
    public boolean inserir(HospitalVeterinario hospitalVeterinario) {
        try{
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

                final ArrayList<HospitalVeterinario> array = new ArrayList<>();


            return array;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
