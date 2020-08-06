package com.textile.mrm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        LinearLayout ln=(LinearLayout)findViewById(R.id.linear) ;
        TextView textview =(TextView)findViewById(R.id.txt);
        TextView textView1=(TextView)findViewById(R.id.xt1);

    }
}