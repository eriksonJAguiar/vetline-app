package com.app.vetline.vetline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ProBook on 06/12/2016.
 */

public class Tela_editar_animal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_editar_animal);
        getSupportActionBar().hide();

        List<String> tamanhos = new ArrayList<String>();
        tamanhos.add("Pequeno");
        tamanhos.add("Medio");
        tamanhos.add("Grande");

        Spinner spn1 = (Spinner) findViewById(R.id.campo_tamanho);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, tamanhos);
        ArrayAdapter<String> spinnerArrayAdapter = arrayAdapter;
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spn1.setAdapter(spinnerArrayAdapter);

        List<String> genero = new ArrayList<String>();
        genero.add("Masculino");
        genero.add("Feminino");

        Spinner spn11 = (Spinner) findViewById(R.id.campo_genero);
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, genero);
        ArrayAdapter<String> spinnerArrayAdapter1 = arrayAdapter1;
        spinnerArrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spn11.setAdapter(spinnerArrayAdapter1);
    }
}