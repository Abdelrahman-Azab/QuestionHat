package com.example.android.questionhat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.cardview.widget.CardView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ImageView arrow=(ImageView) findViewById(R.id.arrow);
        CardView changeemail= (CardView) findViewById(R.id.change_email);
        CardView password= (CardView) findViewById(R.id.change_password);
        ImageView khroog=(ImageView) findViewById(R.id.khroog);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingsActivity.this,TrackActivity.class);
                startActivity(intent);
                finish();
            }
        });
        changeemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingsActivity.this,New_Email_Password.class);
                intent.putExtra("EXTRA_SESSION_ID", "Email");
                startActivity(intent);
                finish();
            }
        });
        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingsActivity.this,New_Email_Password.class);
                intent.putExtra("EXTRA_SESSION_ID", "Password");
                startActivity(intent);
                finish();
            }
        });
khroog.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(SettingsActivity.this,LoginActivity.class);
        startActivity(intent);
        finish();
    }
});
    }
    public void onBackPressed() {
        Intent intent=new Intent(SettingsActivity.this,TrackActivity.class);
        startActivity(intent);
        finish();
    }
}
