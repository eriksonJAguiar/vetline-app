package model;

/**
 * Created by root on 05/12/16.
 */

public class Veterinario extends Usuario  {
    private String crmv;

    private static Veterinario novo;

    public Veterinario getInstance(){
        if(novo == null){
            return new Veterinario();
        }

        return novo;
    }

    public Veterinario(){
        super("","","","","");
        this.crmv = "";
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }
}
