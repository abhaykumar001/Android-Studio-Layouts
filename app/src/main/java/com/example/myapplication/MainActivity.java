package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView productListView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize ListView
        productListView = findViewById(R.id.productListView);

        // Sample data for the product list
        String[] products = {"Product 1", "Product 2", "Product 3" , "Product 4 " , "Product 5",
                "Product 6", "Product 7", "Product 8", "Product 9","Product 10"};


        // Create ArrayAdapter to populate the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, products);

        // Set the adapter to the ListView
        productListView.setAdapter(adapter);
    }
}