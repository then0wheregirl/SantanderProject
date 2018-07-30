package com.then0wheregirl.santanderproject.santanderAPI;

import com.then0wheregirl.santanderproject.utils.Path;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRoutes {


    @GET(Path.URL_INVESTRoute)
    Call<List<model>> getmodel();

}
