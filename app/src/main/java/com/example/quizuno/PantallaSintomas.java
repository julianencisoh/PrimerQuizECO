package com.example.quizuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.Collection;

public class PantallaSintomas extends AppCompatActivity {

    private CheckBox s1;
    private CheckBox s2;
    private CheckBox s3;
    private CheckBox s4;
    private CheckBox s5;
    private CheckBox s6;
    private CheckBox ninguno;
    private Button botonfinalizar;
    private int valornexo;
    private String nombre;
    private String id;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_sintomas);
        s1 = findViewById(R.id.s1);
        s2 = findViewById(R.id.s2);
        s3 = findViewById(R.id.s3);
        s4 = findViewById(R.id.s4);
        s5 = findViewById(R.id.s5);
        s6 = findViewById(R.id.s6);

        ninguno = findViewById(R.id.ninguno);
        botonfinalizar = findViewById(R.id.botonfinalizar);

        nombre = getIntent().getExtras().getString("nombre");
        id = getIntent().getExtras().getString("id");
        valornexo = getIntent().getExtras().getInt("valornexo");

        s1.setOnClickListener(
                v -> {
                    hunde1();

                }
        );

        s2.setOnClickListener(
                v -> {
                    hunde2();

                }
        );

        s3.setOnClickListener(
                v -> {
                    hunde3();

                }
        );

        s4.setOnClickListener(
                v -> {
                    hunde4();

                }
        );

        s5.setOnClickListener(
                v -> {
                    hunde5();

                }
        );

        s6.setOnClickListener(
                v -> {
                    hunde6();

                }
        );

        ninguno.setOnClickListener(
                v -> {
                    hunde7();

                }
        );


        botonfinalizar.setOnClickListener(

                v -> {

                    valorObtenido();

                        cargarInfoUser();
                        Intent a = new Intent(this, MainActivity.class);
                        startActivity(a);
                        finish();

                }
        );
    }

    private void hunde1() {
        if (s1.isChecked() == true){
            botonfinalizar.setEnabled(true);
            botonfinalizar.setBackgroundColor(Color.parseColor("#F01856"));

        }else if (s1.isChecked() == false && s2.isChecked() == false && s3.isChecked() == false && s4.isChecked() == false && s5.isChecked() == false && s6.isChecked() == false && ninguno.isChecked() == false) {
            botonfinalizar.setEnabled(false);
            botonfinalizar.setBackgroundColor(Color.parseColor("#DEDEDE"));
        }
    }

    private void hunde2() {
        if (s2.isChecked() == true){
            botonfinalizar.setEnabled(true);
            botonfinalizar.setBackgroundColor(Color.parseColor("#F01856"));

        }else if (s1.isChecked() == false && s2.isChecked() == false && s3.isChecked() == false && s4.isChecked() == false && s5.isChecked() == false && s6.isChecked() == false && ninguno.isChecked() == false) {
            botonfinalizar.setEnabled(false);
            botonfinalizar.setBackgroundColor(Color.parseColor("#DEDEDE"));
        }
    }

    private void hunde3() {
        if (s3.isChecked() == true){
            botonfinalizar.setEnabled(true);
            botonfinalizar.setBackgroundColor(Color.parseColor("#F01856"));

        }else if (s1.isChecked() == false && s2.isChecked() == false && s3.isChecked() == false && s4.isChecked() == false && s5.isChecked() == false && s6.isChecked() == false && ninguno.isChecked() == false) {
            botonfinalizar.setEnabled(false);
            botonfinalizar.setBackgroundColor(Color.parseColor("#DEDEDE"));
        }
    }

    private void hunde4() {
        if (s4.isChecked() == true){
            botonfinalizar.setEnabled(true);
            botonfinalizar.setBackgroundColor(Color.parseColor("#F01856"));

        }else if (s1.isChecked() == false && s2.isChecked() == false && s3.isChecked() == false && s4.isChecked() == false && s5.isChecked() == false && s6.isChecked() == false && ninguno.isChecked() == false) {
            botonfinalizar.setEnabled(false);
            botonfinalizar.setBackgroundColor(Color.parseColor("#DEDEDE"));
        }
    }

    private void hunde5() {
        if (s5.isChecked() == true){
            botonfinalizar.setEnabled(true);
            botonfinalizar.setBackgroundColor(Color.parseColor("#F01856"));

        }else if (s1.isChecked() == false && s2.isChecked() == false && s3.isChecked() == false && s4.isChecked() == false && s5.isChecked() == false && s6.isChecked() == false && ninguno.isChecked() == false) {
            botonfinalizar.setEnabled(false);
            botonfinalizar.setBackgroundColor(Color.parseColor("#DEDEDE"));
        }
    }

    private void hunde6() {
        if (s6.isChecked() == true){
            botonfinalizar.setEnabled(true);
            botonfinalizar.setBackgroundColor(Color.parseColor("#F01856"));

        }else if (s1.isChecked() == false && s2.isChecked() == false && s3.isChecked() == false && s4.isChecked() == false && s5.isChecked() == false && s6.isChecked() == false && ninguno.isChecked() == false) {
            botonfinalizar.setEnabled(false);
            botonfinalizar.setBackgroundColor(Color.parseColor("#DEDEDE"));
        }
    }

    private void hunde7() {
        if (ninguno.isChecked() == true){
            botonfinalizar.setEnabled(true);
            botonfinalizar.setBackgroundColor(Color.parseColor("#F01856"));

        }else if (s1.isChecked() == false && s2.isChecked() == false && s3.isChecked() == false && s4.isChecked() == false && s5.isChecked() == false && s6.isChecked() == false && ninguno.isChecked() == false) {
            botonfinalizar.setEnabled(false);
            botonfinalizar.setBackgroundColor(Color.parseColor("#DEDEDE"));
        }
    }



    private void valorObtenido() {

        if(s1.isChecked()){
            valornexo += 4;
        }if (s2.isChecked()){
            valornexo += 4;
        }if(s3.isChecked()){
            valornexo += 4;
        }if(s4.isChecked()){
            valornexo += 4;
        }if(s5.isChecked()){
            valornexo += 4;
        }if(s6.isChecked()){
            valornexo += 4;
        }if(ninguno.isChecked()){
            valornexo +=0;
        }
    }


    private void cargarInfoUser(){

        SharedPreferences preferences = getSharedPreferences("miContenedor", MODE_PRIVATE);
        String usuariosYaRegistrados = preferences.getString("datos","");
        String user = nombre+", "+id+ ","+valornexo+"\n" ;
        preferences.edit().putString("datos", usuariosYaRegistrados + user ).apply();
    }
}