package model;

/**
 * Created by root on 05/12/16.
 */

public class Cliente extends Usuario {
    private static Cliente novo = null;
    public Cliente getInstance(){
        if(novo == null){
            return new Cliente();
        }

        return novo;
    }
    public Cliente(){
        super("","","","","");
    }
}
