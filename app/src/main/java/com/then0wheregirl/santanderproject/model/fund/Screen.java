package com.then0wheregirl.santanderproject.model.fund;

import java.io.Serializable;
import java.util.ArrayList;

public class Screen implements Serializable {


    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    private String fundName;

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }



    private String whatIs;

    public String getWhatIs() {
        return whatIs;
    }

    public void setWhatIs(String whatIs) {
        this.whatIs = whatIs;
    }



    private String definition;

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }



    private String riskTitle;

    public String getRiskTitle() {
        return riskTitle;
    }

    public void setRiskTitle(String riskTitle) {
        this.riskTitle = riskTitle;
    }



    private int risk;

    public int getRisk(){
        return risk;
    }

    public void setRisk(int risk){
        this.risk = risk;
    }



    private String infoTitle;

    public String getInfoTitle() {
        return infoTitle;
    }

    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle;
    }



    private MoreInfo moreInfo;

    public MoreInfo getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(MoreInfo moreInfo) {
        this.moreInfo = moreInfo;
    }



    private ArrayList<Info> info = new ArrayList<Info>();


    public ArrayList<Info> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<Info> info) {
        this.info = info;
    }



    private ArrayList<DownInfo> downinfo = new ArrayList<DownInfo>();


    public ArrayList<DownInfo> getDownInfo() {
        return downinfo;
    }

    public void setDowninfo(ArrayList<DownInfo> downinfo) {
        this.downinfo = downinfo;
    }
}
