package controller;

import java.util.ArrayList;
import java.util.List;

import Dao.HospitalVeterinarioDAO;
import model.HospitalVeterinario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class CPesquisarHospital {

    HospitalVeterinarioDAO dao = new HospitalVeterinarioDAO();
    HospitalVeterinario hv1 = new HospitalVeterinario();

    public ArrayList<HospitalVeterinario> PesquisarHospital(HospitalVeterinario hv){

        return  dao.buscarPorCidade(hv);

    }
    public HospitalVeterinario selecionaHospitalDesejado(ArrayList<HospitalVeterinario> listaHv, HospitalVeterinario hv){

        int i = listaHv.indexOf(hv);

        if(i < 0)
            return null;

        return listaHv.get(i);
    }
}

