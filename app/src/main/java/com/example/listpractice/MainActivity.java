package com.example.listpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listview);

        final ArrayList<String>arrayList=new ArrayList<>();

        arrayList.add("Movies");
        arrayList.add("Video Games");
        arrayList.add("Board Games");
        arrayList.add("Books");
        arrayList.add("Television Series");
        arrayList.add("Mobile Games");
        arrayList.add("Movies");
        arrayList.add("Video Games");
        arrayList.add("Board Games");
        arrayList.add("Books");
        arrayList.add("Television Series");
        arrayList.add("Mobile Games");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(MainActivity.this,"clicked item:"+i+" "+arrayList.get(i).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
