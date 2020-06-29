package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String>myAdapter = new ArrayAdapter<String>(MainActivity2.this,
        android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.CompanyType));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
    }
}