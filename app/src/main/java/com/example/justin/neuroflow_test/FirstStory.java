package com.example.justin.neuroflow_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class FirstStory extends AppCompatActivity {

    private TextView mTextMessage;
    String test = "test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_screen);

        mTextMessage = findViewById(R.id.textView);
        StringBuilder sb = new StringBuilder();
        sb.append("Ryan");
        sb.append("\n");
        sb.append("100%");
        sb.append("\n");

        mTextMessage.setText(sb.toString());
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        sb.append(ft.format(dNow));
        sb.append("\n");
        Random ran = new Random();
        int num = ran.nextInt(3);
        sb.append(num);
        mTextMessage.setText(sb.toString());

//        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
