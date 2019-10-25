package com.sujanmaharjan008.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
     public  static final String countries[] = {
             "Nepal","Kathmandu",
             "Russia","Moscow",
             "China","Beijing",
             "Japan","Tokyo",
             "US","Washinton D.C"
     };
     private ListView lsvCount;
     private Map<String,String> count;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lsvCount = findViewById(R.id.lsvCount);

        count = new HashMap<>();
        for (int i=0;i<countries.length;i+=2){
            count.put(countries[i],countries[i+1]);
        }

         ArrayAdapter countryAdapter = new ArrayAdapter<>(
                 this,
                 android.R.layout.simple_list_item_1,
                 new ArrayList<String>(count.keySet())
         );

         lsvCount.setAdapter(countryAdapter);

         lsvCount.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                  String countryPos = parent.getItemAtPosition(position).toString();
                  String capital = count.get(countryPos);
                  Toast.makeText(MainActivity.this, "The capital of " + countryPos + " is " + capital, Toast.LENGTH_LONG).show();
             }
         });
    }
}
