package com.warden.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Warden on 2017/4/11.
 */

public class Forecast {
    public String date;

    @SerializedName("temp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;

        @SerializedName("code_d")
        public String code;
    }

}
