package com.app.vetline.vetline;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import controller.CCadastrarAnimal;
import controller.CCadastrarCliente;
import model.Animal;
import model.Cliente;
import model.Usuario;

/**
 * Created by ProBook on 06/12/2016.
 */

public class Tela_cadastrar_animal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastrar_animal);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        getSupportActionBar().hide();

        final Usuario user = Usuario.getInstance();


        List<String> tamanhos = new ArrayList<String>();
        tamanhos.add("Pequeno");
        tamanhos.add("Medio");
        tamanhos.add("Grande");

        Spinner spn1 = (Spinner) findViewById(R.id.campo_tamanho);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, tamanhos);
        ArrayAdapter<String> spinnerArrayAdapter = arrayAdapter;
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spn1.setAdapter(spinnerArrayAdapter);

        List<String> genero = new ArrayList<String>();
        genero.add("Masculino");
        genero.add("Feminino");

        Spinner spn11 = (Spinner) findViewById(R.id.campo_genero);
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, genero);
        ArrayAdapter<String> spinnerArrayAdapter1 = arrayAdapter1;
        spinnerArrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spn11.setAdapter(spinnerArrayAdapter1);

        Button btn_cadastrarAnimal = (Button) findViewById(R.id.btn_cadastraranimal);
        btn_cadastrarAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animal animalOb;
                EditText nomeAnimal = (EditText) findViewById(R.id.campo_nomeAnimal);
                EditText numPedigree = (EditText) findViewById(R.id.campo_num_pedigree);
                EditText raca = (EditText) findViewById(R.id.campo_raca);
                Spinner tamanho = (Spinner) findViewById(R.id.campo_tamanho);
                Spinner genero = (Spinner) findViewById(R.id.campo_genero);

                String nomeAnimalStr = nomeAnimal.getText().toString();
                String numPedigrees = numPedigree.getText().toString();
                String racaStr = raca.getText().toString();
                String tamanhoStr = tamanho.getSelectedItem().toString();
                String generoStr = genero.getSelectedItem().toString();

                try {
                    animalOb = new Animal();

                    animalOb.setNome(nomeAnimalStr);
                    if (animalOb.getNome().isEmpty()) {
                        throw new Exception("Nome vazio!");
                    }
                    animalOb.setPedigree(Integer.parseInt(numPedigrees));
                    if (animalOb.getPedigree() == 0) {
                        throw new Exception("Numero vazio!");
                    }
                    animalOb.setRaca(racaStr);
                    if (animalOb.getRaca().isEmpty()) {
                        throw new Exception("raca vazio!");
                    }
                    animalOb.setGenero(generoStr);
                    if (animalOb.getGenero().isEmpty()) {
                        throw new Exception("Endereço vazio!");
                    }
                    animalOb.setTamanho(tamanhoStr);
                    if (animalOb.getTamanho().isEmpty()) {
                        throw new Exception("Numero vazio!");
                    }

                    CCadastrarAnimal CCadastrarAnimal = new CCadastrarAnimal();
                    if (CCadastrarAnimal.cadastrarAnimal(animalOb)) {
                        final LinearLayout camposVet2 = (LinearLayout) findViewById(R.id.mensagens);
                        camposVet2.setVisibility(View.VISIBLE);
                        camposVet2.setBackgroundResource(R.drawable.screen_border_sucesso);
                        camposVet2.setMinimumHeight(210);
                        TextView msg = (TextView) findViewById(R.id.msg);
                        msg.setTextColor(Color.parseColor("#3c763d"));
                        msg.setText("SUCESSO: Cadastrado com sucesso");

                        final View animatedView2 = (View) findViewById(R.id.btn_cadastraranimal);
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
                else {

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

                    final View animatedView2 = (View) findViewById(R.id.btn_cadastraranimal);
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