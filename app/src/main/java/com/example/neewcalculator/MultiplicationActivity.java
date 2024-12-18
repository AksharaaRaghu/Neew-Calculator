package com.example.neewcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MultiplicationActivity extends AppCompatActivity {

    EditText et5,et6;
    Button b1,b2;
    String getNum5,getNum6,resu;
    int Num5,Num6,answ;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multiplication);

        et5=(EditText) findViewById(R.id.no1);
        et6=(EditText) findViewById(R.id.no2);
        b1=(Button) findViewById(R.id.multibutt);
        b2=(Button) findViewById(R.id.backtobutt);
        tv=(TextView) findViewById(R.id.answ);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum5=et5.getText().toString();
                getNum6=et6.getText().toString();
                Num5=Integer.parseInt(getNum5);
                Num6=Integer.parseInt(getNum6);
                answ=Num5*Num6;
                resu=String.valueOf(answ);
                tv.setText(resu);
                System.out.println();
                Toast.makeText(getApplicationContext(),resu,Toast.LENGTH_LONG).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(ob);
            }
        });
    }
}