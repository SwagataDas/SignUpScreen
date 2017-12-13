package com.example.debjit.signup;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v4.view.ViewPager;

public class MainActivity extends AppCompatActivity {

    Button sbutton;
    Button fbutton;
    Button lbutton;
    private  int[] layouts = {R.layout.activity_main,R.layout.activity_signup,R.layout.activity_login};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new CustomPagerAdapter(layouts,this));
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
