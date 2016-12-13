package com.app.vetline.vetline;

import android.content.Intent;
import android.graphics.Color;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import controller.CFazerLogin;
import model.Usuario;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        getSupportActionBar().hide();

        final EditText campo_usuario1 = (EditText) findViewById(R.id.campo_nomeUsuario);
        final EditText campo_senha1 = (EditText) findViewById(R.id.campo_senha);


        final Button btn_logar1 = (Button) findViewById(R.id.btn_logar);
        final Button btn_cadastrar1 = (Button) findViewById(R.id.btn_cadastrar);

        final Intent pagina_principal1 = new Intent(this, Tela_pagina_principal.class);
        final Intent pagina_cadastro = new Intent(this, Tela_cadastrar_usuario.class);

        btn_logar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Usuario user = Usuario.getInstance();
                CFazerLogin login = new CFazerLogin();

                user.setLogin(campo_usuario1.getText().toString());
                user.setSenha(campo_senha1.getText().toString());
                if(login.fazerLogin(user) == true){
                    final LinearLayout camposVet2 = (LinearLayout) findViewById(R.id.mensagens);
                    camposVet2.setVisibility(View.VISIBLE);
                    camposVet2.setBackgroundResource(R.drawable.screen_border_sucesso);
                    camposVet2.setMinimumHeight(210);
                    TextView msg = (TextView) findViewById(R.id.msg);
                    msg.setTextColor(Color.parseColor("#a94442"));
                    msg.setText("Logado com sucesso, Aguarde voce ta sendo redicionado!.");
                    startActivity(pagina_principal1);
                }else{
                    final LinearLayout camposVet2 = (LinearLayout) findViewById(R.id.mensagens);
                    camposVet2.setVisibility(View.VISIBLE);
                    camposVet2.setBackgroundResource(R.drawable.screen_border_falha);
                    camposVet2.setMinimumHeight(210);
                    TextView msg = (TextView) findViewById(R.id.msg);
                    msg.setTextColor(Color.parseColor("#a94442"));
                    msg.setText("ERROR: Usuario incorreto");


                }
            }
        });
        btn_cadastrar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(pagina_cadastro);
            }
        });
        Button btn_redefinir1 = (Button) findViewById(R.id.btn_redefinirSenha);
        final Intent tela_redefinir = new Intent(this, Tela_redefinir_senha.class);
        btn_redefinir1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(tela_redefinir);
            }
        });


    }


}
