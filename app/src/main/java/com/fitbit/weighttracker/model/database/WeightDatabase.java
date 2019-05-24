package com.fitbit.weighttracker.model.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {WeightTable.class}, version = 1)
public abstract class WeightDatabase extends RoomDatabase {
    public abstract WeightDao getWeightDAO();

    static WeightDatabase mWeightDatabase;

    public static WeightDatabase getInstance(Context context) {
        if (mWeightDatabase == null) {
            mWeightDatabase = buildDatabase(context);
        }
        return mWeightDatabase;
    }

    static WeightDatabase buildDatabase(Context context) {
        return Room.databaseBuilder(context, WeightDatabase.class, "weight-db").allowMainThreadQueries().build();
    }

}
