package controller;

import Dao.HospitalVeterinarioDAO;
import model.HospitalVeterinario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class CIndicarHospital {

    HospitalVeterinarioDAO dao = new HospitalVeterinarioDAO();

    public boolean FazerIndicaçãoHospital(HospitalVeterinario hv){

        dao.inserir(hv);

        return false;
    }
}
