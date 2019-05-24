package com.fitbit.weighttracker.viewmodel;

import com.fitbit.weighttracker.model.WeightRepository;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;

import static androidx.lifecycle.ViewModelProvider.NewInstanceFactory;

public class WeightListViewModelFactory extends NewInstanceFactory {

    WeightRepository weightRepository;

    public WeightListViewModelFactory(WeightRepository lweightRepository) {
        weightRepository = lweightRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new WeightListViewModel(weightRepository);
    }
}
