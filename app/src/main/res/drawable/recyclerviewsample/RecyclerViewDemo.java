package com.samsung.recyclerviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class RecyclerViewDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_demo);

        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        //initializeData();
        //Intent intent = getIntent();

        //Object object = intent.getSerializableExtra("com.restaurantdata.values");
        List<com.samsung.recyclerviewsample.Restaurant> restaurants = com.samsung.recyclerviewsample.Utility.getInstance().initializeRestaurantList();
        com.samsung.recyclerviewsample.RVAdapter adapter = new com.samsung.recyclerviewsample.RVAdapter(restaurants);
        rv.setAdapter(adapter);

    }

}
