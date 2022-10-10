package com.if3b.aselole;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setTitle("Layout Dua");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


    }
}