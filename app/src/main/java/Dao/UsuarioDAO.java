package Dao;

import model.Cliente;
import model.Usuario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class UsuarioDAO  implements GenericDao<Usuario>{

    @Override
    public boolean inserir(Usuario usuario) {
        return false;
    }

    @Override
    public boolean atualizar(Usuario usuario) {
        return false;
    }

    @Override
    public boolean excluir(Usuario usuario) {
        return false;
    }

    @Override
    public Usuario buscar(Usuario usuario) {
        return null;
    }
}
