package com.example.android.questionhat;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LeaderBoard extends AppCompatActivity {
    private ImageView arrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader_board);
        arrow=(ImageView) findViewById(R.id.arrow);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LeaderBoard.this,TrackActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
    public void onBackPressed() {
        Intent intent=new Intent(LeaderBoard.this,TrackActivity.class);
        startActivity(intent);
        finish();
    }
}
