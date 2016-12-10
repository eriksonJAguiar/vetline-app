package Dao;

import model.Cliente;
import model.HospitalVeterinario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class HospitalVeterinarioDAO implements GenericDao<HospitalVeterinario> {

    @Override
    public boolean inserir(HospitalVeterinario hospitalVeterinario) {
        return false;
    }

    @Override
    public boolean atualizar(HospitalVeterinario hospitalVeterinario) {
        return false;
    }

    @Override
    public boolean excluir(HospitalVeterinario hospitalVeterinario) {
        return false;
    }

    @Override
    public HospitalVeterinario buscar(HospitalVeterinario hospitalVeterinario) {
        return null;
    }
}
