package com.example.uidesign.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.uidesign.Adapter.TrendsAdapter;
import com.example.uidesign.Domain.TrendsDomain;
import com.example.uidesign.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterTrendsList;
    private RecyclerView recyclerViewTrendList;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById( R.id.imgprof);
        initRecyclerView();
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initRecyclerView() {
        ArrayList<TrendsDomain> items = new ArrayList<>();

        items.add(new TrendsDomain("Future in AI , what will tomorrow be like? ","The National","trends"));
        items.add(new TrendsDomain("Importent point in concluding a work contract ","Reutres","trends2"));
        items.add(new TrendsDomain("Future in AI , what will tomorrow be like? ","The National","trends"));

        recyclerViewTrendList = findViewById(R.id.view1);
        recyclerViewTrendList.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterTrendsList = new TrendsAdapter(items);
        recyclerViewTrendList.setAdapter(adapterTrendsList);




    }
}