package Dao;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

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

            myRef.child("Clientes").child(cliente.getLogin()).child("nome").setValue(cliente.getNome());
            myRef.child("Clientes").child(cliente.getLogin()).child("bairro").setValue(cliente.getBairro());
            myRef.child("Clientes").child(cliente.getLogin()).child("cidade").setValue(cliente.getCidade());
            myRef.child("Clientes").child(cliente.getLogin()).child("cpf").setValue(cliente.getCpf());
            myRef.child("Clientes").child(cliente.getLogin()).child("email").setValue(cliente.getEmail());
            myRef.child("Clientes").child(cliente.getLogin()).child("endereco").setValue(cliente.getEndereco());
            myRef.child("Clientes").child(cliente.getLogin()).child("num").setValue(cliente.getNum());
            myRef.child("Clientes").child(cliente.getLogin()).child("uf").setValue(cliente.getUf());
            myRef.child("Clientes").child(cliente.getLogin()).child("senha").setValue(cliente.getSenha());


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
