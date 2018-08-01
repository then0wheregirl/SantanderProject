package com.then0wheregirl.santanderproject.model.fund;

import com.google.gson.annotations.SerializedName;

public class MoreInfo {

    @SerializedName("month")
    private Month month;

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;

    }



    @SerializedName("year")
    private Year year;

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;

    }



    @SerializedName("12months")
    private TwelveMonths twelveMonths;

    public TwelveMonths getTwelveMonths() {
        return twelveMonths;
    }

    public void setTwelveMonths(TwelveMonths twelveMonths) {
        this.twelveMonths = twelveMonths;

    }
}
