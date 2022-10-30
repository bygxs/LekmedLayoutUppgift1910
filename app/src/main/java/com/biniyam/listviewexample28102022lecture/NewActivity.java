package com.biniyam.listviewexample28102022lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    TextView textView;
    TextView number;

    Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        textView = findViewById(R.id.textview_hello);
        number = findViewById(R.id.textview_number);

        String t = getIntent().getStringExtra("text_content");
        int i = getIntent().getIntExtra("number",0); // the number five in MainActivity

        textView.setText(t);
        number.setText(String.valueOf(i));

        // inte bra att göra så här  altså skapa en back button
        button = findViewById(R.id.button_back);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // save to prefences sharedPrefs can be used instead of all this

                Intent i = new Intent(NewActivity.this, MainActivity.class);
                // startActivity(i); // this stacks up every click and eat up lots of memory (RAM)
                finish(); // this line turns off the activity like device back button by itself

            }
        });





    }
}