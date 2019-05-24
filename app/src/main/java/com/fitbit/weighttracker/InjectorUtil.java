package com.fitbit.weighttracker;

import android.content.Context;

import com.fitbit.weighttracker.model.WeightRepository;
import com.fitbit.weighttracker.model.database.WeightDatabase;
import com.fitbit.weighttracker.viewmodel.WeightListViewModelFactory;

public class InjectorUtil {

    public static WeightDatabase getWeightDatabase(Context context) {
        return WeightDatabase.getInstance(context);
    }

    public static WeightRepository getWeightRepository(Context context) {
        return WeightRepository.getInstance(getWeightDatabase(context));
    }

    public static WeightListViewModelFactory getWeightListViewModelFactory(Context context) {
        return new WeightListViewModelFactory(getWeightRepository(context));
    }

}
