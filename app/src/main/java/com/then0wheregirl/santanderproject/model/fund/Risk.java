package com.then0wheregirl.santanderproject.model.fund;
import com.google.gson.annotations.SerializedName;

public enum Risk {

    @SerializedName( "1" )
    LOW(1),
    @SerializedName( "2" )
    LOW_MEDIUM(2),
    @SerializedName( "3" )
    MEDIUM(3),
    @SerializedName( "4" )
    MEDIUM_HIGH(4),
    @SerializedName( "5" )
    HIGH(5);

    private int risk;

    Risk(int i) {
        this.risk = i; {
        }

    }

    public int getRisk() {
        return risk;
    }
}
