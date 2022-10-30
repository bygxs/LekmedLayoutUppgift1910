package com.biniyam.bmicodereviewrafat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button buttonListner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonListner();

    }
    public void buttonListner(){
 Button button = findViewById(R.id.button);
        TextView Restult = findViewById(R.id.Result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText height = findViewById(R.id.height);
                String height = heightText.getText().toString();

                double BMI =(weight)/ (height*height);


                        DecimalFormat df = new DecimalFormat("#"."#");
                        Double bmi_Tr = Double.parseDouble((df.format(BMI)))
                        TextView Bmiresultat = findViewById(R.id.Result);

                        BmiResult.setText(Double.toString());

            }
        });

    }

}