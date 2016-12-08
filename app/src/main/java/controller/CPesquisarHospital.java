package controller;

import Dao.HospitalVeterinarioDAO;
import model.HospitalVeterinario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class CPesquisarHospital {

    HospitalVeterinarioDAO dao = new HospitalVeterinarioDAO();
    HospitalVeterinario hv1 = new HospitalVeterinario();

    public HospitalVeterinario PesquisarHospital(HospitalVeterinario hv){

        hv1 = dao.buscar(hv);

        return hv1;
    }
}
