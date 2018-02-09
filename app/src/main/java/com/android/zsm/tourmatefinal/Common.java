package com.android.zsm.tourmatefinal;

import com.android.zsm.tourmatefinal.Remote.IGoogleAPIService;
import com.android.zsm.tourmatefinal.Remote.RetrofitClient;

/**
 * Created by Devils God on 2/9/2018.
 */

public class Common {
    private static final String GOOGLE_API_URL="https://maps.googleapis.com";
    public static IGoogleAPIService getGoogleAPIService()
    {
        return RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService.class);

    }
}
