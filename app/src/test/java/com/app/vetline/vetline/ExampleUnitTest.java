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
import java.util.List;
import java.util.concurrent.ExecutionException;

import Dao.ClienteDao;
import controller.CCadastrarCliente;
import controller.CFazerLogin;
import model.Cliente;
import model.Usuario;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertTrue(gravou());
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

        Usuario u = new Usuario();

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


}