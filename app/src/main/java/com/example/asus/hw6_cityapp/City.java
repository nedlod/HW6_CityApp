package com.example.asus.hw6_cityapp;

public class City {

    String pictureUrl;
    String cityName;
    String cityInfo;

    public City(String pictureUrl, String cityName, String cityInfo) {
        this.pictureUrl = pictureUrl;
        this.cityName = cityName;
        this.cityInfo = cityInfo;
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