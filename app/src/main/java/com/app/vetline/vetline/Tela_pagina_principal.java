package com.app.vetline.vetline;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import Dao.ClienteDAO;
import model.Cliente;
import model.Usuario;

/**
 * Created by ProBook on 06/12/2016.
 */

public class Tela_pagina_principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_pagina_principal);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        getSupportActionBar().hide();

        TextView view_nomePrincipal = (TextView) findViewById(R.id.view_nomePrincipal);
        Usuario user = Usuario.getInstance();
        ClienteDAO dao = new ClienteDAO();
        Cliente c = new Cliente();
        c.setLogin(user.login);
        c.setSenha(user.senha);

        //view_nomePrincipal.setText("NOME: "+dao.buscar(c).getNome());
/*
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
        */
        Button btn_adicionar1 = (Button) findViewById(R.id.btn_adicionar);
        final Intent tela_adicionar_animal = new Intent(this, Tela_cadastrar_animal.class);
        btn_adicionar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(tela_adicionar_animal);
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
        Button btn_animal_id1 = (Button) findViewById(R.id.btn_animal_id);
        btn_animal_id1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final LinearLayout animal_id_show = (LinearLayout) findViewById(R.id.layout_op_animal_id);
                if(animal_id_show.getVisibility() == View.INVISIBLE) {
                    animal_id_show.setVisibility(View.VISIBLE);


                    final View animatedView = (View) findViewById(R.id.layout_op_animal_id);
                    final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView.getLayoutParams();
                    ValueAnimator animator = ValueAnimator.ofInt(params.topMargin, params.WRAP_CONTENT);
                    animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            params.topMargin = (Integer) valueAnimator.getAnimatedValue();
                            animatedView.requestLayout();
                        }
                    });
                    animator.setDuration(300);
                    animator.start();
                }else{
                    animal_id_show.setVisibility(View.INVISIBLE);


                    final View animatedView = (View) findViewById(R.id.layout_op_animal_id);
                    final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView.getLayoutParams();
                    ValueAnimator animator = ValueAnimator.ofInt(params.topMargin, params.WRAP_CONTENT);
                    animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            params.topMargin = (Integer) valueAnimator.getAnimatedValue();
                            animatedView.requestLayout();
                        }
                    });
                    animator.setDuration(300);
                    animator.start();

                }
            }
        });

    }
}