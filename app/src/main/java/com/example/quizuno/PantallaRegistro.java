package com.example.quizuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PantallaRegistro extends AppCompatActivity {

    private EditText nombreuser;
    private EditText iduser;
    private Button botoncontinuarregistro;
    private boolean usuarioYaExiste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_registro);
        nombreuser = findViewById(R.id.nombreuser);
        iduser = findViewById(R.id.iduser);
        botoncontinuarregistro = findViewById(R.id.botoncontinuarregistro);


        botoncontinuarregistro.setOnClickListener(

                v -> {

                    if(nombreuser.getText().toString().isEmpty() || iduser.getText().toString().isEmpty()){
                        Toast advertencia = Toast.makeText(this,"Por favor complete los campos requeridos", Toast.LENGTH_LONG);
                        advertencia.show();
                    }else{
                        if (usuarioYaExiste()==false){
                            String nombre = nombreuser.getText().toString();
                            String id = iduser.getText().toString();
                            Intent a = new Intent(this, PantallaNexo.class);
                            a.putExtra("nombre",nombre);
                            a.putExtra("id",id);
                            startActivity(a);
                            finish();
                        }

                    }
                }
        );

    }


    public boolean usuarioYaExiste(){
        SharedPreferences preferences = getSharedPreferences("miContenedor",MODE_PRIVATE);
        String usuariosExistentes=preferences.getString("datos","");
        if(usuariosExistentes.contains(iduser.getText().toString())){
            Toast notificacion = Toast.makeText(this,"Usuario ya registrado", Toast.LENGTH_LONG);
            notificacion.show();
            return true;
        }
        return false;
    }



}