package com.then0wheregirl.santanderproject.santanderAPI;

import com.then0wheregirl.santanderproject.model.cells.CellsDataModel;
import com.then0wheregirl.santanderproject.model.fund.FundDataModel;
import com.then0wheregirl.santanderproject.utils.Path;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EndPoint {


    @GET(Path.URL_INVESTRoute)
    Call<List<FundDataModel>> getmodel();

    @GET(Path.URL_CONTACTRoute)
    Call<List<CellsDataModel>> getmodel();

}
