package com.fitbit.weighttracker.model;

import java.io.Serializable;

public class BodyWeights implements Serializable {
    int index;
    String date;
    String weight;

    public BodyWeights(int index, String date, String weight) {
        this.index = index;
        this.date = date;
        this.weight = weight;

    }
}