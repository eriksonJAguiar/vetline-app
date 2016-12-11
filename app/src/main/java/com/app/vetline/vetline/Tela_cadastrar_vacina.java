package com.app.vetline.vetline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import controller.CCadastrarVacina;
import model.Vacina;

/**
 * Created by ProBook on 06/12/2016.
 */

public class Tela_cadastrar_vacina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastrar_vacina);
        getSupportActionBar().hide();

        Button adicionarClinica = (Button) findViewById(R.id.btn_cadastarVacina);
        adicionarClinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vacina vac = new Vacina();
                CCadastrarVacina cCadastrarVacina = new CCadastrarVacina();

                EditText vacina = (EditText) findViewById(R.id.campo_vacina);
                EditText data = (EditText) findViewById(R.id.campo_dataVacina);
                EditText descricao = (EditText) findViewById(R.id.campo_descricaoVacina);
                EditText validade = (EditText) findViewById(R.id.campo_validade);

                vac.setDescricao(vacina.getText().toString());
                vac.setData(data.getText().toString());
                vac.setDescricao(descricao.getText().toString());
                vac.setValidaAte(validade.getText().toString());

            }
        });
    }
}
