package com.example.mathinfo.Mi_S2.asd_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mathinfo.Mi_S1.algo_1.Algo_teste;
import com.example.mathinfo.Mi_S1.algo_1.algo_1;
import com.example.mathinfo.Mi_S1.algo_1.algo_cours;
import com.example.mathinfo.Mi_S1.algo_1.algo_examn;
import com.example.mathinfo.Mi_S1.algo_1.algo_exo;
import com.example.mathinfo.R;

public class asd_1 extends AppCompatActivity {
CardView cours_asd1,exoo_asd1,tests_asd1,exam_asd1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asd_1);
        cours_asd1 = findViewById(R.id.cours_asd1);
        exoo_asd1 = findViewById(R.id.exoo_asd1);
        tests_asd1 = findViewById(R.id.tests_asd1);
        exam_asd1 = findViewById(R.id.exam_asd1);

        exam_asd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(algo_1.this, algo_examn.class);
                startActivity(a);
            }
        });
        tests_asd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(algo_1.this, Algo_teste.class);
                startActivity(a);
            }
        });
        exoo_asd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(algo_1.this, algo_exo.class);
                startActivity(a);
            }
        });
        cours_asd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(algo_1.this, algo_cours.class);
                startActivity(a);
            }
        });
    }
}
