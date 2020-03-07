package com.example.mathinfo.menu_annee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.mathinfo.module_math_info.L3math_module;
import com.example.mathinfo.R;
import com.example.mathinfo.affichage_mi.affichage_L3math;
import com.example.mathinfo.viewpageAdapter;
import com.google.android.material.tabs.TabLayout;

public class menu_L3math extends AppCompatActivity {
    private TabLayout tabLayout_l3math;
    private ViewPager viewPager_l3math;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu__l3math);
        tabLayout_l3math = findViewById(R.id.tabLayout_l3math);
        viewPager_l3math = findViewById(R.id.viewPager_l3math);
        viewpageAdapter adapter= new viewpageAdapter(getSupportFragmentManager());
        adapter.AddFragment(new L3math_module(),"Les Modules");
        adapter.AddFragment(new affichage_L3math(),"Affichage");

        viewPager_l3math.setAdapter(adapter);
        tabLayout_l3math.setupWithViewPager(viewPager_l3math);
    }
}
