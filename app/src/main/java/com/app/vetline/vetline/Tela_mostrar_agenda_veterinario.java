package com.app.vetline.vetline;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Size;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.google.android.gms.vision.text.Line;

import java.util.List;

import controller.CConsultarAgenda;
import model.Consulta;
import model.Vacina;
import model.Veterinario;

/**
 * Created by ProBook on 06/12/2016.
 */

public class Tela_mostrar_agenda_veterinario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_mostrar_agenda_veterinario);
        getSupportActionBar().hide();

        Veterinario v = new Veterinario();

        CConsultarAgenda CConsultarAgenda = new CConsultarAgenda();
        List<Consulta> consultas = CConsultarAgenda.ConsultaAgenda(v);
        ListView lista_consultas = (ListView) findViewById(R.id.lista_consultas);
        ArrayAdapter<Consulta> adapter = new ArrayAdapter<Consulta>(this,
                android.R.layout.simple_list_item_1, consultas);
        lista_consultas.setAdapter(adapter);

    }
}
