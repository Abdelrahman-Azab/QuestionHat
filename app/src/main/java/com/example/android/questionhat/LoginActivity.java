package com.example.android.questionhat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ImageView countinue=(ImageView) findViewById(R.id.countinue_image);
        TextView createacc=(TextView)findViewById(R.id.create_acc);
        TextView forgetpass=(TextView) findViewById(R.id.forget_text);
        countinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if data right
                Intent intent =new Intent(LoginActivity.this,TrackActivity.class);
                startActivity(intent);
                finish();

            }
        });
        createacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });
        forgetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(LoginActivity.this,Forget_Password_UE.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
