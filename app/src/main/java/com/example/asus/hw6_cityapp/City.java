package com.example.asus.hw6_cityapp;

import android.widget.Button;

public class City {

    String pictureUrl;
    String cityName;
    String cityInfo;
    boolean isLiked;

    public City(String pictureUrl, String cityName, String cityInfo, boolean isLiked) {
        this.pictureUrl = pictureUrl;
        this.cityName = cityName;
        this.cityInfo = cityInfo;
        this.isLiked = isLiked;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(String cityInfo) {
        this.cityInfo = cityInfo;
    }
}