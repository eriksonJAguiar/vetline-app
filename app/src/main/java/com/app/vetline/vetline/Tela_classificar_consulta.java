package com.app.vetline.vetline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ProBook on 06/12/2016.
 */

public class Tela_classificar_consulta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_classificar_consulta);
        getSupportActionBar().hide();

        /* Carregar uma listsView com as Clinicas no Banco
        *
        *
        *
         */

        Button adicionarClinica = (Button) findViewById(R.id.btn_classificar);
        adicionarClinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ir para a tela de adicionar uma nova clinica
            }
        });
    }
}
