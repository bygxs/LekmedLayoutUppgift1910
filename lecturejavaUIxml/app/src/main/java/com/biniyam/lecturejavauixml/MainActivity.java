package com.biniyam.lecturejavauixml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView helloText;             // tillänglig till alla därför deklareras utanför inte intierat
    // Button button;
    EditText inputField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText= findViewById(R.id.text_view_first);/* this is an int ID number 1000000 not really
                                                        text_view_first that we see here    */

        helloText.setText("Hej världen"); // inte hårdkoda så här

        helloText.setText(R.string.hello_text);

        inputField = findViewById(R.id.input_field);

       // button = findViewById(R.id.button_1);

        Button button = findViewById(R.id.button_1); /* this button doesn't need to be
             declared outside since we just use it here and just once.
        */

        button.setOnClickListener(new View.OnClickListener() {     //View is an interface?
            @Override                 // this @Override and its code block is created automatically
            public void onClick(View view) {
                updateText();
                //här skriver vi vad ska hända när vi trycker på knappen
                Toast.makeText(MainActivity.this,"jag tryckte knappen",Toast.LENGTH_LONG).show();


            }
        });


    }
    public void updateText(){

        String s = inputField.getText().toString();

        helloText.setText(s);
        helloText.setBackgroundColor(R.color.teal_200);


       // helloText.setText(inputField.setText();   // this is the one method


    }


}