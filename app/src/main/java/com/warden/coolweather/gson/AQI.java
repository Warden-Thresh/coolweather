package com.warden.coolweather.gson;

/**
 * Created by Warden on 2017/4/11.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
        public String qlty;
    }
}
