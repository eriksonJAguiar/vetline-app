package Dao;

import model.AnimalAlergia;
import model.Cliente;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class AnimalAlegiaDAO implements GenericDao<AnimalAlergia> {

    @Override
    public boolean inserir(AnimalAlergia animalAlergia) {
        return false;
    }

    @Override
    public boolean atualizar(AnimalAlergia animalAlergia) {
        return false;
    }

    @Override
    public boolean excluir(AnimalAlergia animalAlergia) {
        return false;
    }

    @Override
    public AnimalAlergia buscar(AnimalAlergia animalAlergia) {
        return null;
    }
}
