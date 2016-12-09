package com.app.vetline.vetline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ProBook on 06/12/2016.
 */

public class Tela_mostrar_consultas_animal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_mostrar_consultas_animal);
        getSupportActionBar().hide();
    }
}
