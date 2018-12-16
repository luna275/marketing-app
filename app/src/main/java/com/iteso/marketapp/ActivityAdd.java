package com.iteso.marketapp;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.iteso.marketapp.beans.ItemAd;
import com.iteso.marketapp.beans.ItemCategory;

import java.util.ArrayList;

public class ActivityAdd extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<ItemAd> addList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        addList = new ArrayList<>();
        addList.add(new ItemAd(0, "Restaurantes",
                BitmapFactory.decodeResource(this.getResources(),
                        R.drawable.restaurant_image)));
        addList.add(new ItemAd(1, "Clothes",
                BitmapFactory.decodeResource(this.getResources(),
                        R.drawable.clothes_image)));

        // use a linear layout manager
        mLayoutManager = new GridLayoutManager(this, 2);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new AdapterAd(this, addList);
        mRecyclerView.setAdapter(mAdapter);

    }
}
