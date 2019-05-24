package com.fitbit.weighttracker.model;

import com.fitbit.weighttracker.model.database.WeightDao;
import com.fitbit.weighttracker.model.database.WeightDatabase;
import com.fitbit.weighttracker.model.database.WeightTable;

import java.util.List;

import androidx.lifecycle.LiveData;

public class WeightRepository {

    WeightDao mWeightDao;

    static  WeightRepository mWeightRepository;

    public static WeightRepository getInstance(WeightDatabase weightDatabase) {
        if (mWeightRepository == null) {
            mWeightRepository = new WeightRepository(weightDatabase);
        }
        return mWeightRepository;
    }

    WeightRepository(WeightDatabase weightDatabase) {
        mWeightDao = weightDatabase.getWeightDAO();
    }

    public void insertWeight(WeightTable mWeightTable) {
        mWeightDao.insert(mWeightTable);
    }

    public void deleteWeight(WeightTable mWeightTable) {
        mWeightDao.delete(mWeightTable);
    }

    public LiveData<List<WeightTable>>  getAllItems () {
       return mWeightDao.getAllItems();
    }

}
