package Dao;

import model.Animal;
import model.Cliente;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class AnimalDAO implements GenericDao<Animal> {

    @Override
    public boolean inserir(Animal animal) {
        return false;
    }

    @Override
    public boolean atualizar(Animal animal) {
        return false;
    }

    @Override
    public boolean excluir(Animal animal) {
        return false;
    }

    @Override
    public Animal buscar(Animal animal) {
        return null;
    }
}
