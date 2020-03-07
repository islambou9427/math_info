package com.example.mathinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class les_annee_sm extends AppCompatActivity {
Button btn_trun_sm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_les_annee_sm);
        btn_trun_sm = findViewById(R.id.btn_trun_sm);

        btn_trun_sm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(les_annee_sm.this, science.class);
                startActivity(a);
            }
        });
    }
}
