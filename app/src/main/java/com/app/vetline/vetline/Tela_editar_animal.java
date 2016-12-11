package com.app.vetline.vetline;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.Bundle;
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
import controller.CDadosAnimal;
import model.Animal;

/**
 * Created by ProBook on 06/12/2016.
 */

public class Tela_editar_animal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_editar_animal);
        getSupportActionBar().hide();


        Animal a = new Animal(); ///Carrega o animal passado por parametro da tela passada

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

        EditText nomeAnimal = (EditText)findViewById(R.id.campo_nomeAnimalEdicao);
        EditText pedigree = (EditText) findViewById(R.id.campo_num_pedigreeEditar);
        EditText raca = (EditText) findViewById(R.id.campo_racaEditar);
        Spinner tamanho = (Spinner) findViewById(R.id.campo_tamanhoEditar);
        Spinner gener = (Spinner) findViewById(R.id.campo_generoEditar);

        final CDadosAnimal cDadosAnimal = new CDadosAnimal();

        Animal animal = cDadosAnimal.carregaDados(a);

        nomeAnimal.setText(animal.getNome());
        pedigree.setText(animal.getPedigree());
        raca.setText(animal.getRaca());

        //seta o valor do Genero do Animal a ser editado
        if(animal.getGenero().equals("Masculino")){
            int spinnerPosition = arrayAdapter1.getPosition(animal.getGenero());
            spn11.setSelection(spinnerPosition);
            spinnerPosition = 0;
        }
        else if(animal.getGenero().equals("Feminino")){
            int spinnerPosition = arrayAdapter1.getPosition(animal.getGenero());
            spn11.setSelection(spinnerPosition);
            spinnerPosition = 0;
        }

        //seta o valor do Tamanho do Animal a ser editado
        if(animal.getTamanho().equals("Pequeno")){
            int spinnerPosition = arrayAdapter1.getPosition(animal.getTamanho());
            spn1.setSelection(spinnerPosition);
            spinnerPosition = 0;
        }
        else if(animal.getTamanho().equals("Medio")){
            int spinnerPosition = arrayAdapter1.getPosition(animal.getTamanho());
            spn1.setSelection(spinnerPosition);
            spinnerPosition = 0;
        }
        else if(animal.getTamanho().equals("Grande")){
            int spinnerPosition = arrayAdapter1.getPosition(animal.getTamanho());
            spn1.setSelection(spinnerPosition);
            spinnerPosition = 0;
        }

        Button editarAnimal = (Button) findViewById(R.id.btn_editarAnimal);
        editarAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nomeAnimal = (EditText)findViewById(R.id.campo_nomeAnimalEdicao);
                EditText pedigree = (EditText) findViewById(R.id.campo_num_pedigreeEditar);
                EditText raca = (EditText) findViewById(R.id.campo_racaEditar);
                Spinner tamanho = (Spinner) findViewById(R.id.campo_tamanhoEditar);
                Spinner gener = (Spinner) findViewById(R.id.campo_generoEditar);

                String nomeAnimalStr = nomeAnimal.getText().toString();
                String numPedigrees = pedigree.getText().toString();
                String racaStr = raca.getText().toString();
                String tamanhoStr = tamanho.getSelectedItem().toString();
                String generoStr = gener.getSelectedItem().toString();
                try {
                    Animal animalOb = new Animal();

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
                        throw new Exception("Genero vazio!");
                    }
                    animalOb.setTamanho(tamanhoStr);
                    if (animalOb.getTamanho().isEmpty()) {
                        throw new Exception("Tamanho vazio!");
                    }


                    CDadosAnimal CDadosAnimal = new CDadosAnimal();
                    if (CDadosAnimal.editaDadosAnimal(animalOb)) {
                        final LinearLayout camposVet2 = (LinearLayout) findViewById(R.id.mensagens);
                        camposVet2.setVisibility(View.VISIBLE);
                        camposVet2.setBackgroundResource(R.drawable.screen_border_sucesso);
                        camposVet2.setMinimumHeight(210);
                        TextView msg = (TextView) findViewById(R.id.msg);
                        msg.setTextColor(Color.parseColor("#3c763d"));
                        msg.setText("SUCESSO: Atualizado com sucesso");

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
                    else {
                        try {
                            throw new Exception("Nao e possivel Atualizar");
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
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
        });

        Button resetarAnimal = (Button) findViewById(R.id.btn_resetarAnimal);
        resetarAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recreate();
                // recarregar pagina
            }
        });

        Button apagarAnimal = (Button) findViewById(R.id.btn_apagarAnimal);
        apagarAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animal a = new Animal(); // recebe o animal que foi selecionado na tela
                CDadosAnimal cDadosAnimal1 = new CDadosAnimal();
                cDadosAnimal1.excluiAnimal(a);
            }
        });

    }
}