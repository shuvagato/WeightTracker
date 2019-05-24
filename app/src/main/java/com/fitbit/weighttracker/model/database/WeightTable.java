package com.fitbit.weighttracker.model.database;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "weight_table")
public class WeightTable {

    public int getWeightId() {
        return weightId;
    }

    public void setWeightId(int weightId) {
        this.weightId = weightId;
    }

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "weightId")
    private int weightId;

    @ColumnInfo(name = "date")
    private String date;

    @ColumnInfo(name = "weight")
    private int weight;

  /*  public WeightTable(String date, int weight) {
        this.weightId = weightId;
        this.date = date;
        this.weight = weight;
    }*/

    public int getId() {
        return this.weightId;
    }
    public String getDate() {
        return this.date;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setId(@NonNull int weightId) {
        this.weightId = weightId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}