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

public class DivisionActivity extends AppCompatActivity {

    EditText et7,et8;
    Button b1,b2;
    String getNum7,getNum8,resul;
    int Num7,Num8,answe;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_division);

        et7=(EditText) findViewById(R.id.no1);
        et8=(EditText) findViewById(R.id.no2);
        b1=(Button) findViewById(R.id.divisionbutt);
        b2=(Button) findViewById(R.id.backtobutt);
        tv=(TextView) findViewById(R.id.answe);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum7=et7.getText().toString();
                getNum8=et8.getText().toString();
                Num7=Integer.parseInt(getNum7);
                Num8=Integer.parseInt(getNum8);
                answe=Num7/Num8;
                resul=String.valueOf(answe);
                tv.setText(resul);
                System.out.println();
                Toast.makeText(getApplicationContext(),resul,Toast.LENGTH_LONG).show();
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