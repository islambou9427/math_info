package com.example.mathinfo.Mi_S1.structure_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mathinfo.R;

public class structure_1 extends AppCompatActivity {
CardView cours_structure1,exoo_structure1,tests_structure1,exam_structure1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.structure_1);
        cours_structure1 = findViewById(R.id.cours_structure1);
        exoo_structure1 = findViewById(R.id.exoo_structure1);
        tests_structure1 = findViewById(R.id.tests_structure1);
        exam_structure1 = findViewById(R.id.exam_structure1);

        exam_structure1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(structure_1.this, structure_examn.class);
                startActivity(a);
            }
        });
        tests_structure1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(structure_1.this, structure_testes.class);
                startActivity(a);
            }
        });
        exoo_structure1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(structure_1.this, structure_exoo.class);
                startActivity(a);
            }
        });
        cours_structure1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(structure_1.this, structure_cours.class);
                startActivity(a);
            }
        });
    }
}
