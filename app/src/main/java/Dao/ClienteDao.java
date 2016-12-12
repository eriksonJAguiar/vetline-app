package Dao;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.QueryBuilder;


import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.jongo.MongoCursor;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Alergia;
import model.Cliente;

/**
 * Created by root on 05/12/16.
 */

public class ClienteDao implements GenericDao<Cliente> {

    private Mongo m;
    private DB db;
    private DB jdb;
    private DBCollection coll;
    private Jongo jongo;
    private MongoCollection collection;



    public ClienteDao(){
         m = new Mongo();
        db = m.getDB("vetline");
        coll = db.getCollection("clientes");


        jdb = new MongoClient().getDB("vetline");
        jongo = new Jongo(jdb);
        collection = jongo.getCollection("clientes");
    }

    @Override
    public boolean inserir(Cliente cliente) {
        try {
            /*FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference();

            myRef.child("Clientes").child(cliente.getLogin()).child("nome").setValue(cliente.getNome());
            myRef.child("Clientes").child(cliente.getLogin()).child("bairro").setValue(cliente.getBairro());
            myRef.child("Clientes").child(cliente.getLogin()).child("cidade").setValue(cliente.getCidade());
            myRef.child("Clientes").child(cliente.getLogin()).child("cpf").setValue(cliente.getCpf());
            myRef.child("Clientes").child(cliente.getLogin()).child("email").setValue(cliente.getEmail());
            myRef.child("Clientes").child(cliente.getLogin()).child("endereco").setValue(cliente.getEndereco());
            myRef.child("Clientes").child(cliente.getLogin()).child("num").setValue(cliente.getNum());
            myRef.child("Clientes").child(cliente.getLogin()).child("uf").setValue(cliente.getUf());
            myRef.child("Clientes").child(cliente.getLogin()).child("senha").setValue(cliente.getSenha());*/


                /*BasicDBObject doc = new BasicDBObject();

                doc.put("login", cliente.getLogin());
                doc.put("senha", cliente.getSenha());
                doc.put("nome", cliente.getNome());
                doc.put("cpf", cliente.getCpf());
                doc.put("email",cliente.getEmail());
                doc.put("endereco", cliente.getEndereco());
                doc.put("numero", cliente.getNum());
                doc.put("bairro", cliente.getBairro());
                doc.put("cidade", cliente.getCidade());
                doc.put("uf",cliente.getUf());*/


                collection.insert(cliente);


            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean atualizar(Cliente cliente) { return false;}

    @Override
    public boolean excluir(Cliente cliente) {return false;}

    @Override
    public Cliente buscar(Cliente cliente) {
        try{
            Cliente c = collection.findOne("{login: #}",cliente.getLogin()).as(Cliente.class);

            return c;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<Cliente> buscarTodos(){
        try{

            MongoCursor<Cliente> cursor =  collection.find("{}").as(Cliente.class);
            final ArrayList<Cliente> array = new ArrayList<>();

            for(Cliente c:cursor){

                array.add(c);
            }

            return array;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
