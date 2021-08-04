package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView lvItem;
    private String[] namenegara=new String[]{"Arab Saudi","Afghanistan","Belgia","Belanda","English","Ethiopia","Finlandia","Indonesia","Jepang","Korea Selatan","Thailand","Malaysia","Vietnam"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("List View Sederhana");
        lvItem = findViewById(R.id.list_view);

        ArrayAdapter<String> adapter=new ArrayAdapter<>( MainActivity.this,
            android.R.layout.simple_list_item_1, android.R.id.text1,namenegara
       );
        lvItem.setAdapter(adapter);
        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?>adapterView, View view, int i, long l){
                Toast.makeText(MainActivity.this, "Memilih : "+namenegara[i],
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}