package com.biniyam.bmicoursera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        EditText heightEt , weightEt;
    RadioGroup genderRg;
    Button btn;
    String gender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        heightEt = findViewById(R.id.height_et);
        weightEt = findViewById(R.id.weight_et);
        btn = findViewById(R.id.bmi_btn);
        genderRg = findViewById(R.id.gender_rg);

        genderRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.boy_rb){
                    gender = "boy";
                }else{
                gender = "girl";

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hieghtVal = heightEt.getText().toString(). trim();
                String weightVal = weightEt.getText().toString().trim();

                float height = Float.parseFloat(hieghtVal);
                float weight = Float.parseFloat(weightVal);
                float bmi = calBMI(height,weight);

                    Toast.makeText(MainActivity.this , String.valueOf(bmi)+"  ", Toast.LENGTH_LONG).show();


            }
        };


    }
    public float calBMI(float h , float w){
        float bmi = 0;
        float h_m = h/100;
        bmi = w/(h_m*h_m);
        return bmi;
         */
    }
}