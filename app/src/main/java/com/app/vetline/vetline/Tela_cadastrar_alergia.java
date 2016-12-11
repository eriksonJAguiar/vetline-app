package com.app.vetline.vetline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import controller.CCadastrarAlergia;
import model.Alergia;

/**
 * Created by ProBook on 06/12/2016.
 */

public class Tela_cadastrar_alergia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastrar_alergia);
        getSupportActionBar().hide();



        Button adicionarClinica = (Button) findViewById(R.id.btn_cadastarAlergia);
        adicionarClinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alergia al = new Alergia();
                CCadastrarAlergia cCadastrarAlergia = new CCadastrarAlergia();

                EditText alergia = (EditText) findViewById(R.id.campo_Alergia);
                EditText descricao = (EditText) findViewById(R.id.campo_descricaoAlergia);

                al.setAlergia(alergia.getText().toString());
                al.setDescricao(alergia.getText().toString());

                cCadastrarAlergia.inserirAlergia(al);

            }
        });
    }
}
