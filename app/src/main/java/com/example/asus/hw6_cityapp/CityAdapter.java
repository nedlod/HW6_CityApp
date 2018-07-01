package com.example.asus.hw6_cityapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.CityViewHolder> {


    private ArrayList<City> citiesList;
    private CityViewHolder.OnItemClickListener listener;

    public CityAdapter(ArrayList<City> citiesList, CityViewHolder.OnItemClickListener listener) {
        this.citiesList = citiesList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CityAdapter.CityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_fragment_first, parent, false);

        return new CityViewHolder(itemView, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull CityAdapter.CityViewHolder holder, final int position) {
        LoadImageTask loadImageTask = new LoadImageTask(holder.imgCity);
        loadImageTask.execute(citiesList.get(position).getPictureUrl());

        holder.txtCityName.setText(citiesList.get(position).getCityName());
        holder.txtCityInfo.setText(citiesList.get(position).getCityInfo());
        holder.allItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(citiesList.get(position).getCityInfo());
            }
        });
    }

    @Override
    public int getItemCount() {
        return citiesList.size();
    }

    public static class CityViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgCity;
        private TextView txtCityName;
        private TextView txtCityInfo;
        private CardView allItems;

        public CityViewHolder(View itemView, OnItemClickListener listener) {
            super( itemView );

            imgCity = itemView.findViewById(R.id.city_pic);
            txtCityName = itemView.findViewById(R.id.city_name);
            txtCityInfo = itemView.findViewById(R.id.city_info);
            allItems = itemView.findViewById(R.id.cv);
        }

        public interface OnItemClickListener {
            void onItemClick(String info);
        }
    }


}