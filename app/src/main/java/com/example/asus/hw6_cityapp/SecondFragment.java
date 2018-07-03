package com.example.asus.hw6_cityapp;


import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
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

import com.example.asus.hw6_cityapp.roomdata.CityViewModel;
import com.example.asus.hw6_cityapp.roomdata.CityViewModel;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {

    private View view;
    private City cities;
    private ArrayList <City> citiesList;
    private CityViewModel viewModel;
    private RecyclerView recyclerView;
    private CityAdapter adapter;
    private CardView cardView;
    private CityAdapter cityAdapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.layout_fragment_second, container, false );


        return rootView;

    }
}