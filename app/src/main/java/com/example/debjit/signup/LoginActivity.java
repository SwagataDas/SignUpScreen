package com.example.debjit.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;

import java.io.ObjectInputValidation;
import java.security.PrivateKey;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static android.widget.Toast.LENGTH_SHORT;

public class LoginActivity extends AppCompatActivity {
    private EditText mail,password;
    private Button login;
    private ImageView backbtn;
    private CharSequence target;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mail = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        backbtn = (ImageView) findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = mail.getText().toString();
                String ps = password.getText().toString();

                if(TextUtils.isEmpty(ps)||ps.length()<8)
                    Toast.makeText(LoginActivity.this, "Enter your password", LENGTH_SHORT).show();
                else {
                    Boolean b = isValidEmail(email);
                    if (b) {
                        Toast.makeText(LoginActivity.this, "Registration Successful", LENGTH_SHORT).show();
                        Intent intent;
                        intent = new Intent(LoginActivity.this,LoginActivity.class);
                        startActivity(intent);
                    }
                }
            }

            private Boolean isValidEmail(String email) {
                if (TextUtils.isEmpty(target)) {
                    Toast.makeText(LoginActivity.this, "Enter valid email", LENGTH_SHORT).show();
                    return false;
                } else {
                    return Patterns.EMAIL_ADDRESS.matcher(target).matches();
                }
            }
        });
        Intent intent = getIntent();
    }
}
