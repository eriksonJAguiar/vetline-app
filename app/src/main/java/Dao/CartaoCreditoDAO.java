package Dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import org.jongo.Jongo;
import org.jongo.MongoCollection;

import model.CartaoCredito;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class CartaoCreditoDAO implements GenericDAO<CartaoCredito> {

    private DB jdb;
    private Jongo jongo;
    private MongoCollection collection;


    public CartaoCreditoDAO(){

        jdb = new MongoClient().getDB("vetline");
        jongo = new Jongo(jdb);
        collection = jongo.getCollection("clientes");
    }
    @Override
    public boolean inserir(CartaoCredito cartaoCredito) {
        try{
            collection.insert(cartaoCredito);
            return true;
        }catch (Exception e){
            return false;
        }


    }

    @Override
    public boolean atualizar(CartaoCredito cartaoCredito) {
        return false;
    }

    @Override
    public boolean excluir(CartaoCredito cartaoCredito) {
        return false;
    }

    @Override
    public CartaoCredito buscar(CartaoCredito cartaoCredito) {
        return null;
    }
}
