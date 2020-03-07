package com.example.mathinfo.Mi_S1.algo_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mathinfo.R;

public class algo_1 extends AppCompatActivity {
 CardView exam_algo,tests_algo,exoo_algo,cours_algo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algo_1);
        cours_algo = findViewById(R.id.cours_algo);
        exoo_algo = findViewById(R.id.exoo_algo);
        tests_algo = findViewById(R.id.tests_algo);
        exam_algo = findViewById(R.id.exam_algo);

        exam_algo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(algo_1.this, algo_examn.class);
                startActivity(a);
            }
        });
        tests_algo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(algo_1.this, Algo_teste.class);
                startActivity(a);
            }
        });
        exoo_algo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(algo_1.this, algo_exo.class);
                startActivity(a);
            }
        });
        cours_algo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(algo_1.this, algo_cours.class);
                startActivity(a);
            }
        });

    }
}
