package com.fitbit.weighttracker.view;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.fitbit.weighttracker.InjectorUtil;
import com.fitbit.weighttracker.R;
import com.fitbit.weighttracker.model.BodyWeights;
import com.fitbit.weighttracker.model.database.WeightTable;
import com.fitbit.weighttracker.view.adapter.WeightsDataAdapter;
import com.fitbit.weighttracker.viewmodel.WeightListViewModel;
import com.fitbit.weighttracker.viewmodel.WeightListViewModelFactory;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class WeightListActivity extends AppCompatActivity implements WeightsDataAdapter.ListItemClickClickListener {
    List<BodyWeights> bodyWeights;
    RecyclerView rv;
    Context mContext;
    WeightsDataAdapter adapter;
    WeightListViewModel mWeightListViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_demo);
        rv = (RecyclerView) findViewById(R.id.rv);
        mContext = this;
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        adapter = new WeightsDataAdapter(this,this);
        rv.setAdapter(adapter);
        WeightListViewModelFactory factory = InjectorUtil.getWeightListViewModelFactory(this);
        mWeightListViewModel = ViewModelProviders.of(this, factory).get(WeightListViewModel.class);
        mWeightListViewModel.mWeights.observe(this, new Observer<List<WeightTable>>() {
            @Override
            public void onChanged(List<WeightTable> weightTables) {
                adapter.updateData(weightTables);
            }
        });
    }
    public void addWeight(View v) {
        mWeightListViewModel.insertWeight(mWeightListViewModel.generateRandomWeight());
        rv.smoothScrollToPosition(adapter.getItemCount());
    }
    @Override
    public void onDeleteClick(WeightTable weightItem) {
        mWeightListViewModel.deleteWeight(weightItem);
    }
}