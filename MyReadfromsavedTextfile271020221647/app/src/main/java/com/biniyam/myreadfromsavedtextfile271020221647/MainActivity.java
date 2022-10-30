package com.biniyam.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button loadButton;
    Button saveButton;
    TextView displayText;
    EditText inputField;
    // SharedPreferences sharedPrefs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        displayText = findViewById(R.id.text_view);
        inputField = findViewById(R.id.input_field);
        saveButton = findViewById(R.id.button_save);
        loadButton = findViewById(R.id.button_load);



        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                File folder = new File(MainActivity.this.getFilesDir(),"savedTexts");
                if(!folder.exists()){
                    folder.mkdir();
                }
                try {
                    File textFile = new File(folder, "kanelbulle.txt"); // en tom fil är skapad i foldern
                    FileWriter writer = new FileWriter(textFile); // FileWriter & TextWriter bästa att skriva med

                    writer.write(inputField.getText().toString());
                    writer.close(); // nu stänger vi den så tätt så möjligt till writer.write så at vi inte råkar skriva nåt som stökar

                    Toast.makeText(MainActivity.this,"saved data to file", Toast.LENGTH_SHORT).show();


                }catch (IOException e) { //tar in alla typer fel i vår fall IO dvs Input Output
                    e.printStackTrace(); // ifall det krachar hittar vi debugg info genom den här (massa röd text där nere)
                    Toast.makeText(MainActivity.this,"failed saved data to file", Toast.LENGTH_SHORT).show();
                }

            }
        });

        loadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //  displayText.setText(s);


            }
        });


    }
}