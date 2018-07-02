package com.example.asus.hw6_cityapp.roomdata;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

public class CitiesViewModel extends AndroidViewModel {
    private CitiesRepository repository;
    private LiveData<List<Cities>> allCities;


    public CitiesViewModel(@NonNull Application application) {
        super(application);
        repository = new CitiesRepository(application);
        allCities = repository.getAllCities();
    }

    public LiveData<List<Cities>> getAllCities() {
        return allCities;
    }


    public void insert(Cities cities, int position) {
        repository.insert(cities);
    }

    public void delete(Cities cities, int position) {
        repository.delete(cities);
    }

    public void deleteAll() {
        repository.deleteAll();
    }
}
