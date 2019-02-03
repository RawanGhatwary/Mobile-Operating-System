package com.example.weatherapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class listActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listlayout);
        String[] mydata= {"Android","iPhone","Windows","BLueberry","LinuX"};
        createdatainlist();



    }
    private  void createdatainlist(){
        //int[] images={R.drawable.sams,R.drawable.download,R.drawable.windoes,R.drawable.samsung};
        String[] mydata= {"Android","iPhone","Windows","BLueberry","LinuX"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mydata);

        ListView list=(ListView) findViewById(R.id.Mylist);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent secaction=new Intent(getApplicationContext(), Emptypage.class);
               switch (position){
                   case 0:
                       startActivity(secaction);
                       break;
                   case 1:
                       startActivity(secaction);
                       break;
                   case 2:
                       startActivity(secaction);
                       break;
                   case 3:
                       startActivity(secaction);
                       break;
                   case 4:
                       startActivity(secaction);
                       break;

               }
                TextView textView = (TextView) view;
                String msg = "You clicked on: " + textView.getText().toString();
                Toast.makeText(listActivity.this, msg, Toast.LENGTH_LONG).show();


            }
        });










    }}