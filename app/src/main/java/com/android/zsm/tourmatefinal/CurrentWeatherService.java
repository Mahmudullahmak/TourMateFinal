package com.android.zsm.tourmatefinal;

import com.android.zsm.tourmatefinal.CurrentWeatherResponse;
import com.android.zsm.tourmatefinal.ForcastWeatherResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Devils God on 2/9/2018.
 */

public interface CurrentWeatherService {

    @GET()
    Call<CurrentWeatherResponse> getCurrentWeatherData(@Url String endUrl);
    @GET()
    Call<ForcastWeatherResponse> getAllForcastData(@Url String endUrl);

}
