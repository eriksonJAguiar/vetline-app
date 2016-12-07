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
        final View animatedView = (View) findViewById(R.id.camposAutenticacao);
        final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView.getLayoutParams();
        params.topMargin= -245;
        final LinearLayout camposVet = (LinearLayout) findViewById(R.id.layoutVerificaVeterinario);
        camposVet.setVisibility(View.INVISIBLE);
        final Switch mudarOP = (Switch) findViewById(R.id.campo_veterinario);
        mudarOP.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(camposVet.getVisibility() == View.VISIBLE){
                        camposVet.setVisibility(View.INVISIBLE);



                    final View animatedView = (View) findViewById(R.id.camposAutenticacao);
                    final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView.getLayoutParams();
                    ValueAnimator animator = ValueAnimator.ofInt(params.topMargin, -245);
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
                String nome_completo = findViewById(R.id.campo_nome).toString();
                String email = findViewById(R.id.campo_nome).toString();
                String telefone = findViewById(R.id.campo_nome).toString();
                String usuario = findViewById(R.id.campo_nome).toString();
                String senha = findViewById(R.id.campo_nome).toString();


                String crmv;
                if(mudarOP.isChecked()){
                    crmv = findViewById(R.id.campo_crmv).toString();
                    vet = new Veterinario().getInstance();
                    vet.setEmail(email);
                    vet.setNome(nome_completo);
                    vet.setTelefone(telefone);
                    vet.setLogin(usuario);
                    vet.setSenha(senha);
                    vet.setCrmv(crmv);


                }else{
                    user = new Cliente().getInstance();
                    user.setEmail(email);
                    user.setNome(nome_completo);
                    user.setTelefone(telefone);
                    user.setLogin(usuario);
                    user.setSenha(senha);
                    CCadastrarCliente CCadastrarCliente = new CCadastrarCliente();
                    if(CCadastrarCliente.cadastrarCliente(user)){
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
                            public void onAnimationUpdate(ValueAnimator valueAnimator)
                            {
                                params.topMargin = (Integer) valueAnimator.getAnimatedValue();
                                animatedView2.requestLayout();
                            }
                        });
                        animator.setDuration(300);
                        animator.start();
                    }else{
                        final LinearLayout camposVet2 = (LinearLayout) findViewById(R.id.mensagens);
                        camposVet2.setVisibility(View.VISIBLE);
                        camposVet2.setBackgroundResource(R.drawable.screen_border_falha);
                        camposVet2.setMinimumHeight(210);
                        TextView msg = (TextView) findViewById(R.id.msg);
                        msg.setTextColor(Color.parseColor("#a94442"));
                        msg.setText("ERROR: Nao foi possivel cadastrar");

                        final View animatedView2 = (View) findViewById(R.id.btn_cadastar);
                        final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView2.getLayoutParams();
                        ValueAnimator animator = ValueAnimator.ofInt(params.topMargin, params.WRAP_CONTENT);
                        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public void onAnimationUpdate(ValueAnimator valueAnimator)
                            {
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
