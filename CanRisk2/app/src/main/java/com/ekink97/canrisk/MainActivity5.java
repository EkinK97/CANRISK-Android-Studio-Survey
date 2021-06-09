package com.ekink97.canrisk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity5 extends AppCompatActivity {
    RadioGroup rg1,rg2,rg3,rg4;
    Button bt8;
    int compare=0, comptare2=0;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        bt8=findViewById(R.id.button7);
        rg1=findViewById(R.id.q10);
        rg2=findViewById(R.id.q11);
        rg3=findViewById(R.id.q11b);
        rg4=findViewById(R.id.q12);
        Bundle bund = getIntent().getExtras();
        score=bund.getInt("SCORE");

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch(i){
                    case (R.id.radioButton19):
                        score =score +2;
                        break;
                    case (R.id.radioButton28):
                        score =score +2;
                        break;
                    case (R.id.radioButton29):
                        score =score +2;
                        break;
                    case (R.id.radioButton30):
                        score =score +2;
                        break;
                    case (R.id.radioButton31):
                        score =score +0;
                        break;
                    case (R.id.radioButton32):
                        score =score +0;
                        break;
                }
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch(i){
                    case (R.id.radioButton46):
                        compare =compare +0;
                        break;
                    case (R.id.radioButton47):
                        compare =compare +3;
                        break;
                    case (R.id.radioButton48):
                        compare =compare +5;
                        break;
                    case (R.id.radioButton49):
                        compare =compare +10;
                        break;
                    case (R.id.radioButton54):
                        compare =compare +11;
                        break;
                    case (R.id.radioButton55):
                        compare =compare +3;
                        break;
                }
            }
        });

        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch(i) {
                    case (R.id.radioButton50):
                        comptare2 = comptare2 + 0;
                        if (compare >= 11) {
                            score = score + 11;
                        } else {
                                if (compare > comptare2) {
                                    score = score + compare;
                                }else if(compare < comptare2 ){
                                    score = score + comptare2;
                                }else{
                                    score= score + comptare2;
                                }
                        }
                        break;
                    case (R.id.radioButton51):
                        comptare2 = comptare2 + 3;
                        if (compare >= 11) {
                            score = score + 11;
                        } else {
                            if (compare > comptare2) {
                                score = score + compare;
                            }else if(compare < comptare2 ){
                                score = score + comptare2;
                            }else{
                                score= score + comptare2;
                            }
                        }
                        break;
                    case (R.id.radioButton52):
                        comptare2 = comptare2 + 5;
                        if (compare >= 11) {
                            score = score + 11;
                        } else {
                            if (compare > comptare2) {
                                score = score + compare;
                            }else if(compare < comptare2 ){
                                score = score + comptare2;
                            }else{
                                score= score + comptare2;
                            }
                        }
                        break;
                    case (R.id.radioButton53):
                        comptare2 = comptare2 + 10;
                        if (compare >= 11) {
                            score = score + 11;
                        } else {
                            if (compare > comptare2) {
                                score = score + compare;
                            }else if(compare < comptare2 ){
                                score = score + comptare2;
                            }else{
                                score= score + comptare2;
                            }
                        }
                        break;
                    case (R.id.radioButton56):
                        comptare2 = comptare2 + 11;
                        if (compare >= 11) {
                            score = score + 11;
                        } else {
                            if (compare > comptare2) {
                                score = score + compare;
                            }else if(compare < comptare2 ){
                                score = score + comptare2;
                            }else{
                                score= score + comptare2;
                            }
                        }
                        break;
                    case (R.id.radioButton57):
                        comptare2 = comptare2 + 3;
                        if (compare >= 11) {
                            score = score + 11;
                        } else {
                            if (compare > comptare2) {
                                score = score + compare;
                            }else if(compare < comptare2 ){
                                score = score + comptare2;
                            }else{
                                score= score + comptare2;
                            }
                        }
                        break;

                }
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1=new Intent(MainActivity5.this,result.class);
                myintent1.putExtra("SCORE",score);
                startActivity(myintent1);
            }
        });
    }
}