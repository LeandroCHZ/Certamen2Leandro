package com.example.certamen2leandro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity<edad, nombre> extends AppCompatActivity {

    private FirebaseAuth mAuth;

    private EditText nombre;
    private EditText edad;
    private EditText sexo;




    Button btnventana2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnventana2=(Button) findViewById(R.id.btnventana2);

        btnventana2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View view) {

                validacion()

                Intent btnventana2 = new Intent(MainActivity.this, ventana2.class );
                startActivity(btnventana2);

                mAuth = FirebaseAuth.getInstance();

                nombre = findViewById(R.id.btnventana2);
                edad = findViewById(R.id.btnventana2);

            }
        });

    }

    private void validacion() {

    }

    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        //updateUI(currentUser);
    }

    public void iniciar(View view) {

    }

    mAuth.FirebaseAuth.AuthStateListener(nombre, edad)

    void addOnCompleteListener(new, this OnCompleteListener<AuthResult>() {

    }
    @Override
    public void onComplete(@NonNull Task<AuthResult> task) {
        if (task.isSuccessful()) {

            FirebaseUser user = mAuth.getCurrentUser();

        } else {


            Toast.makeText(this, "Authentication failed.",
                    Toast.LENGTH_SHORT).show();
            //updateUI(null);
        }


    }

}