package com.then0wheregirl.santanderproject.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.then0wheregirl.santanderproject.R;

public class SantanderViewHolder extends RecyclerView.ViewHolder{

    public TextView name;
    public TextView data;

    public SantanderViewHolder(View infoView){
        super(infoView);
        name = infoView.findViewById(R.id.name);
        data = infoView.findViewById(R.id.data);

    }
}
