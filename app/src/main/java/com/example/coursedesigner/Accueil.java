package com.example.coursedesigner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class Accueil extends AppCompatActivity implements View.OnClickListener {

    private Button newCourse;
    private Button loadCourse;
    private Button logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        newCourse= findViewById(R.id.butNouveau);
        newCourse.setOnClickListener(this);

        loadCourse=findViewById(R.id.butCharger);
        loadCourse.setOnClickListener(this);


        logout=findViewById(R.id.butlogout);
        logout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case  R.id.butCharger:
                startActivity(new Intent(this, Galerie.class));
                break;
            case R.id.butNouveau:
                startActivity(new Intent(this,Course.class));
                break;
            case R.id.butlogout:
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(this,Login.class));
                break;
        }

    }

}