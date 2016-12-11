package Dao;

import model.Cliente;
import model.Vacina;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class VacinaDAO implements GenericDao<Vacina> {

    @Override
    public boolean inserir(Vacina vacina) {
        return false;
    }

    @Override
    public boolean atualizar(Vacina vacina) {
        return false;
    }

    @Override
    public boolean excluir(Vacina vacina) {
        return false;
    }

    @Override
    public Vacina buscar(Vacina vacina) {
        return null;
    }
}
