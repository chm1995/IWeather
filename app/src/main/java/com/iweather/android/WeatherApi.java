package com.iweather.android;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by asus1 on 2016/12/27.
 */

public interface WeatherApi {
    @GET("Weather/Query")
    Call<WeatherDataBean> getWeather(@Query("key") String accesskey,@Query("cityname") String cityname);
}
