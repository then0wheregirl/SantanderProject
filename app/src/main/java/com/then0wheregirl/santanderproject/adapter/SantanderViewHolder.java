package com.then0wheregirl.santanderproject.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class SantanderViewHolder extends RecyclerView.ViewHolder{

    public TextView name;
    public TextView data;

    public SantanderViewHolder(View itemView){
        super(itemView);
        name = itemView.findViewById(R.id.text);
        data = itemView.findViewById(R.id.data);

    }
}
