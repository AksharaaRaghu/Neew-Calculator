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

public class SubstractionActivity extends AppCompatActivity {

    EditText et3,et4;
    Button b1,b2;
    String getNum3,getNum4,res;
    int Num3,Num4,ans;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_substraction);

        et3=(EditText) findViewById(R.id.no1);
        et4=(EditText) findViewById(R.id.no2);
        b1=(Button) findViewById(R.id.minusbutt);
        b2=(Button) findViewById(R.id.backtobutt);
        tv=(TextView) findViewById(R.id.ans);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum3=et3.getText().toString();
                getNum4=et4.getText().toString();
                Num3=Integer.parseInt(getNum3);
                Num4=Integer.parseInt(getNum4);
                ans=Num3-Num4;
                res=String.valueOf(ans);
                tv.setText(res);
                System.out.println();
                Toast.makeText(getApplicationContext(),res,Toast.LENGTH_LONG).show();
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