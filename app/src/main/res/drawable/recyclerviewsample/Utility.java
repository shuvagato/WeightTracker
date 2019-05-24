package com.samsung.recyclerviewsample;

import java.util.ArrayList;
import java.util.List;

public class Utility {

    private static com.samsung.recyclerviewsample.Utility utilityInstance = null;
    private Utility (){}


    public static com.samsung.recyclerviewsample.Utility getInstance(){
        if(utilityInstance == null)
            utilityInstance = new com.samsung.recyclerviewsample.Utility();

        return utilityInstance;
    }

    public List<Restaurant> initializeRestaurantList(){
        List<Restaurant> restaurants;
        restaurants = new ArrayList<Restaurant>();
        restaurants.add(new Restaurant("Persis Biryani", "1665 Stelton Rd, Piscataway Township, NJ 08854", "4.8 Star", R.drawable.veg));
        restaurants.add(new Restaurant("Paradise Biryani", "1980 NJ-27, North Brunswick Township, NJ 08902", "4.3 Star", R.drawable.veg));
        restaurants.add(new Restaurant("Bawarchi Biryani", "3201 NJ-27, Franklin Park, NJ 08823", "4.1 Star", R.drawable.veg));
        return restaurants;
    }

}
