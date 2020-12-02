package com.codepath.parstagram;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Signup_Form extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_form);
        getSupportActionBar().setTitle("Signup Form");
    }
}
