package com.example.android.questionhat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.LinearGradient;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class TrackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);
        final Button quiz_button=(Button) findViewById(R.id.quiz_button);
        final Button earn_coins=(Button) findViewById(R.id.Earncoins);
        final Button leader_board=(Button) findViewById(R.id.Leaderboard);
        final LinearLayout settings=(LinearLayout) findViewById(R.id.settings);
        final LinearLayout logout=(LinearLayout) findViewById(R.id.logout);
        final ImageView close_btn=(ImageView) findViewById(R.id.close_btn);
        close_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TrackActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
        quiz_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TrackActivity.this,ChoosePath.class);
                startActivity(intent);
                finish();
            }
        });
        earn_coins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TrackActivity.this,CoinsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        leader_board.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TrackActivity.this,LeaderBoard.class);
                startActivity(intent);
                finish();
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TrackActivity.this,SettingsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TrackActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    public void onBackPressed() {
        Intent intent=new Intent(TrackActivity.this,LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
