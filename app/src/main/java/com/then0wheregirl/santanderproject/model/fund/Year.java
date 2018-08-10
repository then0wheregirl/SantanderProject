package com.then0wheregirl.santanderproject.model.fund;

import com.google.gson.annotations.SerializedName;

public class Year {

    public double fund;

    public double getFund() {
        return fund;
    }

    public void setFund(double fund){
        this.fund = fund;
    }

    @SerializedName("CDI")
    public double cdi;

    public double getCdi(){
        return cdi;
    }

    public void setCdi(double cdi){
        this.cdi = cdi;
    }
}

