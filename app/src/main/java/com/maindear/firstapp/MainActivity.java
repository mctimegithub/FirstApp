package com.maindear.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.maindear.makejar.CommonTools;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CommonTools ct=new CommonTools();
        //ct.CT();
    }
}
