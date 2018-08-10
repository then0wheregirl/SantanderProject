package com.then0wheregirl.santanderproject.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.then0wheregirl.santanderproject.R;
import com.then0wheregirl.santanderproject.model.fund.DownInfo;
import com.then0wheregirl.santanderproject.model.fund.Info;

import java.util.List;

public class SAdapterDownInfo extends RecyclerView.Adapter<SAdapterDownInfo.ViewHolder>{

    Context diContext;
    List<DownInfo> downInfoList;

    public SAdapterDownInfo(Context diContext, List<DownInfo> downInfoList){
        this.diContext = diContext;
        this.downInfoList = downInfoList;
    }

    @Override
    public SAdapterDownInfo.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view;
        view = LayoutInflater.from( diContext ).inflate( R.layout.downinfo_list, parent, false);
        SAdapterDownInfo.ViewHolder viewHolder = new SAdapterDownInfo.ViewHolder( view );
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(SAdapterDownInfo.ViewHolder holder, final int position){
        DownInfo downInfo = downInfoList.get(position);

        holder.diname.setText(downInfo.getName());
        holder.didata.setText(downInfo.getData());
    }

    @Override
    public int getItemCount(){
        return downInfoList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView diname, didata;

        public ViewHolder(View itemView){
            super(itemView);

            diname = itemView.findViewById( R.id.di_name );
            didata = itemView.findViewById( R.id.di_data );
        }
    }
}

