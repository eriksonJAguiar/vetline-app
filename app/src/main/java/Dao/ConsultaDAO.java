package Dao;

import model.Cliente;
import model.Consulta;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class ConsultaDAO implements GenericDao<Consulta> {

    @Override
    public boolean inserir(Consulta consulta) {
        return false;
    }

    @Override
    public boolean atualizar(Consulta consulta) {
        return false;
    }

    @Override
    public boolean excluir(Consulta consulta) {
        return false;
    }

    @Override
    public Consulta buscar(Consulta consulta) {
        return null;
    }
}
