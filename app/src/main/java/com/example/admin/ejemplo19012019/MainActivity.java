package com.example.admin.ejemplo19012019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.suma.SegundoActivity;
import com.example.suma.Sumar;

public class MainActivity extends AppCompatActivity {

    //mandar globales - Funciona como controlador
    Button boton;
    TextView texto;
    Button boton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //conectar la vista con el controlador
        boton = findViewById(R.id.btnVer);
        texto = findViewById(R.id.txtTexto);
        boton2 = findViewById(R.id.btnDos);
        //clic en el boton
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(getApplicationContext(),SegundoActivity.class));
            }
        });
    }

    public void clickAqui(View vista){
        texto.setText("I'm be back");
    }
}
