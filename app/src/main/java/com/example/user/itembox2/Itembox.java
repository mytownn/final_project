package com.example.user.itembox2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Dictionary;

public class Itembox extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter adapter;
    GridLayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itembox);
        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        RecyclerDecoration spaceDecoration = new RecyclerDecoration(24, 12);
        mRecyclerView.addItemDecoration(spaceDecoration);

        mLayoutManager = new GridLayoutManager(getApplicationContext(), 6);
        mLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                int gridPosition = position % 6;
                switch (gridPosition) {
                    case 0:
                    case 1:
                    case 2:
                        return 2;
                    case 3:
                    case 4:
                    case 5:
                        return 2;
                }
                return 0;
            }
        });

        mRecyclerView.setLayoutManager(mLayoutManager);

        //아이템추가
       ArrayList<Item> itemArrayList = new ArrayList<>();
        itemArrayList.add(new Item(R.drawable.cat,"cat"));
        itemArrayList.add(new Item(R.drawable.flower1,"flower1"));
        itemArrayList.add(new Item(R.drawable.dog,"dog"));
        itemArrayList.add(new Item(R.drawable.flower2,"flower2"));
        itemArrayList.add(new Item(R.drawable.forest,"forest"));
        itemArrayList.add(new Item(R.drawable.flower4,"flower4"));
        itemArrayList.add(new Item(R.drawable.tree,"tree"));
        itemArrayList.add(new Item(R.drawable.flower,"flower"));
        itemArrayList.add(new Item(R.drawable.bush,"bush"));
        itemArrayList.add(new Item(R.drawable.duck,"duck"));
        itemArrayList.add(new Item(R.drawable.llama,"llama"));
        itemArrayList.add(new Item(R.drawable.flower3,"flower3"));
        itemArrayList.add(new Item(R.drawable.meerkat,"meerkat"));
        itemArrayList.add(new Item(R.drawable.owl,"owl"));
        itemArrayList.add(new Item(R.drawable.pig,"pig"));
        itemArrayList.add(new Item(R.drawable.rabbit,"rabbit"));

        MyAdapter myAdapter = new MyAdapter(itemArrayList);

        mRecyclerView.setAdapter(myAdapter);
    }
}
