package model;

import java.util.Date;

/**
 * Created by root on 05/12/16.
 */

public class Pagamento {

    private Date data;
    private double valor;


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
