package com.zephyr.task2.Utilities;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitHelper {

    private static RetrofitHelper instance = null;
    private final ServiceInterface serviceInterface;

    private RetrofitHelper() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(ServiceInterface.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        serviceInterface = retrofit.create(ServiceInterface.class);
    }

    public static synchronized RetrofitHelper getInstance() {
        if (instance == null) {
            instance = new RetrofitHelper();
        }
        return instance;
    }

    public ServiceInterface getServiceInterface() {
        return serviceInterface;
    }
}