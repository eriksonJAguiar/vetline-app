package com.app.vetline.vetline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        Button btn_pagina_principal1 = (Button)findViewById(R.id.btn_pagina_principal);
        Button btn_cadastrar_animal1 = (Button) findViewById(R.id.btn_cadastrar_animal);
        Button btn_cadastrar_consulta1 = (Button) findViewById(R.id.btn_cadastrar_consulta);
        Button btn_cadastrar_usuario1 = (Button) findViewById(R.id.btn_cadastrar_usuario);
        Button btn_edicao_animal = (Button) findViewById(R.id.btn_edicao_animal);
        Button btn_redefinir_senha1 = (Button) findViewById(R.id.btn_redefinir_senha);

        final Intent pagina_principal = new Intent(this, Tela_pagina_principal.class);
        final Intent cadastrar_animal1 = new Intent(this, Tela_cadastrar_animal.class);
        final Intent cadastrar_consulta1 = new Intent(this, Tela_cadastrar_consulta.class);
        final Intent cadastrar_usuario1 = new Intent(this, Tela_cadastrar_usuario.class);
        final Intent edicao_animal = new Intent(this, Tela_edicao_animal.class);
        final Intent redefinir_senha = new Intent(this, Tela_redefinir_senha.class);


        btn_pagina_principal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(pagina_principal);

            }
        });
        btn_cadastrar_animal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(cadastrar_animal1);
            }
        });
        btn_cadastrar_consulta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(cadastrar_consulta1);
            }
        });
        btn_edicao_animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(edicao_animal);
            }
        });
        btn_cadastrar_usuario1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(cadastrar_usuario1);
            }
        });
        btn_redefinir_senha1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(redefinir_senha);
            }
        });



    }


}
