package com.example.swipetesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.yalantis.library.Koloda;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SwipeAdapter adapter;
    private List<Integer> list;
    Koloda koloda;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        koloda = findViewById(R.id.koloda);

        list = new ArrayList<>();

        adapter = new SwipeAdapter(this, list);
        koloda.setAdapter(adapter);
    }

}