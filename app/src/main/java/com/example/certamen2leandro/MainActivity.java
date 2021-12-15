package com.example.certamen2leandro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {



    Button btnventana2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnventana2=(Button) findViewById(R.id.btnventana2);

        btnventana2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnventana2 = new Intent(MainActivity.this, ventana2.class );
                startActivity(btnventana2);
            }
        });

    }
}