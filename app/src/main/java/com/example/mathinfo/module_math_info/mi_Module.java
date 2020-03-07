package com.example.mathinfo.module_math_info;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mathinfo.R;
import com.example.mathinfo.Mi_S1.algo_1.algo_1;

public class mi_Module extends Fragment {



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View  view = inflater.inflate(R.layout.module_mi,container,false);

      // SEMESTRE 1

       CardView algo1 =  view.findViewById(R.id.algo1);
       CardView analyse_1 = view.findViewById(R.id.analyse_1);
       CardView algebre_1 = view.findViewById(R.id.algebre_1);
       CardView structure_1= view.findViewById(R.id.structure_1);
       CardView electro_1 = view.findViewById(R.id.electro_1);
       CardView phisique_1 =view.findViewById(R.id.phisique_1);


       // SEMESTRE 2
        CardView  mi_asd1 = view.findViewById(R.id.mi_asd1);
        CardView  mi_analyse2 = view.findViewById(R.id.mi_analyse2);
        CardView  mi_algebre = view.findViewById(R.id.mi_algebre);
        CardView  mi_sm2 = view.findViewById(R.id.mi_sm2);
        CardView  stat_proba = view.findViewById(R.id.stat_proba);
        CardView  mi_opm = view.findViewById(R.id.mi_opm);
        CardView  mi_anglais = view.findViewById(R.id.mi_anglais);


       // les modules Mi 1 semestre
       algo1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent a = new Intent(getActivity(), algo_1.class);
               startActivity(a);
           }
       });

       analyse_1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent a = new Intent(getActivity(), com.example.mathinfo.Mi_S1.analyse_1.analyse_1.class);
               startActivity(a);
           }
       });
       algebre_1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent a = new Intent(getActivity(), com.example.mathinfo.Mi_S1.algebre_1.algebre_1.class);
               startActivity(a);
           }
       });
        structure_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getActivity(), com.example.mathinfo.Mi_S1.structure_1.structure_1.class);
                startActivity(a);
            }
        });
        electro_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getActivity(), com.example.mathinfo.Mi_S1.electro_1.electro_1.class);
                startActivity(a);
            }
        });
        phisique_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getActivity(), com.example.mathinfo.Mi_S1.phisique_1.phisique_1.class);
                startActivity(a);
            }
        });

        // les modules MI 2 semestre

        mi_asd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getActivity(), com.example.mathinfo.Mi_S2.asd_1.asd_1.class);
                startActivity(a);
            }
        });

        mi_analyse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });





        return view;


    }

}
