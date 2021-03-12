package com.example.quizuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class PantallaNexo extends AppCompatActivity {

    private CheckBox ne1;
    private CheckBox ne2;
    private CheckBox ne3;
    private CheckBox ne4;
    private CheckBox ninguna;
    private Button botoncontinuarnexo;
    private int valornexo = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_nexo);
        ne1 = findViewById(R.id.ne1);
        ne2 = findViewById(R.id.ne2);
        ne3 = findViewById(R.id.ne3);
        ne4 = findViewById(R.id.ne4);
        ninguna = findViewById(R.id.ninguna);
        botoncontinuarnexo = findViewById(R.id.botoncontinuarnexo);


        String nombre = getIntent().getExtras().getString("nombre");
        String id = getIntent().getExtras().getString("id");

        ne1.setOnClickListener(

                v -> {

                    hunde1();
                }
        );

        ne2.setOnClickListener(

                v -> {

                    hunde2();
                }
        );
        ne3.setOnClickListener(

                v -> {

                    hunde3();
                }
        );
        ne4.setOnClickListener(

                v -> {

                    hunde4();
                }
        );
        ninguna.setOnClickListener(

                v -> {

                    hunde5();
                }
        );

        botoncontinuarnexo.setOnClickListener(

                v -> {

                    valorObtenido();


                        Intent a = new Intent(this, PantallaSintomas.class);
                        a.putExtra("nombre",nombre);
                        a.putExtra("id",id);
                        a.putExtra("valornexo",valornexo);

                        startActivity(a);
                        finish();

                }
        );



    }

    private void hunde1() {
        if (ne1.isChecked() == true){
            botoncontinuarnexo.setEnabled(true);
            botoncontinuarnexo.setBackgroundColor(Color.parseColor("#F01856"));

        }else if (ne1.isChecked() == false && ne2.isChecked() == false && ne3.isChecked() == false && ne4.isChecked() == false &&  ninguna.isChecked() == false) {
            botoncontinuarnexo.setEnabled(false);
            botoncontinuarnexo.setBackgroundColor(Color.parseColor("#DEDEDE"));
        }
    }

    private void hunde2() {
        if (ne2.isChecked() == true){
            botoncontinuarnexo.setEnabled(true);
            botoncontinuarnexo.setBackgroundColor(Color.parseColor("#F01856"));

        }else if (ne1.isChecked() == false && ne2.isChecked() == false && ne3.isChecked() == false && ne4.isChecked() == false &&  ninguna.isChecked() == false) {
            botoncontinuarnexo.setEnabled(false);
            botoncontinuarnexo.setBackgroundColor(Color.parseColor("#DEDEDE"));
        }
    }

    private void hunde3() {
        if (ne3.isChecked() == true){
            botoncontinuarnexo.setEnabled(true);
            botoncontinuarnexo.setBackgroundColor(Color.parseColor("#F01856"));

        }else if (ne1.isChecked() == false && ne2.isChecked() == false && ne3.isChecked() == false && ne4.isChecked() == false &&  ninguna.isChecked() == false) {
            botoncontinuarnexo.setEnabled(false);
            botoncontinuarnexo.setBackgroundColor(Color.parseColor("#DEDEDE"));
        }
    }

    private void hunde4() {
        if (ne4.isChecked() == true){
            botoncontinuarnexo.setEnabled(true);
            botoncontinuarnexo.setBackgroundColor(Color.parseColor("#F01856"));

        }else if (ne1.isChecked() == false && ne2.isChecked() == false && ne3.isChecked() == false && ne4.isChecked() == false &&  ninguna.isChecked() == false) {
            botoncontinuarnexo.setEnabled(false);
            botoncontinuarnexo.setBackgroundColor(Color.parseColor("#DEDEDE"));
        }
    }

    private void hunde5() {
        if (ninguna.isChecked() == true){
            botoncontinuarnexo.setEnabled(true);
            botoncontinuarnexo.setBackgroundColor(Color.parseColor("#F01856"));

        }else if (ne1.isChecked() == false && ne2.isChecked() == false && ne3.isChecked() == false && ne4.isChecked() == false &&  ninguna.isChecked() == false) {
            botoncontinuarnexo.setEnabled(false);
            botoncontinuarnexo.setBackgroundColor(Color.parseColor("#DEDEDE"));
        }
    }





    private void valorObtenido() {

        if(ne1.isChecked()){
            valornexo += 3;
        }if (ne2.isChecked()){
            valornexo += 3;
        }if(ne3.isChecked()){
            valornexo += 3;
        }if(ne4.isChecked()){
            valornexo += 3;
        }if(ninguna.isChecked()){
            valornexo +=0;
        }
    }
}