package Dao;

import model.AnimalVacina;
import model.Cliente;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class AnimalVacinaDAO implements GenericDao<AnimalVacina> {

    @Override
    public boolean inserir(AnimalVacina animalVacina) {
        return false;
    }

    @Override
    public boolean atualizar(AnimalVacina animalVacina) {
        return false;
    }

    @Override
    public boolean excluir(AnimalVacina animalVacina) {
        return false;
    }

    @Override
    public AnimalVacina buscar(AnimalVacina animalVacina) {
        return null;
    }
}
