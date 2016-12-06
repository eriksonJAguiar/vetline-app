package com.app.vetline.vetline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Button btn_pagina_principal1 = (Button)findViewById(R.id.btn_pagina_principal);
    Button btn_cadastrar_animal1 = (Button) findViewById(R.id.btn_cadastrar_animal);
    Button btn_cadastrar_consulta1 = (Button) findViewById(R.id.btn_cadastrar_consulta);
    Button btn_cadastrar_usuario1 = (Button) findViewById(R.id.btn_cadastrar_usuario);
    Button btn_edicao_animal = (Button) findViewById(R.id.btn_edicao_animal);

    btn_pagina_principal1

    Intent tela_cadastro_animal = new Intent(this,Tela_pagina_principal.class);

}
