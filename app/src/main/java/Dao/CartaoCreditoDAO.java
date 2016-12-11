package Dao;

import model.CartaoCredito;
import model.Cliente;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class CartaoCreditoDAO implements GenericDao<CartaoCredito> {

    @Override
    public boolean inserir(CartaoCredito cartaoCredito) {
        return false;
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
