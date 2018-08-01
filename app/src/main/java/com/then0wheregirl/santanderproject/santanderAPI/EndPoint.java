package com.then0wheregirl.santanderproject.santanderAPI;

import com.then0wheregirl.santanderproject.model.cells.Cell;
import com.then0wheregirl.santanderproject.model.fund.Fund;
import com.then0wheregirl.santanderproject.utils.Path;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EndPoint {


    @GET(Path.URL_INVESTRoute)
    Call<Fund> getFund();

    @GET(Path.URL_CONTACTRoute)
    Call<List<Cell>> getCell();

}
