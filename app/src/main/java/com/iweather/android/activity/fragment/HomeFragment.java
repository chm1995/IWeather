package com.iweather.android.activity.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.iweather.android.R;
import com.iweather.android.WeatherApi;
import com.iweather.android.WeatherDataBean;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by asus1 on 2016/12/26.
 */

public class HomeFragment extends Fragment {

    private String url = "http://api.avatardata.cn/";
    private String key = "5cc7321863d44842b2c366a15ed6c89c";
    private String cityname = "长沙";
    public TextView tv_cityname, tv_temperature, tv_info, tv_humidity, tv_power, tv_direct, tv_pm25,tv_pm10,tv_quality;
    ListView mylistview;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fragment_home, container, false);//关联布局文件
        initview(mView);
        getdata();
        return mView;
    }

    private void initview(View mView) {
        tv_cityname = (TextView) mView.findViewById(R.id.tv_cityname);//城市
        tv_temperature = (TextView) mView.findViewById(R.id.tv_temperature);//温度
        tv_info = (TextView) mView.findViewById(R.id.tv_info);//天气  如:多云、晴
        tv_humidity = (TextView) mView.findViewById(R.id.tv_humidity);//湿度
        tv_power = (TextView) mView.findViewById(R.id.tv_power);//风级  如:3级
        tv_direct = (TextView) mView.findViewById(R.id.tv_direct);//风向
        tv_pm25 = (TextView) mView.findViewById(R.id.tv_pm25);//pm2.5
        tv_pm10=(TextView) mView.findViewById(R.id.tv_pm10);//pm10
        tv_quality=(TextView) mView.findViewById(R.id.tv_quality);//空气质量
        mylistview = (ListView) mView.findViewById(R.id.mylist);
    }


    public void getdata() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        WeatherApi api = retrofit.create(WeatherApi.class);
        Call<WeatherDataBean> call = api.getWeather(key, cityname);
        call.enqueue(new Callback<WeatherDataBean>() {
            @Override
            public void onResponse(Call<WeatherDataBean> call, Response<WeatherDataBean> response) {
                WeatherDataBean bean = response.body();
                WeatherDataBean.ResultBean.RealtimeBean realtimebean = bean.getResult().getRealtime();
                WeatherDataBean.ResultBean.RealtimeBean.WindBean mWindBean = realtimebean.getWind();
                WeatherDataBean.ResultBean.RealtimeBean.WeatherBean mWeatherBean=realtimebean.getWeather();
                WeatherDataBean.ResultBean.Pm25BeanX.Pm25Bean mpm25 =bean.getResult().getPm25().getPm25();


                tv_cityname.setText(realtimebean.getCity_name());
                tv_direct.setText(mWindBean.getDirect());
                tv_power.setText(mWindBean.getPower());

                tv_humidity.setText(mWeatherBean.getHumidity());
                tv_info.setText(mWeatherBean.getInfo());
                tv_temperature.setText(mWeatherBean.getTemperature()+"℃");

                tv_pm25.setText(mpm25.getPm25());
                tv_pm10.setText(mpm25.getPm10());
                tv_quality.setText(mpm25.getQuality());
            }

            @Override
            public void onFailure(Call<WeatherDataBean> call, Throwable throwable) {

            }
        });
    }
}
