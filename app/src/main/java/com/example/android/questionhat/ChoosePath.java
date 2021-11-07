package com.example.android.questionhat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ChoosePath extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_path);
        LinearLayout language=(LinearLayout) findViewById(R.id.language_linear);
        LinearLayout science=(LinearLayout) findViewById(R.id.Science_linear);
        LinearLayout drama=(LinearLayout) findViewById(R.id.Drama_linear);
        LinearLayout art=(LinearLayout) findViewById(R.id.Art_linear);
        ImageView arrow=(ImageView) findViewById(R.id.arrow);
        language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(ChoosePath.this,QuizActivity.class);
                startActivity(intent);
                finish();
            }
        });
        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(ChoosePath.this,QuizActivity.class);
                startActivity(intent);
                finish();
            }
        });
        drama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(ChoosePath.this,QuizActivity.class);
                startActivity(intent);
                finish();
            }
        });
        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(ChoosePath.this,QuizActivity.class);
                startActivity(intent);
                finish();
            }
        });
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChoosePath.this,TrackActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    public void onBackPressed() {
        Intent intent=new Intent(ChoosePath.this,TrackActivity.class);
        startActivity(intent);
        finish();
    }
}
