package com.ekink97.canrisk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    Button bt2;
    RadioGroup rg1,rg2;
    RadioButton rb1,rb2;
    ArrayList<String> myscore;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bt2=findViewById(R.id.button2);
        rg1=findViewById(R.id.q1);
        rg2=findViewById(R.id.q2);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch(i){
                    case (R.id.radioButton):
                        score =score +0;
                        break;
                    case (R.id.radioButton2):
                        score =score +7;
                        break;
                    case (R.id.radioButton3):
                        score =score +13;
                        break;
                    case (R.id.radioButton4):
                        score =score +15;
                        break;
                }
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch(i) {
                    case (R.id.radioButton5):
                        score = score + 6;
                        GlobVar.gender = "Male";
                        break;
                    case (R.id.radioButton6):
                        score = score + 0;
                        GlobVar.gender = "Female";
                        break;
                }
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1=new Intent(MainActivity2.this,MainActivity3.class);
                myintent1.putExtra("SCORE",score);
                startActivity(myintent1);
            }
        });

    }
}