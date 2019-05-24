package com.samsung.recyclerviewsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewRecyclerViewClick(View view) {
        Intent i = new Intent(this, RecyclerViewDemo.class);

        startActivity(i);
    }

   /* private List<Restaurant> restaurants;

    private void initializeData(){
        restaurants = new ArrayList<Restaurant>();
        restaurants.add(new Restaurant("Persis Biryani", "1665 Stelton Rd, Piscataway Township, NJ 08854", "4.8 Star", R.drawable.veg));
        restaurants.add(new Restaurant("Paradise Biryani", "1980 NJ-27, North Brunswick Township, NJ 08902", "4.3 Star", R.drawable.veg));
        restaurants.add(new Restaurant("Bawarchi Biryani", "3201 NJ-27, Franklin Park, NJ 08823", "4.1 Star", R.drawable.veg));

        restaurants.add(new Restaurant("Persis Biryani 1", "1665 Stelton Rd, Piscataway Township, NJ 08854", "4.8 Star", R.drawable.veg));
        restaurants.add(new Restaurant("Paradise Biryani2", "1980 NJ-27, North Brunswick Township, NJ 08902", "4.3 Star", R.drawable.veg));
        restaurants.add(new Restaurant("Bawarchi Biryani3", "3201 NJ-27, Franklin Park, NJ 08823", "4.1 Star", R.drawable.veg));

        restaurants.add(new Restaurant("Persis Biryani4", "1665 Stelton Rd, Piscataway Township, NJ 08854", "4.8 Star", R.drawable.veg));
        restaurants.add(new Restaurant("Paradise Biryani", "1980 NJ-27, North Brunswick Township, NJ 08902", "4.3 Star", R.drawable.veg));
        restaurants.add(new Restaurant("Bawarchi Biryani", "3201 NJ-27, Franklin Park, NJ 08823", "4.1 Star", R.drawable.veg));

        restaurants.add(new Restaurant("Persis Biryani", "1665 Stelton Rd, Piscataway Township, NJ 08854", "4.8 Star", R.drawable.veg));
        restaurants.add(new Restaurant("Paradise Biryani", "1980 NJ-27, North Brunswick Township, NJ 08902", "4.3 Star", R.drawable.veg));
        restaurants.add(new Restaurant("Bawarchi Biryani", "3201 NJ-27, Franklin Park, NJ 08823", "4.1 Star", R.drawable.veg));

        restaurants.add(new Restaurant("Persis Biryani", "1665 Stelton Rd, Piscataway Township, NJ 08854", "4.8 Star", R.drawable.veg));
        restaurants.add(new Restaurant("Paradise Biryani", "1980 NJ-27, North Brunswick Township, NJ 08902", "4.3 Star", R.drawable.veg));
        restaurants.add(new Restaurant("Bawarchi Biryani", "3201 NJ-27, Franklin Park, NJ 08823", "4.1 Star", R.drawable.veg));
    }*/

}
