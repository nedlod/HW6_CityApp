package com.example.asus.hw6_cityapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class FirstFragment extends Fragment implements CityAdapter.CityViewHolder.OnItemClickListener {


    private RecyclerView recyclerView;
    private CityAdapter cityAdapter;
    private CardView cardView;
    Context context;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.layout_fragment_first, container, false );
        FillCityArrayList.getFillList();
        FillCityArrayList.getFillCityList();

        ArrayList <City> cities = FillCityArrayList.getCities();

        recyclerView = (RecyclerView) rootView.findViewById( R.id.my_recycler_view );
        cardView = (CardView) rootView.findViewById( R.id.cv );
        recyclerView.setLayoutManager( new LinearLayoutManager( getActivity() ) );
        cityAdapter = new CityAdapter( cities, this );
        recyclerView.setAdapter( cityAdapter );

        return rootView;
    }


}