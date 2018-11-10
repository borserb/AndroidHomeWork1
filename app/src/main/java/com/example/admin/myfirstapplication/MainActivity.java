package com.example.admin.myfirstapplication;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static int counter=0;
    private String name;
    private TextView lableid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate called");

        lableid =(TextView) findViewById(R.id.lable);
        lableid.setText("Hello World");

        }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("MainActivity", "onStart called");
        if(counter>0) lableid.setText("Кол-во переворотов экрана " + Integer.toString(counter));
        counter++;

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putInt("counter", counter);
        counter++;

    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        counter = savedInstanceState.getInt("counter");
    }

}
