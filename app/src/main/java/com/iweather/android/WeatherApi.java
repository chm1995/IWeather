package com.iweather.android;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by asus1 on 2016/12/27.
 */

public interface WeatherApi {
    @GET("v2/weatherforecast/{accesskey}/{citycode}")
    Call<WeatherDataBean> getWeather(@Path("accesskey") String accesskey, @Path("citycode") int citycode);
}
