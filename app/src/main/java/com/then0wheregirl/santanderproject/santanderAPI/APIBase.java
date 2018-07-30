package com.then0wheregirl.santanderproject.santanderAPI;

import com.then0wheregirl.santanderproject.utils.Path;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public interface APIBase {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl (Path.URL_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
