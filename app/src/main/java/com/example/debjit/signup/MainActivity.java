package com.example.debjit.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button sbutton;
    Button fbutton;
    Button lbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sbutton = (Button) findViewById(R.id.button);
        fbutton = (Button) findViewById(R.id.button2);
        lbutton = (Button) findViewById(R.id.button3);

        sbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

        lbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }

        });


//        fbutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
        //               Intent intent = new Intent(MainActivity.this, LoginActivity.class);
//                startActivity(intent);

        //           }

        //       });

    }

}
