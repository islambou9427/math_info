package com.example.mathinfo.Mi_S1.algebre_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mathinfo.R;

public class algebre_1 extends AppCompatActivity {
CardView exoo_algebre1,cours_algebre1,exam_algebre1,tests_algebre1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algebre_1);
        cours_algebre1 = findViewById(R.id.cours_algebre1);
        exoo_algebre1 = findViewById(R.id.exoo_algebre1);
        tests_algebre1 = findViewById(R.id.tests_algebre1);
        exam_algebre1 = findViewById(R.id.exam_algebre1);

        exam_algebre1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(algebre_1.this, algebre_exmn.class);
                startActivity(a);
            }
        });
        tests_algebre1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(algebre_1.this, algbre_testes.class);
                startActivity(a);
            }
        });
        exoo_algebre1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(algebre_1.this, algbre_Exo.class);
                startActivity(a);
            }
        });
        cours_algebre1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(algebre_1.this, algebre_cours.class);
                startActivity(a);
            }
        });
    }
}
