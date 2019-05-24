package com.fitbit.weighttracker.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fitbit.weighttracker.R;
import com.fitbit.weighttracker.model.database.WeightTable;
import com.fitbit.weighttracker.viewmodel.WeightListViewModel;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class WeightsDataAdapter extends RecyclerView.Adapter<WeightsDataAdapter.WeightViewHolder> {
    final String TAG = "RVAdapter";
    List<WeightTable> bodyWeights;
    Context mContext;

    WeightListViewModel mWeightListViewModel;
    ListItemClickClickListener mListItemClickClickListener;

    public WeightsDataAdapter(Context context, ListItemClickClickListener listItemClickClickListener) {
        mContext = context;
        mListItemClickClickListener = listItemClickClickListener;
    }

    @Override
    public WeightViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.weight_card_view, viewGroup, false);
        return new WeightViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull WeightViewHolder WeightViewHolder, final int i) {
        WeightViewHolder.date.setText(bodyWeights.get(i).getDate());
        WeightViewHolder.weight.setText(bodyWeights.get(i).getWeight() + "");
        WeightViewHolder.arrowDown.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            mListItemClickClickListener.onDeleteClick(bodyWeights.get(i));
        }
        }
        );

    }

    @Override
    public int getItemCount() {
        if (bodyWeights !=null) {
            return bodyWeights.size();
        }
        return 0;
    }

    public void updateData(List<WeightTable> lbodyWeights) {
        bodyWeights = lbodyWeights;
        bodyWeights = lbodyWeights;
        notifyDataSetChanged();
    }

    public interface ListItemClickClickListener {
        void onDeleteClick(WeightTable mWeightTable);
    }

    public static class WeightViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView date;
        TextView weight;

        ImageView arrowDown;
        WeightViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            date = (TextView) itemView.findViewById(R.id.todaysdate);
            weight = (TextView) itemView.findViewById(R.id.weight);
            arrowDown = (ImageView) itemView.findViewById(R.id.drop_down);
        }
    }

}