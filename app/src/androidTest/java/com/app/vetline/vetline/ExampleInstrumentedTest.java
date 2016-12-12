package com.app.vetline.vetline;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

import org.junit.Test;
import org.junit.runner.RunWith;

import model.Cliente;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        assertTrue(gravou());
    }
    public boolean gravou(){

        try {
            MongoClient mongo = new MongoClient("localhost",27017);
            MongoDatabase db = mongo.getDatabase("vetline");


            Cliente c = new Cliente();

            c.setNome("erikson");
            c.setEmail("erjulioaguiar@gmail.com");


            BasicDBObject basicDBObject = new BasicDBObject("cliente",c);



            DBCollection coll = (DBCollection) db.getCollection("clientes");

            coll.save(basicDBObject);

            return true;


        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }
}
