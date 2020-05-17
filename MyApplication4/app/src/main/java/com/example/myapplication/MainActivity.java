package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*****初始化变量*****/
    int but1=0;
    int but2=0;
    String sug="";

    /*****对象的初始化*****/
    private EditText text1=null;
    private TextView poe=null;
    private EditText text2=null;
    private EditText text3=null;

    /*****主代码的实现*****/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
