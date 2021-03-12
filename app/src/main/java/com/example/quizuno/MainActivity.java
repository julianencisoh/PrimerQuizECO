package com.example.quizuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView datosencuestas;
    private Button botonregistrar;
    //private int valornexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datosencuestas = findViewById(R.id.datosencuestas);
        botonregistrar = findViewById(R.id.botonregistrar);

       // String nombre = getIntent().getExtras().getString("nombre");
       // String id = getIntent().getExtras().getString("id");
       // valornexo = getIntent().getExtras().getInt("valornexo");

        botonregistrar.setOnClickListener(

                v -> {
                    Intent a = new Intent(this, PantallaRegistro.class);
                    startActivity(a);
                }
        );
    }

   // private void CargarInfo(){
   //     String info = "nombre   "+"valornexo";
   //     datosencuestas.setText(info);
  //  }

    @Override
    protected void onResume() {
        super.onResume();

        String info = getSharedPreferences("miContenedor", MODE_PRIVATE).getString("datos","No hay datos");
        datosencuestas.setText(info);
    }



}