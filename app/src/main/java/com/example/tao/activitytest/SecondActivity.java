package com.example.tao.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.second_layout);
    }
}
