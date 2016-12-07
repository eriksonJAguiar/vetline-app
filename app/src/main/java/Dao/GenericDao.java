package Dao;

/**
 * Created by root on 05/12/16.
 */

public interface GenericDao<T> {

    public void inserir(T t);
    public void atualizar(T t);
    public void excluir(T t);
    public T buscar(T t);

}

