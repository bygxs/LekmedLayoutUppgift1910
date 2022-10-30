package com.biniyam.arraylistviewlecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String [] stringArray = {"hej","hopp","tjoho","hoppla" };

    ArrayList<User> userArrayList = new ArrayList<>();

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =findViewById(R.id.lisview);


        userArrayList.add(new User("bill","41"));
        userArrayList.add(new User("cory","41"));
        userArrayList.add(new User("danny","41"));
        userArrayList.add(new User("kol","41"));





        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,stringArray);



                     /*
                             arrayAdapter is instance of ArrayAdapter whic is class
                             androids library resource
                            */

        // TODO: 2022-10-17 step two  comment out above ArrayAdapter


        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent (MainActivity.this, MainActivity2.class);


               /* System.out.println("parent: " + parent);
                System.out.println("view : " + view);
                System.out.println("position =" + position);
                System.out.println("id"+ id );
*/
                String s = parent.getItemAtPosition(position).toString();
                intent.putExtra("text_content", s);
                intent.putExtra("number",5);

                startActivity(intent);


                //Toast.makeText(MainActivity.this,s ,Toast.LENGTH_LONG).show();
            }
        });





    }
}