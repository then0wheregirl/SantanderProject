package com.then0wheregirl.santanderproject.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.then0wheregirl.santanderproject.R;

import com.then0wheregirl.santanderproject.model.fund.Info;

import java.util.List;

public class SAdapterInfo extends RecyclerView.Adapter<SAdapterInfo.ViewHolder> {

    Context aContext;
    private List<Info> infoList;

    public SAdapterInfo(Context aContext, List<Info> infoList){
        this.aContext = aContext;
        this.infoList = infoList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view;
        view = LayoutInflater.from( aContext ).inflate(R.layout.info_list, parent, false);
        ViewHolder viewHolder = new ViewHolder( view );
        return viewHolder;
    }


   @Override
   public void onBindViewHolder(ViewHolder holder, final int position){
        Info info = infoList.get(position);

        holder.name.setText(info.getName());
        holder.data.setText(info.getData());
    }

    @Override
    public int getItemCount(){
        return infoList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView name, data;

        public ViewHolder(View itemView){
            super(itemView);

            name = itemView.findViewById( R.id.name );
            data = itemView.findViewById( R.id.data );
        }
    }

}
