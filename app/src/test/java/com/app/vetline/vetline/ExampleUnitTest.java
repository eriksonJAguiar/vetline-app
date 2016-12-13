package com.app.vetline.vetline;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;

import controller.CCadastrarAlergia;
import controller.CCadastrarAnimal;
import controller.CCadastrarCliente;
import controller.CCadastrarVacina;
import controller.CCadastrarVeterinario;
import controller.CFazerLogin;
import controller.CIndicarHospital;
import controller.CMarcarConsulta;
import controller.CPesquisarHospital;
import controller.CPesquisarVeterinario;
import model.Alergia;
import model.Animal;
import model.AnimalAlergia;
import model.AnimalVacina;
import model.Cliente;
import model.Consulta;
import model.HospitalVeterinario;
import model.ItemConsulta;
import model.Usuario;
import model.Vacina;
import model.Veterinario;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertTrue(marcarConsulta());
    }
    public boolean gravou(){

        try {
            CCadastrarCliente cads = new CCadastrarCliente();

            Cliente c = new Cliente();

            /*c.setNome("Matheus Bento");
            c.setEmail("boca_de_pelo@gmail.com");
            c.setBairro("Sla");
            c.setCidade("Band");
            c.setCpf("000.000.000-00");
            c.setEndereco("Sla");
            c.setNumero(159);
            c.setUf("PR");
            c.setLogin("el boca de pelo");
            c.setSenha("boca123");*/

            c.setNome("Jose");
            c.setEmail("jose@gmail.com");
            c.setBairro("Centro");
            c.setCidade("SM");
            c.setCpf("000.000.000-00");
            c.setEndereco("Rua teste");
            c.setNumero(947);
            c.setUf("PR");
            c.setLogin("jose");
            c.setSenha("jose123");



            if(cads.cadastrarCliente(c))
                return true;

            return false;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }


    }
    public boolean buscou(){
        try {

            Cliente c = new Cliente();

            CCadastrarCliente cads = new CCadastrarCliente();

            c.setLogin("erikson");

            Cliente cli = cads.buscarCliente(c);


            if(cli != null)
                System.out.println(cli.getEmail());
            else
                System.out.println("Vazio");

            return true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean buscouTodos(){
        try {

            Cliente c = new Cliente();

            CCadastrarCliente cads = new CCadastrarCliente();

            ArrayList<Cliente> cli = cads.buscaTodos();


           if(!cli.isEmpty()){
               for(Cliente cliente:cli){
                   System.out.println(cliente.getEmail());
               }
           }
            else
               System.out.println("Vazio");


            return true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean logar(){
        CFazerLogin l = new CFazerLogin();

        Usuario u = Usuario.getInstance();

        u.setLogin("erikson");
        u.setSenha("123456");

        if(l.fazerLogin(u)){
            System.out.println("Login Valido");
            return true;
        }
        else{
            System.out.println("Login Inválido");
        }

        return false;
    }
    public boolean indicarHosp(){

        CIndicarHospital chv = new CIndicarHospital();

        HospitalVeterinario h1 = new HospitalVeterinario();

        h1.setCidade("Santa Mariana");
        h1.setNome("Hospital SM");

        HospitalVeterinario h2 = new HospitalVeterinario();

        h2.setCidade("Santa Mariana");
        h2.setNome("veterinario Zezim");

        if(chv.indicarHospitalVet(h2) && chv.indicarHospitalVet(h1))
            return true;

        return false;
    }
    public boolean pesquisarHospVet(){
        CPesquisarHospital ph = new CPesquisarHospital();
        HospitalVeterinario hv = new HospitalVeterinario();

        hv.setCidade("Santa Mariana");
        //hv.setCidade("Bandeirantes");
        ArrayList<HospitalVeterinario> hosp = new ArrayList<>();

        hosp = ph.PesquisarHospital(hv);

        if(!hosp.isEmpty()){
            for(HospitalVeterinario h:hosp){
                System.out.println(h.getNome());
            }

            /*System.out.println("Selecione o Desejado");

            HospitalVeterinario h1 = new HospitalVeterinario();
            h1.setCidade("Santa Mariana");
            h1.setNome("Hospital SM");

            HospitalVeterinario selecionado = ph.selecionaHospitalDesejado(hosp,h1);

            if(selecionado == null)
                System.out.println("Caso não foi selecionado");

            System.out.println("Caracteristicas");
            System.out.println(selecionado.getNome());
            System.out.println(selecionado.getCidade());*/

            return true;
        }
        else{
            System.out.println("Nenhum Hospital Encontado");
             return false;
        }

    }
    public boolean cadastrarAnimal(){
        CCadastrarAnimal ca = new CCadastrarAnimal();

        Animal a = new Animal();
        Cliente c = new Cliente();

        c.setLogin("erikson");


        a.setNome("toto");
        a.setGenero("M");
        a.setDono(c.getLogin());
        a.setPedigree(120037);
        a.setRaca("vira lata");
        a.setTamanho("medio");

        if(ca.CadastrarAnimal(a))
            return true;

        return false;

    }
    public boolean cadastrarVeterinario(){
        Veterinario v = new Veterinario();
        CCadastrarVeterinario cv = new CCadastrarVeterinario();

        v.setNome("Erikson");
        v.setEmail("erikson@gmail.com");
        v.setAgencia(123456);
        v.setBanco("BB");
        v.setNumConta(123456);
        v.setEspecialidade("Pequenos");
        v.setSenha("eriksonVet");
        v.setLogin("erik123456");
        v.setCidade("Santa Mariana");
        v.setCrmv(120037);


        if(cv.cadastrarVeterinario(v))
            return true;

        return false;
    }
    public boolean pesquisarVeterinario(){
        //Veterinario v = new Veterinario();
        CPesquisarVeterinario cv = new CPesquisarVeterinario();



        ArrayList<Veterinario> vets = cv.pesquisarVeterinario("Santa Mariana");

        if(!vets.isEmpty()){
            for(Veterinario v:vets){
                System.out.println(v.getCrmv());
            }
            return true;
        }
        else {
            System.out.println("Veterinario Não Encontrado");
            return false;
        }


    }
    public boolean cadatrarAlergia(){
        CCadastrarAlergia ca = new CCadastrarAlergia();

        AnimalAlergia al = new AnimalAlergia();
        Alergia aler = new Alergia();

        aler.setAlergia("nao sei");
        Animal a = new Animal();

        a.setNome("toto");


        al.setAlergia(aler);
        al.setAnimal(a);
        Date data = new Date();
        al.setDataCadastro(data);

        if(ca.CadastrarAlergia(al))
            return true;

        return false;

    }
    public boolean cadatrarVacinas(){
        CCadastrarVacina cv = new CCadastrarVacina();

        AnimalVacina av = new AnimalVacina();
        Vacina vc = new Vacina();

        vc.setVacina("Raiva");
        Animal a = new Animal();

        a.setNome("totozinho");


        av.setVancina(vc);
        av.setAnimal(a);
        Date data = new Date();
        av.setData(data);

        if(cv.CadastrarVacina(av))
            return true;

        return false;

    }
    public boolean marcarConsulta(){
        CMarcarConsulta cm = new CMarcarConsulta();
        CPesquisarVeterinario pesquisaVets = new CPesquisarVeterinario();
        CCadastrarAnimal cAnimal = new CCadastrarAnimal();
        Consulta consulta = new Consulta();
        ItemConsulta item = new ItemConsulta();

        String localidade  = "Santa Mariana";
        Usuario user = Usuario.getInstance();

        user.setLogin("erikson");

        ArrayList<Animal> lAnimal = cAnimal.BuscarAnimal(user.getLogin());


        ArrayList<Veterinario> vet = pesquisaVets.pesquisarVeterinario(localidade);

        item.setAnimal(cm.selecionaAnimal(0,lAnimal));
        Date date = new Date();
        item.setDataConsulta(date);
        consulta.setLocal(localidade);
        consulta.setDescricao("O animal está com a pata machucada");
        item.setConsulta(consulta);
        item.setVeterinario(cm.selecionaVeterinario(0,vet));

        //verifica a disponibilidade do veterinario
        if(!item.getVeterinario().isDisponivel()){
            System.out.println("Veterinario sobrecarredo");
            return false;
        }

        if(cm.marcarConsulta(item)){
            System.out.println("Consulta Marcada com sucesso");
            return true;
        }
        else{
            System.out.println("Erro ao Marcar Consulta");
            return false;
        }

    }
    public boolean verHistoricoDeConsultas(){
        return false;
    }
    public boolean consultarAgenda(){
        return false;
    }
    public boolean notificarConsulta(){
        return false;
    }

}