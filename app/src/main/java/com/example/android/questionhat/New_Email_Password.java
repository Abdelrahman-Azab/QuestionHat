package com.example.android.questionhat;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class New_Email_Password extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__email__password);
        TextView old_text=(TextView) findViewById(R.id.text_password_old);
        TextView new_text=(TextView) findViewById(R.id.text_password_new);
        EditText old_edittext=(EditText) findViewById(R.id.old_password_edit_text);
        EditText new_edittext=(EditText) findViewById(R.id.new_password_edit_text);
        ImageView arrow=(ImageView) findViewById(R.id.arrow);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(New_Email_Password.this,SettingsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        String sessionId = getIntent().getStringExtra("EXTRA_SESSION_ID");
        if(sessionId.equals("Email"))
        {
            //For Email
            old_text.setText("Old Email");
            old_edittext.setHint("Enter your old-email");
            old_edittext.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
            new_text.setText("New Email");
            new_edittext.setHint("Enter Your new-email");
            new_edittext.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);

        }
        else
        {

        }
    }
    public void onBackPressed() {
        Intent intent=new Intent(New_Email_Password.this,SettingsActivity.class);
        startActivity(intent);
        finish();
    }
}
