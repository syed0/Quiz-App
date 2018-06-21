package com.example.quizapp.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.quizapp.quizapp.R;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void onsubmit(View view)
    {
        int score=0;
        String s="user interface";
        RadioButton r3=findViewById(R.id.radio_3);
        if (r3.isChecked()) {
            score = score + 1;
        }
        CheckBox c1=findViewById(R.id.checkbox_1);
        CheckBox c2=findViewById(R.id.checkbox_2);
        CheckBox c3=findViewById(R.id.checkbox_3);
        CheckBox c4=findViewById(R.id.checkbox_4);
        if(c1.isChecked() && c2.isChecked() )
        {
            if(c1.isChecked() && c2.isChecked() && c3.isChecked() && c4.isChecked()) {
                score=score;
            }
            else if(c1.isChecked() && c2.isChecked() && c3.isChecked() ) {
                score=score;
            }
            else {
                score = score + 1;
            }
        }
        RadioButton r21=findViewById(R.id.radio1_1);
        if (r21.isChecked()) {
            score = score + 1;
        }

        EditText e1=findViewById(R.id.edit_1);
        String s1=e1.getText().toString();
        String s2=s.toUpperCase();
        String s3=s1.toUpperCase();
        if(s2.equals(s3))
        {
            score=score+1;
        }

        Toast.makeText(Main2Activity.this, "Your Total Score is:"+score, Toast.LENGTH_LONG).show();
    }
    public void onreset(View view)
    {
        RadioButton r1=findViewById(R.id.radio_1);
        RadioButton r2=findViewById(R.id.radio_2);
        RadioButton r3=findViewById(R.id.radio_3);
        RadioButton r4=findViewById(R.id.radio_4);
        r1.setChecked(false);
        r2.setChecked(false);
        r3.setChecked(false);
        r4.setChecked(false);
        CheckBox c1=findViewById(R.id.checkbox_1);
        CheckBox c2=findViewById(R.id.checkbox_2);
        CheckBox c3=findViewById(R.id.checkbox_3);
        CheckBox c4=findViewById(R.id.checkbox_4);
        c1.setChecked(false);
        c2.setChecked(false);
        c3.setChecked(false);
        c4.setChecked(false);
        EditText e1=findViewById(R.id.edit_1);
        e1.setText("");
        RadioButton r11=findViewById(R.id.radio1_1);
        RadioButton r12=findViewById(R.id.radio1_2);
        RadioButton r13=findViewById(R.id.radio1_3);
        RadioButton r14=findViewById(R.id.radio1_4);
        r12.setChecked(false);
        r12.setChecked(false);
        r13.setChecked(false);
        r14.setChecked(false);

    }


}
