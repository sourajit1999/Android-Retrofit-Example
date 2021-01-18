package com.zephyr.task2.Utilities;

import com.zephyr.task2.Models.DataModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceInterface {

    String BASE_URL = "https://run.mocky.io/v3/";

    @GET("a0528e65-80c9-4172-9231-876a622f25ef")
    Call<DataModel> getBooksList();
}