package com.then0wheregirl.santanderproject.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.then0wheregirl.santanderproject.R;
import com.then0wheregirl.santanderproject.adapter.SAdapterInfo;
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


    public TextView title, fundName, whatIs, definition, riskTitle, infoTitle;
    public TextView fund_title, cdi_title, month, year, twelvemonths;
    public TextView fund1, fund2, fund3, cdi1, cdi2, cdi3;
    public View v_ir_1,  v_ir_2, v_ir_3,  v_ir_4,  v_ir_5;
    public SAdapterInfo sAdapter;
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
        infoTitle = view.findViewById( R.id.infoTitle );

        fund_title = view.findViewById( R.id.fund_title);
        cdi_title = view.findViewById( R.id.cdi_title);
        month = view.findViewById( R.id.month);
        year = view.findViewById( R.id.year);
        twelvemonths = view.findViewById( R.id.twelvemonths);
        fund1 = view.findViewById( R.id.fund1);
        fund2 = view.findViewById( R.id.fund2);
        fund3 = view.findViewById( R.id.fund3);
        cdi1 = view.findViewById( R.id.cdi1);
        cdi2 = view.findViewById( R.id.cdi2);
        cdi3 = view.findViewById( R.id.cdi3);

        v_ir_1 = view.findViewById( R.id.v_ir_1);
        v_ir_2 = view.findViewById( R.id.v_ir_2);
        v_ir_3 = view.findViewById( R.id.v_ir_3);
        v_ir_4 = view.findViewById( R.id.v_ir_4);
        v_ir_5 = view.findViewById( R.id.v_ir_5);

        infoList = new ArrayList<>(  );

        mRecycler = view.findViewById( R.id.rc_info );

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
                infoTitle.setText( fundReturnContect.getScreen().getTitle() );

                fund1.setText( String.valueOf( fundReturnContect.getScreen().getMoreInfo().getMonth().getFund() ) );
                fund2.setText( String.valueOf( fundReturnContect.getScreen().getMoreInfo().getMonth().getFund() ) );
                fund3.setText( String.valueOf( fundReturnContect.getScreen().getMoreInfo().getMonth().getFund() ) );
                cdi1.setText( String.valueOf( fundReturnContect.getScreen().getMoreInfo().getMonth().getFund() ) );
                cdi2.setText( String.valueOf( fundReturnContect.getScreen().getMoreInfo().getMonth().getFund() ) );
                cdi3.setText( String.valueOf( fundReturnContect.getScreen().getMoreInfo().getMonth().getFund() ) );


                settingRecycler( fundReturnContect.getScreen().getInfo() );         }

                //falta fazer o risk measure


            @Override
            public void onFailure(Call<Fund> call, Throwable response) {

                System.out.println("Error indentified" +response.getMessage());
            }
        });
    }

    private void settingRecycler(List<Info> infoList) {
        LinearLayoutManager layoutManager = new LinearLayoutManager( getContext() );
        mRecycler.setLayoutManager( layoutManager );
        sAdapter = new SAdapterInfo( getContext(), infoList );
        mRecycler.setAdapter( sAdapter );
    }
}
