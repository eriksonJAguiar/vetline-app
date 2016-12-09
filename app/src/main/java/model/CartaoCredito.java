package model;

/**
 * Created by root on 05/12/16.
 */

public class CartaoCredito {

    private String nomeTitular;
    private String bandeira;
    private String numero;

    public CartaoCredito(){
        nomeTitular = "";
        bandeira = "";
        numero = "";
    }


    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
