package com.ekink97.canrisk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity4 extends AppCompatActivity {
    Button bt6;
    RadioGroup rg1,rg2,rg3,rg4,rg5;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        bt6=findViewById(R.id.button5);
        rg1=findViewById(R.id.q5);
        rg2=findViewById(R.id.q6);
        rg3=findViewById(R.id.q7);
        rg4=findViewById(R.id.q8);
        rg5=findViewById(R.id.q9);
        Bundle bund = getIntent().getExtras();
        score=bund.getInt("SCORE");

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch(i){
                    case (R.id.radioButton17):
                        score =score +0;
                        break;
                    case (R.id.radioButton18):
                        score =score +1;
                        break;
                }
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch(i){
                    case (R.id.radioButton20):
                        score =score +0;
                        break;
                    case (R.id.radioButton21):
                        score =score +2;
                        break;
                }
            }
        });

        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch(i){
                    case (R.id.radioButton22):
                        score =score +4;
                        break;
                    case (R.id.radioButton23):
                        score =score +0;
                        break;
                }
            }
        });

        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch(i){
                    case (R.id.radioButton24):
                        score =score +14;
                        break;
                    case (R.id.radioButton25):
                        score =score +0;
                        break;
                }
            }
        });

        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch(i){
                    case (R.id.radioButton26):
                        score =score +1;
                        break;
                    case (R.id.radioButton27):
                        score =score +0;
                        break;
                }
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1=new Intent(MainActivity4.this,MainActivity5.class);
                myintent1.putExtra("SCORE",score);
                startActivity(myintent1);
            }
        });

    }
}