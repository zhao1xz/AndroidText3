package com.zxz.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_hello=findViewById(R.id.tv_hello);
        tv_hello.setText("今天的天气不错呀");
        tv_hello.setLinkTextColor(Color.RED);
        tv_hello.setTextSize(30);
    }
}
