package com.example.cui.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);


    }

    public void exitpage(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void nextpage(View view){
        Intent intent = new Intent(this, Accelerometer.class);
        startActivity(intent);
    }
}
