package com.sujanmaharjan008.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
     public  static final String countries[] = {"Nepal","Russia","China","Japan","US"};
     private ListView lsvCount;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lsvCount = findViewById(R.id.lsvCount);

         ArrayAdapter countryAdapter = new ArrayAdapter<>(
                 this,
                 android.R.layout.simple_list_item_1,
                 countries
         );

         lsvCount.setAdapter(countryAdapter);
    }
}
