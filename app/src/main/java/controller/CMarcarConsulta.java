package controller;

import java.util.ArrayList;
import java.util.List;

import Dao.ConsultaDAO;
import Dao.ItemConsultaDAO;
import model.Consulta;
import model.ItemConsulta;
import model.Observado;
import model.Observador;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class CMarcarConsulta implements Observado {

    ConsultaDAO dao;
    ItemConsultaDAO daoItem;

    private List<Observador> observadores;
    private List<Consulta> consultas;


    public CMarcarConsulta(){
        observadores = new ArrayList<>();
        consultas = new ArrayList<>();
        dao = new ConsultaDAO();
        daoItem = new ItemConsultaDAO();
    }

    /*public void marcar(Consulta c){
        this.consultas.add(c);
        this.notifica();
    }*/

    @Override
    public void adiciona(Observador obs) {
        observadores.add(obs);
    }

    @Override
    public void remover(Observador obs) {
        int i = observadores.indexOf(obs);
        observadores.remove(i);
    }

    @Override
    public void notifica() {
        for(Observador ob:observadores){
            ob.atualiza(this.consultas.get(this.consultas.size()-1));
        }
    }
    public boolean novaConsulta(Consulta c){

        if(dao.inserir(c)){
            this.consultas.add(c);
            this.notifica();

            return true;
        }

        return false;
    }
    public boolean atualizarStatus(){
        return false;
    }
    public boolean marcarConsulta(ItemConsulta itemC){

        if(daoItem.inserir(itemC)) {
            notifica();
            return true;
        }

        return false;
    }

}
