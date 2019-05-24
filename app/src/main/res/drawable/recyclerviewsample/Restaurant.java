package com.samsung.recyclerviewsample;

import java.io.Serializable;

public class Restaurant implements Serializable {

    String restaurantName;
    String restaurantAddress;
    String restaurantStar;
    int photoId;

    Restaurant(String restaurantName, String restaurantAddress, String restaurantStar, int photoId) {
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.restaurantStar = restaurantStar;
        this.photoId = photoId;
    }
}