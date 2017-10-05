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
    int request_code = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton_info = (Button) findViewById(R.id.boton_info);
        et_nombre = (EditText) findViewById(R.id.editText_nombre);
        textEdad = (TextView) findViewById(R.id.textEdad);


        boton_info.setOnClickListener(this);
        }


        public void onClick(View v) {


           Intent i = new Intent(this,Activity2.class);
            String ediNombre=et_nombre.getText().toString();
            i.putExtra("nombre",ediNombre);

            startActivityForResult(i, request_code);
        }
        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            // TODO Auto-generated method stub
            if ((requestCode == request_code) && (resultCode == RESULT_OK)) {
                textEdad.setText(data.getDataString());
            }

        }}

