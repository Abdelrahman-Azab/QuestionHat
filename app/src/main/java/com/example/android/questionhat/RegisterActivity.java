package com.example.android.questionhat;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private EditText username;
    private EditText email;
    private EditText password;
    private EditText re_password;
    private EditText phone;
    private EditText picture;
    private Uri imageUri;
    private ImageView arrow;
    private ImageView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
         username = (EditText) findViewById(R.id.username_edit_text);
         email = (EditText) findViewById(R.id.email_edit_text);
         password = (EditText) findViewById(R.id.password_edit_text);
         re_password = (EditText) findViewById(R.id.repassword_edit_text);
         phone = (EditText) findViewById(R.id.phone_edit_text);
         picture=(EditText) findViewById(R.id.picture_edit_text);
         register=(ImageView) findViewById(R.id.countinue_image);
         arrow=(ImageView) findViewById(R.id.arrow);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
        //picture
        picture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent galleryIntent = new Intent();
                galleryIntent.setAction(Intent.ACTION_GET_CONTENT);
                galleryIntent.setType("image/*");
                startActivityForResult(galleryIntent , 2);

            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernamee = username.getText().toString();
                String emaill = email.getText().toString();
                String passwordd = password.getText().toString();
                String re_passwordd = re_password.getText().toString();
                String phonee = phone.getText().toString();
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                if (usernamee.equals("") || emaill.equals("") || passwordd.equals("") || re_passwordd.equals("") || phonee.equals("")) {
                    Toast.makeText(RegisterActivity.this, "Empty Creditianls", Toast.LENGTH_SHORT).show();
                } else if (!passwordd.equals(re_passwordd)) {
                    Toast.makeText(RegisterActivity.this, "Password Doesn't match", Toast.LENGTH_SHORT).show();
                } else if (passwordd.length() < 6) {
                    Toast.makeText(RegisterActivity.this, "Password too short", Toast.LENGTH_SHORT).show();
                } else if (phonee.length() != 9) {
                    Toast.makeText(RegisterActivity.this, "Phone length is wrong", Toast.LENGTH_SHORT).show();
                } else if(!emaill.matches(emailPattern)) {
                    Toast.makeText(RegisterActivity.this, "Invalid email address", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(RegisterActivity.this, "Register Successfully", Toast.LENGTH_SHORT).show();
                    registerUser(emaill, passwordd, phonee, usernamee,imageUri);
                }
            }
        });

    }

    private void registerUser(String emaill, String passwordd, String phonee, String usernamee,Uri uri) {
        // add data(api) here
        Intent intent=new Intent(RegisterActivity.this,TrackActivity.class);
        startActivity(intent);
        finish();
    }
   /* @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode ==2 && resultCode == RESULT_OK && data != null){
            imageUri = data.getData();
            picture.setText("Uploded Successful!");
            picture.setTextColor(Color.GREEN);
        }
    }
    */
   public void onBackPressed() {
        Intent intent=new Intent(RegisterActivity.this,LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
