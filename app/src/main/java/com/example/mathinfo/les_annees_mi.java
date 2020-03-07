package com.example.mathinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mathinfo.menu_annee.menu_L2;
import com.example.mathinfo.menu_annee.menu_L2math;
import com.example.mathinfo.menu_annee.menu_L3info;
import com.example.mathinfo.menu_annee.menu_L3math;
import com.example.mathinfo.menu_annee.menu_mi;

public class les_annees_mi extends AppCompatActivity {
Button btn_trun_mi,btn_l2_info,btn_l3_info,l2_math,l3_math;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_les_annees_mi);
        btn_l2_info =findViewById(R.id.btn_l2_info);
        btn_trun_mi= findViewById(R.id.btn_trun_mi);
        btn_l3_info= findViewById(R.id.btn_l3_info);
        l2_math= findViewById(R.id.l2_math);
        l3_math= findViewById(R.id.l3_math);

        l3_math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(les_annees_mi.this, menu_L3math.class);
                startActivity(a);
            }
        });

        l2_math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(les_annees_mi.this, menu_L2math.class);
                startActivity(a);
            }
        });



        btn_trun_mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(les_annees_mi.this, menu_mi.class);
                startActivity(a);
            }
        });

        btn_l2_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(les_annees_mi.this, menu_L2.class);
                startActivity(a);
            }
        });

        btn_l3_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(les_annees_mi.this, menu_L3info.class);
                startActivity(a);
            }
        });

    }
}
