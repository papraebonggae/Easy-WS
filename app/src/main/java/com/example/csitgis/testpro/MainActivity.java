package com.example.csitgis.testpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private Button signInButton, signUpButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        signInButton = (Button) findViewById(R.id.button); //Rคือ R.Java เกิดอัตโนมัติ เก็บรายชื่อของวิตเก็ทไว้ใน ID
        signUpButton = (Button) findViewById(R.id.button2);


        //sign up controller
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SignUpActivity.class));
            }
        });
    } //Main Method เมธอดสามารถวางสลับไว้ไหนก็ได้ เพราะจะทำงานที่เมธอดหลักก่อนเสมอ


} //Main Class
