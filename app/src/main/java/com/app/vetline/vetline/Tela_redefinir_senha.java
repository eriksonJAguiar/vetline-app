package com.app.vetline.vetline;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import controller.CRedefinirSenha;
import model.Usuario;

/**
 * Created by ProBook on 07/12/2016.
 */

public class Tela_redefinir_senha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_redefinir_senha);
        getSupportActionBar().hide();

        Button btn_redefinir1 = (Button) findViewById(R.id.btn_recuperar);

        btn_redefinir1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String valor = findViewById(R.id.campo).toString();
                    CRedefinirSenha CRedefinirSenha = new CRedefinirSenha();
                    Usuario a = new Usuario();
                    a.setLogin(valor);
                    CRedefinirSenha.buscaUsuario(a);

                    throw new Exception("ASDSAD");


                }catch (Exception e){
                    final LinearLayout camposVet2 = (LinearLayout) findViewById(R.id.mensagens);
                    camposVet2.setVisibility(View.VISIBLE);
                    camposVet2.setBackgroundResource(R.drawable.screen_border_falha);
                    camposVet2.setMinimumHeight(210);
                    TextView msg = (TextView) findViewById(R.id.msg);
                    msg.setTextColor(Color.parseColor("#a94442"));
                    msg.setText("ERROR: "+e.getMessage());

                    final View animatedView2 = (View) findViewById(R.id.btn_recuperar);
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
        });

    }
}