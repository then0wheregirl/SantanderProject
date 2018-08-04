package com.then0wheregirl.santanderproject.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.then0wheregirl.santanderproject.MainActivity;
import com.then0wheregirl.santanderproject.R;
import com.then0wheregirl.santanderproject.model.fund.Fund;
import com.then0wheregirl.santanderproject.santanderAPI.APIBase;
import com.then0wheregirl.santanderproject.santanderAPI.EndPoint;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class InvestimentFragment extends Fragment {


    private TextView name, whatIs, fundName;

    public InvestimentFragment() {
        // Required empty public constructor


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_investiment, container, false);

        name = view.findViewById(R.id.name);
        whatIs = view.findViewById(R.id.whatIs);
        fundName = view.findViewById(R.id.fundName);


        getGeneralContent();

        return view;
    }

    private void getGeneralContent(){
        EndPoint endPoint = APIBase.retrofit.create(EndPoint.class);

        final Call<Fund> fund = endPoint.getFund();

        fund.enqueue(new Callback<Fund>() {
            @Override
            public void onResponse(Call<Fund> call, Response<Fund> response) {
                Fund fundReturnContect = response.body();


                name.setText(fundReturnContect.getScreen().getTitle());
                whatIs.setText(fundReturnContect.getScreen().getTitle());
                fundName.setText(fundReturnContect.getScreen().getTitle());

            }

            @Override
            public void onFailure(Call<Fund> call, Throwable response) {

            }
        });
    }
}
