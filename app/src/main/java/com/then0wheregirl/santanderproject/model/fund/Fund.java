package com.then0wheregirl.santanderproject.model.fund;

import com.google.gson.annotations.SerializedName;

public class Fund {

    @SerializedName("screen")
    private Screen screen;

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;

    }

}
