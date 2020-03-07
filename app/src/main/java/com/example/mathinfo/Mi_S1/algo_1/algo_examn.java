package com.example.mathinfo.Mi_S1.algo_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mathinfo.R;

public class algo_examn extends AppCompatActivity {
 Button exmn__algo_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algo_examn);
        exmn__algo_1= findViewById(R.id.exmn__algo_1);

        exmn__algo_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Zu-fBPd-GfNYijqlwbAnC_vJzT4fWSdx/view?usp=sharing"));
                startActivity(a);
            }
        });
    }
}
