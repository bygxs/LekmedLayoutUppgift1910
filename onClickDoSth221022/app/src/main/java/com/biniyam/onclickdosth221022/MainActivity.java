package com.biniyam.onclickdosth221022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//
//
//    TextView txtMsg;
//    Button btnMsg;
//    EditText edtText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onBtnClick(View view){
        TextView txtHello = findViewById(R.id.txtMessage);
        EditText edtTextName = findViewById(R.id.edtTextName);
       // edtTextName.getText().toString();

        txtHello.setText("Hello "+edtTextName.getText().toString()); // this is passed dynamically




        /*set my text in the TextView.
        I know i am hard coding this and changing you statically.
        BUT I am setting the text programmatically by doing the same shyze.
        txtMeg.setText() by putting .getText() to bring whatever is in that edtText EditText input
        field.
        */


    }

}