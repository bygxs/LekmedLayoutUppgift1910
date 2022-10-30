package com.biniyam.min_kyh_22_java_grunder;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity { /* this is the MainActivity class that inherits from
        propeties from AppCompatActivity by extending it, it extends the parent super shit
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {// this is a class with onCreate() method
                                            //Bundle is a classed passed as a parameter onCreate()
        super.onCreate(savedInstanceState); // savedInstanceState is also a parameter
        setContentView(R.layout.activity_main);
    }
    // components and activiteis


    @Override
    protected void onStart() {  //when the App Activity starts STEP ONE
        super.onStart();
    }

    @Override
    protected void onResume() {   // fragment activity
        super.onResume();
    }

    @Override
    protected void onPause() { //when the App or Activity is on pause
        super.onPause();
    }

    @Override
    protected void onRestart() { //on restart of App Activity
        super.onRestart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}