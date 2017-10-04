package com.example.a2dam.activitat1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity implements View.OnClickListener {
    private EditText et_nombre;
    private Button boton_info;
    TextView textEdad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton_info = (Button) findViewById(R.id.boton_info);
        et_nombre = (EditText) findViewById(R.id.editText_nombre);
        textEdad = (TextView) findViewById(R.id.textEdad);


        Intent i2=getIntent();
        Bundle extras2 =i2.getExtras();
        if (extras2 != null) {
            String datoEdad=(String)extras2.get("edad");

            textEdad.setText("Tienes "+datoEdad+" años");
        };


            boton_info.setOnClickListener(this);

        }
        @Override
        public void onClick(View v) {

            Intent i;


            i = new Intent(this,Activity2.class);
            String ediNombre=et_nombre.getText().toString();


            i.putExtra("nombre",ediNombre);


            startActivity(i);
        }

    }

