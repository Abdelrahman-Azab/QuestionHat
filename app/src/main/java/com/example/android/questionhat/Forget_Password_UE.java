package com.example.android.questionhat;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Forget_Password_UE extends AppCompatActivity {
    private ImageView arrow;
    private Button confirm_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget__password__ue);
        arrow=(ImageView) findViewById(R.id.arrow);
        confirm_button=(Button) findViewById(R.id.confirm_btn);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Forget_Password_UE.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
        confirm_button.setOnClickListener(new View.OnClickListener() {
            // check email if valid in database(api)
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Forget_Password_UE.this,Verify_email_otb.class);
                startActivity(intent);
                finish();
            }
        });

    }
    public void onBackPressed() {
        Intent intent=new Intent(Forget_Password_UE.this,LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
