package com.example.courseracursotres_tareasemana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnSiguiente = (Button) findViewById(R.id.btnBoton);

        btnSiguiente.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DetalleDatos.class);


                EditText nombre = (EditText) findViewById(R.id.txtNombre);
                EditText telefono = (EditText) findViewById(R.id.txtTelefono);
                EditText email = (EditText) findViewById(R.id.txtEmail);
                EditText descripcion = (EditText) findViewById(R.id.txtDescripcion);
                DatePicker fecha = (DatePicker) findViewById(R.id.dpFecha);
                //Log.d("MSG","aa="+nombre.getText());
                intent.putExtra("vNombre",nombre.getText().toString());
                intent.putExtra("vTelefono",telefono.getText().toString());
                intent.putExtra("vEmail",email.getText().toString());
                intent.putExtra("vDescripcion",descripcion.getText().toString());
                intent.putExtra("vFecha",fecha.getDayOfMonth()+"-"+fecha.getMonth()+"-"+fecha.getYear());

                //Log.d("MSG","fecha="+fecha.getDayOfMonth());

                startActivity(intent);

            }
        });



    }
}