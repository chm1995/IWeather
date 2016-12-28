package com.iweather.android.activity.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

    String url = "http://service.envicloud.cn:8082/";
    String key="CXEXNTG3OTA2MJCXNDGXMTA2MDY5MJGY";
    int citycode=101190101;
    TextView tv_result;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fragment_home, container, false);//关联布局文件
        tv_result= (TextView) mView.findViewById(R.id.tv_result);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        WeatherApi api = retrofit.create(WeatherApi.class);
        Call<WeatherDataBean> call = api.getWeather(key,citycode);
        call.enqueue(new Callback<WeatherDataBean>() {
            @Override
            public void onResponse(Call<WeatherDataBean> call, Response<WeatherDataBean> response) {
                WeatherDataBean bean = response.body();
                WeatherDataBean.ForecastBean fbean=bean.getForecast().get(0);
                tv_result.setText(bean.getCitycode()+fbean.getCond().getCond_n());
            }

            @Override
            public void onFailure(Call<WeatherDataBean> call, Throwable throwable) {

            }
        });
        return mView;
    }
}
