package com.example.mathinfo.menu_annee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.mathinfo.module_math_info.L3info_module;
import com.example.mathinfo.R;
import com.example.mathinfo.affichage_mi.affichage_l3info;
import com.example.mathinfo.viewpageAdapter;
import com.google.android.material.tabs.TabLayout;

public class menu_L3info extends AppCompatActivity {
    private TabLayout tabLayout_l3info;
    private ViewPager viewPager_l3info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu__l3info);

        tabLayout_l3info = findViewById(R.id.tabLayout_l3info);
        viewPager_l3info = findViewById(R.id.viewPager_l3info);
        viewpageAdapter adapter= new viewpageAdapter(getSupportFragmentManager());
        adapter.AddFragment(new L3info_module(),"Les Modules");
        adapter.AddFragment(new affichage_l3info(),"Affichage");

        viewPager_l3info.setAdapter(adapter);
        tabLayout_l3info.setupWithViewPager(viewPager_l3info);
    }
}
