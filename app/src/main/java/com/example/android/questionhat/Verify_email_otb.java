package com.example.android.questionhat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Verify_email_otb extends AppCompatActivity {
private ImageView arrow;
private Button verify;
private Button done;
private TextView new_password_text;
private EditText new_password_edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_email_otb);
        arrow=(ImageView) findViewById(R.id.arrow);
        verify=(Button) findViewById(R.id.verify_btn);
        new_password_text=(TextView) findViewById(R.id.text_password_new);
        new_password_edittext=(EditText) findViewById(R.id.new_password_edit_text);
        done=(Button) findViewById(R.id.done);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Verify_email_otb.this,Forget_Password_UE.class);
                startActivity(intent);
                finish();
            }
        });
verify.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
    new_password_text.setVisibility(View.VISIBLE);
    new_password_edittext.setVisibility(View.VISIBLE);
    done.setVisibility(View.VISIBLE);
    done.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(Verify_email_otb.this,TrackActivity.class);
            startActivity(intent);
            finish();
        }
    });
    }
});
    }
    public void onBackPressed() {
        Intent intent=new Intent(Verify_email_otb.this,Forget_Password_UE.class);
        startActivity(intent);
        finish();
    }

}
