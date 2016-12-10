package Dao;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import model.Cliente;

/**
 * Created by root on 05/12/16.
 */

public class ClienteDao implements GenericDao<Cliente> {

    @Override
    public boolean inserir(Cliente cliente) {
        try {
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference();
            myRef.child("users").child(cliente.getLogin()).setValue(cliente);

            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean atualizar(Cliente cliente) {
        return false;
    }

    @Override
    public boolean excluir(Cliente cliente) {
        return false;
    }

    @Override
    public Cliente buscar(Cliente cliente) {
        return null;
    }
}
