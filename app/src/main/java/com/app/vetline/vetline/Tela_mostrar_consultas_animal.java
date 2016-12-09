package com.app.vetline.vetline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ProBook on 06/12/2016.
 */

public class Tela_mostrar_consultas_animal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_mostrar_consultas_animal);
        getSupportActionBar().hide();

        Button btn_adicionar1 = (Button) findViewById(R.id.btn_adicionar);
        final Intent tela_mapa = new Intent(this, Tela_mapa.class);
        btn_adicionar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(tela_mapa);
            }
        });
    }
}
