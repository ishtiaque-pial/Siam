package com.pial.siam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Listener {

    private RecyclerView recyclerView;
    private RecyclerView recyclerView2;
    Adapter adapter;
    Adapter2 adapter2;
    private ArrayList<Model> modelArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView2 = findViewById(R.id.recyclerView2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        for (int i =0;i<=10;i++) {
            Model model = new Model("Siam "+i);
            ArrayList<String> stringArrayList = new ArrayList<>();
            for (int j=0;j<20;j++) {
                stringArrayList.add("Toufic "+j+" Siam "+i);
            }
            model.setStringArrayList(stringArrayList);
            modelArrayList.add(model);
        }
        adapter = new Adapter(this,modelArrayList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(ArrayList<String> stringArrayList) {
        adapter2 = new Adapter2(this,stringArrayList);
        recyclerView2.setAdapter(adapter2);
    }
}
