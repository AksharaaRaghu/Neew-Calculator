package com.example.neewcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.addbutt);
        b2=(Button) findViewById(R.id.subbutt);
        b3=(Button) findViewById(R.id.mulbutt);
        b4=(Button) findViewById(R.id.divbutt);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(getApplicationContext(),AdditionActivity.class);
                startActivity(ob);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob1=new Intent(getApplication(), SubstractionActivity.class);
                startActivity(ob1);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob2=new Intent(getApplication(), MultiplicationActivity.class);
                startActivity(ob2);
            }
        });
    }
}