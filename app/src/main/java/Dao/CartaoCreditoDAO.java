package Dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;


import model.CartaoCredito;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class CartaoCreditoDAO implements GenericDao<CartaoCredito> {




    public CartaoCreditoDAO(){


    }
    @Override
    public boolean inserir(CartaoCredito cartaoCredito) {
        try{
            return true;
        }catch (Exception e){
            return false;
        }


    }

    @Override
    public boolean atualizar(CartaoCredito old, CartaoCredito novo) {
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
