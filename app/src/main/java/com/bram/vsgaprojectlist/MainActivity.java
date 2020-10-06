package com.bram.vsgaprojectlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("ListView Sederhana");
        final ListView listview = (ListView) findViewById(R.id.listview);

        final String[] values = new String[]{"Nasi Goreng", "Mie ayam", "Bakso",
                "Soto Ayam", "Nasi Pecel", "Nasi Uduk", "Ayam Goreng", "Ayam Bakar",
                "Pizza", "Nasi Kebuli", "Gurame Bakar", "Tempe Penyet", "Steak"};

        ArrayAdapter<String> adapterData = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, values);
        listview.setAdapter(adapterData);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Anda memesan "+values[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}