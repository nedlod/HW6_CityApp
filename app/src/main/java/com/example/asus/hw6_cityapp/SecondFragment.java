package com.example.asus.hw6_cityapp;


import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asus.hw6_cityapp.roomdata.Cities;
import com.example.asus.hw6_cityapp.roomdata.CitiesViewModel;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment  {

    private View view;
    private Cities cities;
    private ArrayList<Cities> citiesList;
    private CitiesViewModel viewModel;
    private RecyclerView recyclerView;
    private CityAdapter adapter;
    private CardView cardView;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.layout_fragment_second, container, false );


        recyclerView = rootView.findViewById(R.id.my_recycler_view);
        adapter = new CityAdapter(viewModel);
        cardView = (CardView) view.findViewById( R.id.cv );
        viewModel = ViewModelProviders.of(this).get(CitiesViewModel.class);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        return rootView;
    }




}