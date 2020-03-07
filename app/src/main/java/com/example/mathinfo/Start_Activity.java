package com.example.mathinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class Start_Activity extends AppCompatActivity {
    ImageView get_link,linkidn_link,gmail_link,insta_link,fb_link;
    Button btn_mi,btn_sm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);



        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3076708121503108/2799116985");

        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
       adView.loadAd(adRequest);

        btn_mi= findViewById(R.id.btn_mi);
        btn_sm= findViewById(R.id.btn_sm);

        get_link= findViewById(R.id.get_link);
        linkidn_link= findViewById(R.id.linkidn_link);
        gmail_link= findViewById(R.id.gmail_link);
        insta_link= findViewById(R.id.insta_link);
        fb_link= findViewById(R.id.fb_link);


        btn_mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Start_Activity.this, les_annees_mi.class);
                startActivity(a);
            }
        });
        btn_sm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Start_Activity.this, les_annee_sm.class);
                startActivity(a);
            }
        });

        get_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/login"));
                startActivity(a);
            }
        });

        linkidn_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dz.linkedin.com/in/islam-bouagada-334436173"));
                startActivity(a);
            }
        });

        gmail_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
                startActivity(a);
            }
        });

        get_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/login"));
                startActivity(a);
            }
        });


        fb_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Islem.9427"));
                startActivity(a);
            }
        });


        insta_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/islem_bouagada/"));
                startActivity(a);
            }
        });





    }
}
