package com.ekink97.canrisk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    Button bt4,bt5;
    TableRow tr1,tr2;
    TextView tw1,tw2;
    RadioGroup rg1,rg2,rg3;
    RadioButton rb1,rb2,rb3,rb4,rb5,rb6;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tr1=findViewById(R.id.male);
        tr2=findViewById(R.id.female);
        tw1=findViewById(R.id.textView11);
        tw2=findViewById(R.id.textView12);
        bt4=findViewById(R.id.button3);
        bt5=findViewById(R.id.button4);
        rg1=findViewById(R.id.q3);
        rg2=findViewById(R.id.q4);
        rg3=findViewById(R.id.q3b);
        rb1=findViewById(R.id.radioButton11);
        rb2=findViewById(R.id.radioButton12);
        rb3=findViewById(R.id.radioButton13);
        rb4=findViewById(R.id.radioButton14);
        rb5=findViewById(R.id.radioButton15);
        rb6=findViewById(R.id.radioButton16);
        Bundle bund = getIntent().getExtras();
        score=bund.getInt("SCORE");

        if (GlobVar.gender.equalsIgnoreCase("Male"))
            {
               tr2.setVisibility(View.GONE);
               tw2.setVisibility(View.GONE);
            }
        else{
                tr1.setVisibility(View.GONE);
                tw1.setVisibility(View.GONE);
        }

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch(i){
                    case (R.id.radioButton7):
                        score =score +0;

                        break;
                    case (R.id.radioButton8):
                        score =score +7;
                        break;
                    case (R.id.radioButton9):
                        score =score +9;
                        break;
                    case (R.id.radioButton10):
                        score =score +14;
                        break;
                }
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch(i) {
                    case (R.id.radioButton11):
                        score = score + 0;
                        break;
                    case (R.id.radioButton12):
                        score = score + 4;
                        break;
                    case (R.id.radioButton13):
                        score = score + 6;
                        break;
                }
            }
        });

        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch(i) {
                    case (R.id.radioButton14):
                        score = score + 0;
                        break;
                    case (R.id.radioButton15):
                        score = score + 4;
                        break;
                    case (R.id.radioButton16):
                        score = score + 6;
                        break;
                }
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1=new Intent(MainActivity3.this,bmi.class);
                startActivity(myintent1);
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1=new Intent(MainActivity3.this,MainActivity4.class);
                myintent1.putExtra("SCORE",score);
                startActivity(myintent1);
            }
        });
    }
}