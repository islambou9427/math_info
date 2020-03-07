package com.example.mathinfo.Mi_S1.electro_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mathinfo.R;

public class electro_1 extends AppCompatActivity {
CardView electro_examn,electro_exoo,electro_teste,electro_cours;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.electro_1);
        electro_cours = findViewById(R.id.electro_cours);
        electro_exoo = findViewById(R.id.electro_exoo);
        electro_teste = findViewById(R.id.electro_teste);
        electro_examn = findViewById(R.id.electro_examn);

        electro_examn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(electro_1.this, electro1_examn.class);
                startActivity(a);
            }
        });
        electro_teste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(electro_1.this, electro1_testes.class);
                startActivity(a);
            }
        });
        electro_exoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(electro_1.this, electro1_exoo.class);
                startActivity(a);
            }
        });
        electro_cours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(electro_1.this, electro1_cours.class);
                startActivity(a);
            }
        });
    }
}
