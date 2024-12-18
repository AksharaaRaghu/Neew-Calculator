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

public class AdditionActivity extends AppCompatActivity {

    EditText et1,et2;
    Button b1,b2;
    String getNum1,getNum2,result;
    int Num1,Num2,sum;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addition);

        et1=(EditText) findViewById(R.id.no1);
        et2=(EditText) findViewById(R.id.no2);
        b1=(Button) findViewById(R.id.additionbutt);
        b2=(Button) findViewById(R.id.backtobutt);
        tv=(TextView) findViewById(R.id.result);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=et1.getText().toString();
                getNum2=et2.getText().toString();
                Num1=Integer.parseInt(getNum1);
                Num2=Integer.parseInt(getNum2);
                sum=Num1+Num2;
                result=String.valueOf(sum);
                tv.setText(result);
                System.out.println();
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
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