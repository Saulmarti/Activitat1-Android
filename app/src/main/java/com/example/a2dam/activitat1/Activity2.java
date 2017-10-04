package com.example.a2dam.activitat1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Activity2 extends AppCompatActivity implements View.OnClickListener{
    private EditText et_edad;
    TextView benv;
    private Button botonEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        botonEdad = (Button) findViewById(R.id.boton_edad);
        et_edad = (EditText) findViewById(R.id.editText_edad);
        benv = (TextView) findViewById( R.id.bienvenida );



        Intent i=getIntent();
        Bundle extras =i.getExtras();
        if (extras != null) {
            String datoNombre=(String)extras.get("nombre");
            String datoSexo=(String)extras.get("sexo");

            benv.setText("Hola "+datoNombre+" indica tu edad");
        };

        botonEdad.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i2;

        i2 = new Intent(this,Activity1.class);
        String ediEdad=et_edad.getText().toString();
        



       i2.putExtra("edad",ediEdad);


        startActivity(i2);
    }
}
