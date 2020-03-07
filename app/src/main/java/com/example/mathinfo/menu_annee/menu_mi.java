package com.example.mathinfo.menu_annee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.mathinfo.R;
import com.example.mathinfo.affichage_mi.affichage;
import com.example.mathinfo.module_math_info.mi_Module;
import com.example.mathinfo.viewpageAdapter;
import com.google.android.material.tabs.TabLayout;

public class menu_mi extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_mi);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        viewpageAdapter adapter= new viewpageAdapter(getSupportFragmentManager());
        adapter.AddFragment(new mi_Module(),"Les Modules");
        adapter.AddFragment(new affichage(),"Affichage");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
