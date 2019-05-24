package com.fitbit.weighttracker.model.database;



import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface WeightDao {
    @Insert
    public void insert(WeightTable... weights);

    @Update
    public void update(WeightTable... weights);

    @Delete
    public void delete(WeightTable weight);

    @Query("SELECT * FROM weight_table")
    public List<WeightTable> getItems();

    @Query("SELECT * FROM weight_table WHERE weightId = :id")
    public WeightTable getItemById(Long id);

    @Query("SELECT * FROM weight_table")
    public LiveData<List<WeightTable>> getAllItems();
}