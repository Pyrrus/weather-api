package com.example.guest.weather_api;

import java.util.ArrayList;

/**
 * Created by Guest on 11/29/16.
 */
public class Weather {
    private String mDay;
    private String mMin;
    private String mMax;
    private String mNight;
    private String mEve;
    private String mMorn;
    private String mPressure;
    private String mHumidity;
    private String mMain;
    private String mDescription;
    private String mSpeed;
    private String mDeg;
    private String mClouds;
    private String mRain;


    public Weather(String day, String min, String max, String night, String eve, String morn, String pressure, String humidity, String main, String description, String deg, String speed, String clouds, String rain) {
        this.mDay = day;
        this.mMin = min;
        this.mMax = max;
        this.mNight = night;
        this.mEve = eve;
        this.mMorn = morn;
        this.mPressure = pressure;
        this.mHumidity = humidity;
        this.mMain = main;
        this.mDescription = description;
        this.mSpeed = speed;
        this.mDeg = deg;
        this.mClouds = clouds;
        this.mRain = rain;
    }
    public String getDay() {
        return mDay;
    }
    public String getMin() {
        return mMin;
    }
    public String getMax() {
        return mMax;
    }
    public String getNight() {
        return mNight;
    }
    public String getEve() {
        return mEve;
    }
    public String getMorn() {
        return mMorn;
    }
    public String getPressure() {
        return mPressure;
    }
    public String getMain() {
        return mMain;
    }
    public String getDescription() {
        return mDescription;
    }
    public String getSpeed() {
        return mSpeed;
    }
    public String getDeg() {
        return mDeg;
    }
    public String getClouds() {
        return mClouds;
    }
    public String getRainy() {
        return mRain;
    }
    public String getmHumidity() {
        return mHumidity;
    }

}