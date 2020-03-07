package com.example.mathinfo.Mi_S1.analyse_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mathinfo.R;
import com.example.mathinfo.Mi_S1.algo_1.algo_cours;
import com.example.mathinfo.Mi_S1.algo_1.algo_exo;

public class analyse_1 extends AppCompatActivity {
    CardView exam_analyse1,tests_analyse1,exoo_analyse1,cours_analyse1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.analyse_1);
        cours_analyse1 = findViewById(R.id.cours_analyse1);
        exoo_analyse1 = findViewById(R.id.exoo_analyse1);
        tests_analyse1 = findViewById(R.id.tests_analyse1);
        exam_analyse1 = findViewById(R.id.exam_analyse1);

        exam_analyse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(analyse_1.this, analyse_examn.class);
                startActivity(a);
            }
        });
        tests_analyse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(analyse_1.this, analyse_testes.class);
                startActivity(a);
            }
        });
        exoo_analyse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(analyse_1.this, algo_exo.class);
                startActivity(a);
            }
        });
        cours_analyse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(analyse_1.this, algo_cours.class);
                startActivity(a);
            }
        });
    }
}
