package com.app.vetline.vetline;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;

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
        Switch mudarOP = (Switch) findViewById(R.id.campo_veterinario);
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
        String nome_completo = findViewById(R.id.campo_nome).toString();
        String email = findViewById(R.id.campo_nome).toString();
        String telefone = findViewById(R.id.campo_nome).toString();
        String usuario = findViewById(R.id.campo_nome).toString();
        String senha = findViewById(R.id.campo_nome).toString();

        String crmv;
        if(mudarOP.isChecked()){
            crmv = findViewById(R.id.campo_crmv).toString();
        }

    }
}
