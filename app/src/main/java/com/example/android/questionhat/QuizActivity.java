package com.example.android.questionhat;

import android.app.Activity;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;

public class QuizActivity extends AppCompatActivity {
    CircularProgressBar progressBar;
    CountDownTimer countDownTimer;
    TextView texttimer;
    int i = 10;
    private ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        arrow=(ImageView) findViewById(R.id.arrow);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(QuizActivity.this, ChoosePath.class);
                startActivity(intent);
                finish();
            }
        });
        progressBar = (CircularProgressBar) findViewById(R.id.circularProgressBar);
        progressBar.setProgress(i);
        texttimer = (TextView) findViewById(R.id.count_down);
        new CountDownTimer(10000, 1000) {

            public void onTick(long millisUntilFinished) {
                texttimer.setText("0" + millisUntilFinished / 1000);
                i--;
                progressBar.setVisibility(View.VISIBLE);
                progressBar.setProgress(i);


            }

            public void onFinish() {
                texttimer.setText("Done");
                i++;
                progressBar.setProgress(0);
            }
        }.start();
    }
    public void onBackPressed() {
        Intent intent=new Intent(QuizActivity.this,ChoosePath.class);
        startActivity(intent);
        finish();
    }
}
