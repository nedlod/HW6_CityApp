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
import android.widget.TextView;

import com.example.asus.hw6_cityapp.roomdata.CityViewModel;

import java.util.ArrayList;
import java.util.List;

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.CityViewHolder> {



    private ArrayList <City> citiesList;
    private CityViewHolder.OnItemClickListener listener;


    public CityAdapter(ArrayList <City> citiesList, CityViewHolder.OnItemClickListener listener) {
        this.citiesList = citiesList;
        this.listener = listener;
    }


    @NonNull
    @Override
    public CityAdapter.CityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from( parent.getContext() ).inflate( R.layout.layout_fragment_first, parent, false );

        return new CityViewHolder( itemView, listener );
    }

    @Override
    public void onBindViewHolder(@NonNull final CityAdapter.CityViewHolder holder, final int position) {

        final City currentCity = citiesList.get( position );

        LoadImageTask loadImageTask = new LoadImageTask( holder.imgCity );
        loadImageTask.execute( citiesList.get( position ).getPictureUrl() );

        holder.txtCityName.setText( citiesList.get( position ).getCityName() );
        holder.txtCityInfo.setText( citiesList.get( position ).getCityInfo() );
        holder.btnLike.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!currentCity.isLiked()){
                    currentCity.setLiked( true );
                    holder.btnLike.setText( "Unlike" );




                } else if (currentCity.isLiked()) {
                    currentCity.setLiked(false);
                    holder.btnLike.setText("Like");

                }

            }
        } );
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
        private Button btnLike;

        public CityViewHolder(View itemView, OnItemClickListener listener) {
            super( itemView );

            imgCity = itemView.findViewById( R.id.city_pic );
            txtCityName = itemView.findViewById( R.id.city_name );
            txtCityInfo = itemView.findViewById( R.id.city_info );
            btnLike = itemView.findViewById( R.id.btn_like );
            allItems = itemView.findViewById( R.id.cv );
        }


        public interface OnItemClickListener {

        }
    }
}

