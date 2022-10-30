package com.biniyam.activitiesbygs231022;

import static com.biniyam.activitiesbygs231022.R.id.button_new_activity;
import static com.biniyam.activitiesbygs231022.R.id.text_view;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            textView = findViewById(R.id.text_view);
            textView.setText("startat appen");

        Button button = findViewById(R.id.button_new_activity);
        Button button2 = findViewById(R.id.button_new_activity3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity2intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(activity2intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity2intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(activity2intent);
            }
        });

    }

    }

// Todo generally satisfied with what i have achieved so far. I understand new Activities and
//  I know how to connect them to each other by buttons  next is sharedPreferences and Adapter,
//  sounds complicated shize but it is not. I shall figure it out. Passing grade is enough for me.

//








    /*
    @Override
    protected void onPause(){
        super.onPause();
        textView.setText("nu är det pausat.");
    }

    @Override
    protected  void onResume() {
        super.onResume();
        textView.setText("onResume()Activity" + "Nu Kör VI igen ! Välkommen tillbacka efter pausen onPause:en,");
    }

    */

