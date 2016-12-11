package Dao;

/**
 * Created by root on 05/12/16.
 */

public interface GenericDao<T> {

    public boolean inserir(T t);
    public boolean atualizar(T t);
    public boolean excluir(T t);
    public T buscar(T t);

}

