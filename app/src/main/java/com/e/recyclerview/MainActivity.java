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
        presidentList.add(new President("Donald Trump","45th President of USA President and Chairman of The Trump Organization",R.drawable.trump));
        presidentList.add(new President("Barack Obama","44th President of USA senator from Illinois",R.drawable.barack));
        presidentList.add(new President("George W Bush","43th President of USA 46th governor of Texas",R.drawable.bush));
        presidentList.add(new President("Bill Clinton","42nd President of USA 40th & 42nd governor of Arkansas",R.drawable.bill));
        presidentList.add(new President("George H. W. Bush","41st President of USA  43rd vice president of the United States",R.drawable.hwbush));
        presidentList.add(new President("Ronald Reagan","40th President of USA 33rd governor of California",R.drawable.ronald));
///       Pass List to adapter class
        PresidentAdapter presidentAdapter = new PresidentAdapter(this, presidentList);
        recyclerView.setAdapter(presidentAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}
