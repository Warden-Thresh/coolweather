package com.warden.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Warden on 2017/4/11.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;

        public int code;
    }
}
