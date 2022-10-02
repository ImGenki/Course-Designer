package com.example.coursedesigner;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity{

    private EditText eMail, ePass;
    private Button eLogin;
    private Button eRegister;

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        eMail = findViewById(R.id.user);
        ePass = findViewById(R.id.password);
        eLogin = findViewById(R.id.blogin);
        eRegister = findViewById(R.id.bregister);
        mAuth = FirebaseAuth.getInstance();

        eRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getEmail = eMail.getText().toString();
                String getPassword = ePass.getText().toString();
                mAuth.createUserWithEmailAndPassword(getEmail, getPassword).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        Toast.makeText(Login.this, "User crée", Toast.LENGTH_SHORT).show();
                    }
                })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Login.this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
                                Log.e("Tag", "Fail: 0" + e.getMessage());

                            }
                        });
            }
        });

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getEmail = eMail.getText().toString();
                String getPassword = ePass.getText().toString();
                mAuth.signInWithEmailAndPassword(getEmail, getPassword)
                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                Toast.makeText(Login.this, "Connexion réussie", Toast.LENGTH_SHORT).show();
                                Intent i=new Intent(getApplicationContext(), ScrollingExplication.class);
                                startActivity(i);
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Login.this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
                                Log.e("Tag","Fail: 0"+e.getMessage());
                            }
                        });
            }
        });

    }

}