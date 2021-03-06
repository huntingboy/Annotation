package com.nomad.compileannotations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.nomad.annotations.InjectInt;
import com.nomad.annotations.InjectString;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @InjectString
    public String hello;

    @InjectString
    public String world;

    @InjectInt
    public int one;

    @InjectInt
    public int two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new MainActivity_Inject(this);

        Log.d(TAG, "onCreate: " + one + " " + two + " " + hello + " " + world);

    }
}
