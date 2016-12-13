package com.app.vetline.vetline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import controller.CCadastrarAnimal;
import controller.CDadosAnimal;
import model.Animal;

/**
 * Created by ProBook on 06/12/2016.
 */

public class Tela_mostrar_alergias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_mostrar_alergias);
        getSupportActionBar().hide();
/*
        Animal animal = new Animal(); // recebe o animal da tela anterior
        Animal animalTela = new Animal(); // recebe o animal da tela anterior
        CDadosAnimal cDadosAnimal = new CDadosAnimal();
        animalTela = cDadosAnimal.carregaDados(animal);

        TextView nomeAnimal = (TextView) findViewById(R.id.view_nomeAlergia);
        TextView racaAnimal = (TextView) findViewById(R.id.view_RacaAlergia);

        nomeAnimal.setText("NOME:" + animalTela.getNome());
        racaAnimal.setText("RAÇA:" + animalTela.getRaca());
*/
        /*Carrega uma listview com botãos
        *
        *
        *
        */

        Button novaAlergia = (Button) findViewById(R.id.btn_adicionarAlergias);
        novaAlergia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ir para uma nova tela que adiciona Alergias
            }
        });

    }
}
