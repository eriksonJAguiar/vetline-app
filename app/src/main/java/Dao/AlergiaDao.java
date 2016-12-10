package Dao;

import android.support.v7.app.AlertDialog;

import model.Alergia;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by root on 10/12/16.
 */

public class AlergiaDao implements GenericDao<Alergia> {


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
