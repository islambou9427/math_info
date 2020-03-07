package com.example.mathinfo.Mi_S1.phisique_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mathinfo.R;

public class phisique_1 extends AppCompatActivity {
CardView phisique_examn,phisique_teste,phisique_exoo,phisique_cours;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phisique_1);
        phisique_cours = findViewById(R.id.phisique_cours);
        phisique_exoo = findViewById(R.id.phisique_exoo);
        phisique_teste = findViewById(R.id.phisique_teste);
        phisique_examn = findViewById(R.id.phisique_examn);

        phisique_examn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(phisique_1.this, phisique_examn.class);
                startActivity(a);
            }
        });
        phisique_teste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(phisique_1.this, phisique_testes.class);
                startActivity(a);
            }
        });
        phisique_exoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(phisique_1.this, phisique_exoo.class);
                startActivity(a);
            }
        });
        phisique_cours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(phisique_1.this, phisique_cours.class);
                startActivity(a);
            }
        });
    }
}
