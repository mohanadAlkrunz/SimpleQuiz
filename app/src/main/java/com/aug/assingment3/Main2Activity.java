package com.aug.assingment3;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    LinearLayout q1,q2,q3,q4,q5;
    RadioGroup rgq1,rgq2,rgq3,rgq4,rgq5;
    RadioButton rb1q1,rb2q1,rb3q1,a1;
    RadioButton rb1q2,rb2q2,rb3q2;
    RadioButton rb1q3,rb2q3,rb3q3;
    RadioButton rb1q4,rb2q4,rb3q4;
    RadioButton rb1q5,rb2q5,rb3q5;
    Button check;
    TextView result,caption,counter,quiz;
    int i=0,f=0,c=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        decelerations();
        counter.setText((c)+"/5");
        c++;


    }
    public void decelerations(){
        q1=findViewById(R.id.q1);
        rgq1=findViewById(R.id.rgq1);
        rb1q1=findViewById(R.id.rb1q1);
        rb2q1=findViewById(R.id.rb2q1);
        rb3q1=findViewById(R.id.rb3q1);
        q2=findViewById(R.id.q2);
        rgq2=findViewById(R.id.rgq2);
        rb1q2=findViewById(R.id.rb1q2);
        rb2q2=findViewById(R.id.rb2q2);
        rb3q2=findViewById(R.id.rb3q2);
        check=findViewById(R.id.check);
        q3=findViewById(R.id.q3);
        rgq3=findViewById(R.id.rgq3);
        rb1q3=findViewById(R.id.rb1q3);
        rb2q3=findViewById(R.id.rb2q3);
        rb3q3=findViewById(R.id.rb3q3);
        q4=findViewById(R.id.q4);
        rgq4=findViewById(R.id.rgq4);
        rb1q4=findViewById(R.id.rb1q4);
        rb2q4=findViewById(R.id.rb2q4);
        rb3q4=findViewById(R.id.rb3q4);
        q5=findViewById(R.id.q5);
        rgq5=findViewById(R.id.rgq5);
        rb1q5=findViewById(R.id.rb1q5);
        rb2q5=findViewById(R.id.rb2q5);
        rb3q5=findViewById(R.id.rb3q5);
        result=findViewById(R.id.result);
        caption=findViewById(R.id.caption);
        check=findViewById(R.id.check);
        counter=findViewById(R.id.counter);
        quiz=findViewById(R.id.quiz);
    }

    public void startQuiz(View view) {
        if(f==0){
            check.setText(getResources().getText(R.string.confirm));
            caption.setVisibility(View.GONE);
            q1.setVisibility(View.VISIBLE);
            counter.setVisibility(View.VISIBLE);
            f=1;
        }else if(f==1){
            a1=findViewById(rgq1.getCheckedRadioButtonId());
            if(a1.getId()==rb1q1.getId()){
                a1.setBackground(getResources().getDrawable(R.drawable.rectangle4g));
                i++;
            }
            else{
                a1.setBackground(getResources().getDrawable(R.drawable.rectangle4));
            }
            check.setText(getResources().getText(R.string.next));
            f=-1;
        }else if(f==-1){
            q1.setVisibility(View.INVISIBLE);
            q2.setVisibility(View.VISIBLE);
            check.setText(getResources().getText(R.string.confirm));
            counter.setText((c)+"/5");
            c++;
            f=2;
        }else if(f==2){
            a1=findViewById(rgq2.getCheckedRadioButtonId());
            if(a1.getId()==rb2q2.getId()){
                a1.setBackground(getResources().getDrawable(R.drawable.rectangle4g));
                i++;
            }
            else{
                a1.setBackground(getResources().getDrawable(R.drawable.rectangle4));
            }
            check.setText(getResources().getText(R.string.next));
            f=-2;
        }else if(f==-2){
            q2.setVisibility(View.INVISIBLE);
            q3.setVisibility(View.VISIBLE);
            check.setText(getResources().getText(R.string.confirm));
            counter.setText((c)+"/5");
            c++;
            f=3;
        }else if(f==3){
            a1=findViewById(rgq3.getCheckedRadioButtonId());
            if(a1.getId()==rb3q3.getId()){
                a1.setBackground(getResources().getDrawable(R.drawable.rectangle4g));
                i++;
            }
            else{
                a1.setBackground(getResources().getDrawable(R.drawable.rectangle4));
            }
            check.setText(getResources().getText(R.string.next));

            f=-3;
        }else if(f==-3){
            q3.setVisibility(View.GONE);
            q4.setVisibility(View.VISIBLE);
            check.setText(getResources().getText(R.string.confirm));
            counter.setText((c)+"/5");
            c++;
            f=4;
        }else if(f==4){
            a1=findViewById(rgq4.getCheckedRadioButtonId());
            if(a1.getId()==rb2q4.getId()){
                a1.setBackground(getResources().getDrawable(R.drawable.rectangle4g));
                i++;
            }
            else{
                a1.setBackground(getResources().getDrawable(R.drawable.rectangle4));
            }
            check.setText(getResources().getText(R.string.next));
            f=-4;
        }else if(f==-4){
            q4.setVisibility(View.GONE);
            q5.setVisibility(View.VISIBLE);
            check.setText(getResources().getText(R.string.confirm));
            counter.setText((c)+"/5");
            c++;
            f=5;
        }else if(f==5){
            a1=findViewById(rgq5.getCheckedRadioButtonId());
            if(a1.getId()==rb3q5.getId()){
                a1.setBackground(getResources().getDrawable(R.drawable.rectangle4g));
                i++;
            }
            else{
                a1.setBackground(getResources().getDrawable(R.drawable.rectangle4));
            }
            check.setText(getResources().getText(R.string.finish));
            f=-5;
        }else if(f==-5){
            q5.setVisibility(View.GONE);
            check.setVisibility(View.GONE);
            counter.setVisibility(View.GONE);
            result.setText(i+"\n"+"  /\n"+"   5");
            result.setVisibility(View.VISIBLE);
            quiz.setVisibility(View.VISIBLE);


        }
    }
}
