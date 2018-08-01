package com.then0wheregirl.santanderproject.model.fund;

import com.google.gson.annotations.SerializedName;

public class Month {

    public int fund;

    public int getFund() {
        return fund;
    }

    public void setFund(int fund){
        this.fund = fund;
    }

    @SerializedName("CDI")
    public int cdi;

    public int getCdi(){
        return cdi;
    }

    public void setCdi(int cdi){
        this.cdi = cdi;
    }
}
