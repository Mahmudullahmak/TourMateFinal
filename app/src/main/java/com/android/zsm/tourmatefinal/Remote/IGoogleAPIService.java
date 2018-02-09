package com.android.zsm.tourmatefinal.Remote;

import com.android.zsm.tourmatefinal.model.MyPlaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Devils God on 2/9/2018.
 */

public interface IGoogleAPIService {
    @GET
    Call<MyPlaces> getNearbyPlaces(@Url String url);
}
