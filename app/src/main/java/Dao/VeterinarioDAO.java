package Dao;

import model.Cliente;
import model.Veterinario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class VeterinarioDAO implements GenericDao<Veterinario> {

    @Override
    public boolean inserir(Veterinario veterinario) {
        return false;
    }

    @Override
    public boolean atualizar(Veterinario veterinario) {
        return false;
    }

    @Override
    public boolean excluir(Veterinario veterinario) {
        return false;
    }

    @Override
    public Veterinario buscar(Veterinario veterinario) {
        return null;
    }
}
