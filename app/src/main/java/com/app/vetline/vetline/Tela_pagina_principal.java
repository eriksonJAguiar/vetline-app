package com.app.vetline.vetline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by ProBook on 06/12/2016.
 */

public class Tela_pagina_principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_pagina_principal);
        getSupportActionBar().hide();

        ImageButton editar_perfil1 = (ImageButton) findViewById(R.id.btn_editar_perfil);
        final Intent editar_perfil = new Intent(this, Tela_editar_usuario.class);
        editar_perfil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(editar_perfil);
            }
        });
        Button btn_agenda1 = (Button) findViewById(R.id.btn_agenda);
        final Intent agenda = new Intent(this, Tela_mostrar_agenda_veterinario.class);
        btn_agenda1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(agenda);
            }
        });
        Button btn_clinica1 = (Button) findViewById(R.id.btn_clinica);
        final Intent tela_clinicas = new Intent(this, Tela_mostrar_clinicas_veterinario.class);
        btn_clinica1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(tela_clinicas);
            }
        });
        Button btn_adicionar1 = (Button) findViewById(R.id.btn_adicionar);
        final Intent tela_adicionar_animal = new Intent(this, Tela_cadastrar_animal.class);
        btn_adicionar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(tela_adicionar_animal);
            }
        });
        ImageButton btn_editar_animal = (ImageButton) findViewById(R.id.btn_animal_editar);
        final Intent tela_editar_animal = new Intent(this, Tela_editar_animal.class);
        btn_editar_animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(tela_editar_animal);
            }
        });
        Button btn_animal_consulta = (Button) findViewById(R.id.btn_animal_consulta);
        final Intent tela_animal_consulta = new Intent(this, Tela_mostrar_consultas_animal.class);
        btn_animal_consulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(tela_animal_consulta);
            }
        });
        Button btn_animal_vacinas = (Button) findViewById(R.id.btn_animal_vacina);
        final Intent tela_animal_consultas = new Intent(this, Tela_mostrar_vacinas.class);
        btn_animal_vacinas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(tela_animal_consultas);
            }
        });
        Button btn_animal_alergias = (Button) findViewById(R.id.btn_animal_alergias);
        final Intent tela_animal_alergias = new Intent(this, Tela_mostrar_alergias.class);
        btn_animal_alergias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(tela_animal_alergias);
            }
        });
    }
}