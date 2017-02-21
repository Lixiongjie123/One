package com.example.dell_user.one.gson.home.TimeGraphicInformation;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wanjian on 2017/2/20.
 */

//根据年月份获取图文详细信息列表

public class TimeGraphicInformation {

    @SerializedName("res")
    private int res;

    @SerializedName("data")
    private List<Data_TimeGraphicInformation> data ;


    public void setRes(int res){
        this.res = res;
    }
    public int getRes(){
        return this.res;
    }

    public void setData(List<Data_TimeGraphicInformation> data){
        this.data = data;
    }
    public List<Data_TimeGraphicInformation> getData(){
        return this.data;
    }

}
