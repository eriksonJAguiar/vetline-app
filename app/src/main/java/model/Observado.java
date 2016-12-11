package model;

/**
 * Created by root on 11/12/16.
 */

public interface Observado {
    public void adiciona(Observador obs);
    public void remover(Observador obs);
    public void notifica();
}
