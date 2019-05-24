package com.samsung.recyclerviewsample;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<com.samsung.recyclerviewsample.RVAdapter.RestaurantViewHolder>{
    final String TAG = "RVAdapter";

    public static class RestaurantViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView restoName;
        TextView restoStar;
        TextView restoAddress;
        ImageView restoPhoto;
        ImageView arrowDown;

        RestaurantViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            restoName = (TextView)itemView.findViewById(R.id.resto_name);
            restoStar = (TextView)itemView.findViewById(R.id.resto_star);
            restoAddress = (TextView)itemView.findViewById(R.id.resto_address);
            restoPhoto = (ImageView)itemView.findViewById(R.id.resto_photo);
            arrowDown = (ImageView)itemView.findViewById(R.id.drop_down);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(),"Let's Go to " + restoName.getText(), Toast.LENGTH_LONG).show();
                    if(restoStar.getVisibility() != View.VISIBLE) {
                        restoStar.setVisibility(View.VISIBLE);
                        restoName.setTextSize(30);
                        restoAddress.setVisibility(View.VISIBLE);
                        //restoPhoto.setVisibility(View.VISIBLE);
                        arrowDown.setRotation(180);

                    } else {
                        restoStar.setVisibility(View.GONE);
                        restoAddress.setVisibility(View.GONE);
                        //restoPhoto.setVisibility(View.GONE);
                        arrowDown.setRotation(360);
                    }
                    //cv.getRootView().findViewById(R.id.resto_address).setVisibility(View.VISIBLE);
                    /*if(!cv.isExpanded()) {
                        cv.expand();
                    } else {
                        cv.collapse();
                    }*/
                }
            });
        }
    }

    List<com.samsung.recyclerviewsample.Restaurant> restaurants;

    RVAdapter(List<com.samsung.recyclerviewsample.Restaurant> restaurants){
        this.restaurants = restaurants;
    }

    @Override
    public int getItemCount() {
        Log.d("RVAdapter", "Size: " + restaurants.size());
        return restaurants.size();
    }

    @Override
    public RestaurantViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.resto_card_view, viewGroup, false);
        RestaurantViewHolder pvh = new RestaurantViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(RestaurantViewHolder RestoViewHolder, int i) {
        //RestoViewHolder.cv.setTitle(restaurants.get(i).restaurantName + "\n" + restaurants.get(i).restaurantStar);
        if(RestoViewHolder == null || restaurants.get(i).restaurantName == null || RestoViewHolder.restoName == null) {
            if(RestoViewHolder == null) {
                Log.e(TAG, "RestoViewHolder is null");
            } else if(restaurants.get(i).restaurantName == null) {
                Log.e(TAG, "Restaurant name is null");
            } else if(RestoViewHolder.restoName == null) {
                Log.e(TAG, "Resto Name is null");
            }

            return;
        }
        RestoViewHolder.restoName.setText(restaurants.get(i).restaurantName);
        RestoViewHolder.restoStar.setText(restaurants.get(i).restaurantStar);
        RestoViewHolder.restoAddress.setText(restaurants.get(i).restaurantAddress);
        RestoViewHolder.restoPhoto.setImageResource(restaurants.get(i).photoId);
    }



    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}