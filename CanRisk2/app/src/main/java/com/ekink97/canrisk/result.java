package com.ekink97.canrisk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class result extends AppCompatActivity {
    TextView sv,comp;
    Button bt1;
    ArrayList<String> mylist= new ArrayList<>();
    ArrayAdapter<String> adapter;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        bt1=findViewById(R.id.button9);
        sv = findViewById(R.id.tv);
        comp = findViewById(R.id.comp);
        Bundle bund = getIntent().getExtras();
        score=bund.getInt("SCORE");
        sv.setText("Your Score is" + "\n\n"+ score);
        displayResult(score);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1=new Intent(result.this,MainActivity.class);
                startActivity(myintent1);
            }
        });
    }

    private void displayResult(float score) {
        String resultLabel = "";
        String resultLabel2 = "";
        if (Float.compare(score, 21f) <= 0) {
            resultLabel = " LOW RISK";
            resultLabel2 = "Your risk of having pre-diabetes or type 2\n" +
                    "diabetes is fairly low, though it always pays\n" +
                    "to maintain a healthy lifestyle.";
        } else if (Float.compare(score, 21f) > 0  &&  Float.compare(score, 32f) <= 0) {
            resultLabel = "MODERATE RISK";
            resultLabel2 = "Based on your identified risk factors, your risk\n" +
                    "of having pre-diabetes or type 2 diabetes\n" +
                    "is moderate. You may wish to consult with\n" +
                    "a health care practitioner about your risk of\n" +
                    "developing diabetes.";
        } else {
            resultLabel = "HIGH RISK!!";
            resultLabel2 = "Based on your identified risk factors, your risk\n" +
                    "of having pre-diabetes or type 2 diabetes is\n" +
                    "high. You may wish to consult with a health\n" +
                    "care practitioner to discuss getting your blood\n" +
                    "sugar tested.";
        }
        resultLabel = resultLabel + "\n\n" + resultLabel2;
        comp.setText(resultLabel);
    }
}