package com.app.vetline.vetline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ProBook on 06/12/2016.
 */

public class Tela_cadastrar_vacina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastrar_vacina);
        getSupportActionBar().hide();

        /* Carregar uma listsView com as Clinicas no Banco
        *
        *
        *
         */

        Button adicionarClinica = (Button) findViewById(R.id.btn_cadastar);
        adicionarClinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ir para a tela de adicionar uma nova clinica
            }
        });
    }
}
