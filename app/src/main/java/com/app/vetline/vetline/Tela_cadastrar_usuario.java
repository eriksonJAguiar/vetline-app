package com.app.vetline.vetline;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import com.google.android.gms.vision.text.Line;

import controller.CCadastrarVeterinario;
import model.Cliente;
import model.Veterinario;
import controller.CCadastrarCliente;

/**
 * Created by ProBook on 06/12/2016.
 */

public class Tela_cadastrar_usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastrar_usuario);
        getSupportActionBar().hide();
        final View animatedView = (View) findViewById(R.id.layoutVerificaUsuario);
        final View teste1 = (View) findViewById(R.id.layoutVerificaVeterinario);

        final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView.getLayoutParams();
        final LinearLayout.LayoutParams params22 = (LinearLayout.LayoutParams) teste1.getLayoutParams();
        params22.height=0;

        final LinearLayout camposUsuario = (LinearLayout) findViewById(R.id.layoutVerificaUsuario);
        final LinearLayout camposVet = (LinearLayout) findViewById(R.id.layoutVerificaVeterinario);

        camposVet.setVisibility(View.INVISIBLE);
        final Switch mudarOP = (Switch) findViewById(R.id.campo_veterinario);
        mudarOP.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(camposVet.getVisibility() == View.VISIBLE){
                        camposVet.setVisibility(View.INVISIBLE);

                    camposUsuario.setVisibility(View.VISIBLE);
                    params22.height=0;
                    params.height=params.WRAP_CONTENT;



                    final View animatedView = (View) findViewById(R.id.camposAutenticacao);
                    final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView.getLayoutParams();
                    ValueAnimator animator = ValueAnimator.ofInt(params.topMargin, params.WRAP_CONTENT);
                    animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator valueAnimator)
                        {
                            params.topMargin = (Integer) valueAnimator.getAnimatedValue();
                            animatedView.requestLayout();
                        }
                    });
                    animator.setDuration(300);
                    animator.start();



                }else{
                    camposVet.setVisibility(View.VISIBLE);
                    camposUsuario.setVisibility(View.INVISIBLE);
                    params.height=0;
                    params22.height=params.WRAP_CONTENT;
                    final View animatedView = (View) findViewById(R.id.camposAutenticacao);
                    final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView.getLayoutParams();
                    ValueAnimator animator = ValueAnimator.ofInt(params.topMargin, params.WRAP_CONTENT);
                    animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator valueAnimator)
                        {
                            params.topMargin = (Integer) valueAnimator.getAnimatedValue();
                            animatedView.requestLayout();
                        }
                    });
                    animator.setDuration(300);
                    animator.start();

                }
            }
        });
        Button btn_cadastrar1 = (Button) findViewById(R.id.btn_cadastar);
        btn_cadastrar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cliente user;
                Veterinario vet;
                String nome_completo = findViewById(R.id.campo_usuario).toString();
                String email = findViewById(R.id.campo_usuario).toString();
                String telefone = findViewById(R.id.campo_usuario).toString();
                String usuario = findViewById(R.id.campo_usuario).toString();
                String senha = findViewById(R.id.campo_usuario).toString();


                String crmv;
                if(mudarOP.isChecked()){
                    try {
                        crmv = findViewById(R.id.campo_crmv).toString();
                        vet = new Veterinario();
                        /*vet.setEmail(email);
                        if (vet.getEmail().isEmpty()) {
                            throw new Exception("Email vazio!");
                        }
                        vet.setNome(nome_completo);
                        if (vet.getNome().isEmpty()) {
                            throw new Exception("Nome Completo vazio!");
                        }
                        vet.setTelefone(telefone);
                        if (vet.getTelefone().isEmpty()) {
                            throw new Exception("Telefone vazio!");
                        }
                        vet.setLogin(usuario);
                        if (vet.getLogin().isEmpty()) {
                            throw new Exception("Usuario vazio!");
                        }
                        vet.setSenha(senha);
                        if (vet.getSenha().isEmpty()) {
                            throw new Exception("Senha vazia!");
                        }
                        vet.setCrmv(crmv);
                        if (vet.getCrmv().isEmpty()) {
                            throw new Exception("CRMV vazio!");
                        }
                        */
                        CCadastrarVeterinario CCadastrarVeterinario = new CCadastrarVeterinario();
                        if (CCadastrarVeterinario.cadastrarVeterinario(vet)) {
                            final LinearLayout camposVet2 = (LinearLayout) findViewById(R.id.mensagens);
                            camposVet2.setVisibility(View.VISIBLE);
                            camposVet2.setBackgroundResource(R.drawable.screen_border_sucesso);
                            camposVet2.setMinimumHeight(210);
                            TextView msg = (TextView) findViewById(R.id.msg);
                            msg.setTextColor(Color.parseColor("#3c763d"));
                            msg.setText("SUCESSO: Veterinario cadastrado com sucesso");

                            final View animatedView2 = (View) findViewById(R.id.btn_cadastar);
                            final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView2.getLayoutParams();
                            ValueAnimator animator = ValueAnimator.ofInt(params.topMargin, params.WRAP_CONTENT);
                            animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    params.topMargin = (Integer) valueAnimator.getAnimatedValue();
                                    animatedView2.requestLayout();
                                }
                            });
                            animator.setDuration(300);
                            animator.start();
                        } else {
                                throw new Exception("Nao e possivel cadastrar");
                        }
                    }catch (Exception e){
                        final LinearLayout camposVet2 = (LinearLayout) findViewById(R.id.mensagens);
                        camposVet2.setVisibility(View.VISIBLE);
                        camposVet2.setBackgroundResource(R.drawable.screen_border_falha);
                        camposVet2.setMinimumHeight(210);
                        TextView msg = (TextView) findViewById(R.id.msg);
                        msg.setTextColor(Color.parseColor("#a94442"));
                        msg.setText("ERROR: "+e.getMessage());

                        final View animatedView2 = (View) findViewById(R.id.btn_cadastar);
                        final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView2.getLayoutParams();
                        ValueAnimator animator = ValueAnimator.ofInt(params.topMargin, params.WRAP_CONTENT);
                        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                params.topMargin = (Integer) valueAnimator.getAnimatedValue();
                                animatedView2.requestLayout();
                            }
                        });
                        animator.setDuration(300);
                        animator.start();
                    }

                }else{
                    try {
                        user = new Cliente();
                        /*
                        user.setEmail(email);
                        if (user.getEmail().isEmpty()) {
                            throw new Exception("Email vazio!");
                        }
                        user.setNome(nome_completo);
                        if (user.getNome().isEmpty()) {
                            throw new Exception("Nome vazio!");
                        }
                        user.setTelefone(telefone);
                        if (user.getTelefone().isEmpty()) {
                            throw new Exception("Telefone vazio!");
                        }
                        user.setLogin(usuario);
                        if (user.getLogin().isEmpty()) {
                            throw new Exception("Usuario vazio!");
                        }
                        user.setSenha(senha);
                        if (user.getSenha().isEmpty()) {
                            throw new Exception("Senha vazio!");
                        }
                        */
                        CCadastrarCliente CCadastrarCliente = new CCadastrarCliente();
                        if (CCadastrarCliente.cadastrarCliente(user)) {
                            final LinearLayout camposVet2 = (LinearLayout) findViewById(R.id.mensagens);
                            camposVet2.setVisibility(View.VISIBLE);
                            camposVet2.setBackgroundResource(R.drawable.screen_border_sucesso);
                            camposVet2.setMinimumHeight(210);
                            TextView msg = (TextView) findViewById(R.id.msg);
                            msg.setTextColor(Color.parseColor("#3c763d"));
                            msg.setText("SUCESSO: Cadastrado com sucesso");

                            final View animatedView2 = (View) findViewById(R.id.btn_cadastar);
                            final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView2.getLayoutParams();
                            ValueAnimator animator = ValueAnimator.ofInt(params.topMargin, params.WRAP_CONTENT);
                            animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    params.topMargin = (Integer) valueAnimator.getAnimatedValue();
                                    animatedView2.requestLayout();
                                }
                            });
                            animator.setDuration(300);
                            animator.start();
                        } else {
                            throw new Exception("Mao e possivel cadastrar");
                        }

                    }catch (Exception e){
                        final LinearLayout camposVet2 = (LinearLayout) findViewById(R.id.mensagens);
                        camposVet2.setVisibility(View.VISIBLE);
                        camposVet2.setBackgroundResource(R.drawable.screen_border_falha);
                        camposVet2.setMinimumHeight(210);
                        TextView msg = (TextView) findViewById(R.id.msg);
                        msg.setTextColor(Color.parseColor("#a94442"));
                        msg.setText("ERROR: "+e.getMessage());

                        final View animatedView2 = (View) findViewById(R.id.btn_cadastar);
                        final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView2.getLayoutParams();
                        ValueAnimator animator = ValueAnimator.ofInt(params.topMargin, params.WRAP_CONTENT);
                        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                params.topMargin = (Integer) valueAnimator.getAnimatedValue();
                                animatedView2.requestLayout();
                            }
                        });
                        animator.setDuration(300);
                        animator.start();
                    }
                }


            }
        });

    }
}
