package Dao;

import model.Alergia;

/**
 * Created by UltronI7 on 10/12/2016.
 */

public class AlergiaDAO implements GenericDao<Alergia> {
    @Override
    public boolean inserir(Alergia alergia) {
        return false;
    }

    @Override
    public boolean atualizar(Alergia alergia) {
        return false;
    }

    @Override
    public boolean excluir(Alergia alergia) {
        return false;
    }

    @Override
    public Alergia buscar(Alergia alergia) {
        return null;
    }
}
