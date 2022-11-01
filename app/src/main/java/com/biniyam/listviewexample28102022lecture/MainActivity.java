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

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String [] stringArray = {"hej","hopp", "tjoho", "hoppla"};

    ArrayList<User> userArrayList = new ArrayList<>();// dynamic array list
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        userArrayList.add(new User("Bill","41"));
        userArrayList.add(new User("Bosse","22"));
        userArrayList.add(new User("Bettan","31"));
        userArrayList.add(new User("Benare","71"));

    /*
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,
                stringArray); // den har adaptern tar bara en String men vi har name and age.therefore we make custom ArrayAdapter
                // simple_list_item_1, just take and displays only one TextView; therefore, custom adapter

     */
        CustomAdapter adapter = new CustomAdapter(this, userArrayList);

        //listView.setAdapter(arrayAdapter);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this,NewActivity.class);

               // String s = parent.getItemAtPosition(position).toString();
               // intent.putExtra("text_content",s);
               // intent.putExtra("number",5); // hård kodad

                User user = (User) parent.getItemAtPosition(position);

                intent.putExtra("text_content",user.name);
                intent.putExtra("number",user.age);


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