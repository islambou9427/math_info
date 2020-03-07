package com.example.mathinfo.menu_annee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.mathinfo.module_math_info.L2math_module;
import com.example.mathinfo.R;
import com.example.mathinfo.affichage_mi.affchage_l2math;
import com.example.mathinfo.viewpageAdapter;
import com.google.android.material.tabs.TabLayout;

public class menu_L2math extends AppCompatActivity {
    private TabLayout tabLayout_l2math;
    private ViewPager viewPager_l2math;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu__l2math);
        tabLayout_l2math = findViewById(R.id.tabLayout_l2math);
        viewPager_l2math = findViewById(R.id.viewPager_l2math);
        viewpageAdapter adapter= new viewpageAdapter(getSupportFragmentManager());
        adapter.AddFragment(new L2math_module(),"Les Modules");
        adapter.AddFragment(new affchage_l2math(),"Affichage");

        viewPager_l2math.setAdapter(adapter);
        tabLayout_l2math.setupWithViewPager(viewPager_l2math);

    }
}
