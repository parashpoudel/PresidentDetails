package com.e.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.PresidentAdapter;
import model.President;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //create a list of contacts
        List<President> presidentList = new ArrayList<>();
        presidentList.add(new President("Donald Trump","45th President of USA",R.drawable.trump));


///       Pass List to adapter class
        PresidentAdapter presidentAdapter = new PresidentAdapter(this, presidentList);
        recyclerView.setAdapter(presidentAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}
