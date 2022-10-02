package com.example.coursedesigner;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ScrollingExplication extends AppCompatActivity {
    private ImageView go;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explication);
        go=findViewById(R.id.btnGo);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Accueil.class);
                startActivity(intent);
            }
        });
    }
}

