package com.example.mathinfo.menu_annee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.mathinfo.module_math_info.L2info_module;
import com.example.mathinfo.R;
import com.example.mathinfo.affichage_mi.affichage_L2;
import com.example.mathinfo.viewpageAdapter;
import com.google.android.material.tabs.TabLayout;

public class menu_L2 extends AppCompatActivity {
    private TabLayout tabLayout_l2info;
    private ViewPager viewPager_l2info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu__l2);
        tabLayout_l2info = findViewById(R.id.tabLayout_l2info);
        viewPager_l2info = findViewById(R.id.viewPager_l2info);
        viewpageAdapter adapter= new viewpageAdapter(getSupportFragmentManager());
        adapter.AddFragment(new L2info_module(),"Les Modules");
        adapter.AddFragment(new affichage_L2(),"Affichage");
        viewPager_l2info.setAdapter(adapter);
        tabLayout_l2info.setupWithViewPager(viewPager_l2info);
    }
}
