package com.then0wheregirl.santanderproject.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.then0wheregirl.santanderproject.MainActivity;
import com.then0wheregirl.santanderproject.R;
import com.then0wheregirl.santanderproject.adapter.SantanderAdapter;
import com.then0wheregirl.santanderproject.model.fund.Fund;
import com.then0wheregirl.santanderproject.model.fund.Info;
import com.then0wheregirl.santanderproject.santanderAPI.APIBase;
import com.then0wheregirl.santanderproject.santanderAPI.EndPoint;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class InvestmentFragment extends Fragment {


    private TextView title, fundName, whatIs, definition, riskTitle;
    private SantanderAdapter sAdapter;
    public RecyclerView mRecycler;
    public List<Info> infoList;

    public InvestmentFragment() {
        // Required empty public constructor


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_investiment, container, false);

        title = view.findViewById( R.id.title );
        fundName = view.findViewById(R.id.fundName);
        whatIs = view.findViewById(R.id.whatIs);
        definition = view.findViewById( R.id.definition );
        riskTitle = view.findViewById( R.id.riskTitle );

        infoList = new ArrayList<>(  );

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

                title.setText( fundReturnContect.getScreen().getTitle() );
                fundName.setText(fundReturnContect.getScreen().getTitle());
                whatIs.setText(fundReturnContect.getScreen().getTitle());
                definition.setText( fundReturnContect.getScreen().getTitle() );
                riskTitle.setText( fundReturnContect.getScreen().getTitle() );

                settingRecycler( fundReturnContect.getScreen().getInfo() );         }

            @Override
            public void onFailure(Call<Fund> call, Throwable response) {

                System.out.println("Error indentified" +response.getMessage());
            }
        });
    }

    private void settingRecycler(List<Info> infoList) {
        LinearLayoutManager layoutManager = new LinearLayoutManager( getContext() );
        mRecycler.setLayoutManager( layoutManager );
        sAdapter = new SantanderAdapter( getContext(), infoList );
        mRecycler.setAdapter( sAdapter );
    }
}
