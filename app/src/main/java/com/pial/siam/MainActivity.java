package com.pial.siam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Listener {

    private RecyclerView recyclerView;
    Adapter adapter;
    private ArrayList<Model> modelArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        for (int i =0;i<=10;i++) {
            modelArrayList.add(new Model("Siam "+i));
        }
        adapter = new Adapter(this,modelArrayList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(String name) {
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }
}
