package com.example.courseracursotres_tareasemana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetalleDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_datos);


        Bundle parametros = getIntent().getExtras();

        String nombre = parametros.getString("vNombre");

        String telefono = parametros.getString("vTelefono");
        String email = parametros.getString("vEmail");
        String descripcion = parametros.getString("vDescripcion");
        String fecha = parametros.getString("vFecha");

        Log.d("MSG","bb=="+nombre);

        TextView tvNombre = (TextView) findViewById(R.id.lblNombre);
        tvNombre.setText(nombre);

        TextView tvTelefono = (TextView) findViewById(R.id.lblTele);
        tvTelefono.setText(telefono);

        TextView tvEmail = (TextView) findViewById(R.id.lblEmail);
        tvEmail.setText(email);

        TextView tvdescripcion = (TextView) findViewById(R.id.lblDescripcion);
        tvdescripcion.setText(descripcion);

        TextView tvFecha = (TextView) findViewById(R.id.lblFechaN);
        tvTelefono.setText(telefono);


        Button boton = (Button) findViewById(R.id.button);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetalleDatos.this,MainActivity.class);
                startActivity(intent);
            }
        });



    }
}