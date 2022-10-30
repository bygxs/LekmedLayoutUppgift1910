package com.biniyam.listviewexample28102022lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String [] stringArray = {"hej","hopp", "tjoho", "hoppla"};

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,
                stringArray);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this,NewActivity.class);

                String s = parent.getItemAtPosition(position).toString();

                intent.putExtra("text_content",s);
                intent.putExtra("number",5); // hård kodad


                startActivity(intent);



   /*
   this code belongs to the previous listView arrayAdapter

               // System.out.println("parent: "+ parent);
                //System.out.println("view = " + view);
               // System.out.println("position = "+ position);
                //System.out.println("id = " + id);

               // String s = parent.getItemAtPosition(position).toString();
               // Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
                //den här liknar email lista

    */


            }
        });



    }
}