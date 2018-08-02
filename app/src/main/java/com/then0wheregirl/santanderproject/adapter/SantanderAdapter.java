package com.then0wheregirl.santanderproject.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.then0wheregirl.santanderproject.R;

import com.then0wheregirl.santanderproject.model.fund.Info;

import java.util.List;

public class SantanderAdapter extends RecyclerView.Adapter<SantanderViewHolder> {

    private List<Info> infos;

    public SantanderAdapter (List<Info> infos){
        this.infos = infos;
    }

    @NonNull
    @Override
    public SantanderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        return new SantanderViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.info_list, parent, false));
    }


   @Override
   public void onBindViewHolder(@NonNull SantanderViewHolder holder, final int position){
        Info info = infos.get(position);

        holder.name.setText(info.getName());
        holder.data.setText(info.getData());
    }

    @Override
    public int getItemCount(){
        return infos != null ? infos.size() : 0;
    }

}
