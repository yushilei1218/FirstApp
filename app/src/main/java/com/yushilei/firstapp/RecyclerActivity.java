package com.yushilei.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        adapter = new RecyclerAdapter();
        recyclerView.setAdapter(adapter);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add(i + "条");
        }
        adapter.addAll(list);
    }
}
