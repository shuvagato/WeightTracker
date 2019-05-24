package com.fitbit.weighttracker.viewmodel;

import com.fitbit.weighttracker.model.WeightRepository;
import com.fitbit.weighttracker.model.database.WeightTable;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class WeightListViewModel extends ViewModel {
    public LiveData<List<WeightTable>> mWeights;

    WeightRepository mWeightRepository;

    WeightListViewModel(WeightRepository weightRepository) {
        mWeightRepository = weightRepository;
        mWeights = mWeightRepository.getAllItems();
    }

    public void insertWeight(WeightTable mWeightTable) {
        mWeightRepository.insertWeight(mWeightTable);
    }
    public void deleteWeight(WeightTable mWeightTable) {
        mWeightRepository.deleteWeight(mWeightTable);
    }
    public WeightTable generateRandomWeight() {
        final int min = 120;
        final int max = 300;
        final int randomWeight = new Random().nextInt((max - min) + 1) + min;

        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("MMM-dd-yyyy");
        String date = df.format(c);
        WeightTable weightItem = new WeightTable();
        weightItem.setDate(date);
        weightItem.setWeight(randomWeight);
        return weightItem;
    }
}
