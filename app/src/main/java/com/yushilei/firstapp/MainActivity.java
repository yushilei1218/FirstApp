package com.yushilei.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener {

    private ListView listView;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //找出绝大多数需要使用的View
        findViews();
        //统一初始化各个控件点击事件
        initOnClickEvent();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i + " 条");
        }
        View inflate = LayoutInflater.from(this).inflate(R.layout.header, null, false);
        listView.addHeaderView(inflate);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));

    }

    private void initOnClickEvent() {
        listView.setOnItemClickListener(this);
        text.setOnClickListener(this);
    }

    private void findViews() {
        listView = (ListView) findViewById(R.id.main_list_view);
        text = (TextView) findViewById(R.id.text_1);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, parent.getAdapter().getItem(position).toString(), Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, RecyclerActivity.class));
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.text_1:
                break;
            
        }
    }
}
