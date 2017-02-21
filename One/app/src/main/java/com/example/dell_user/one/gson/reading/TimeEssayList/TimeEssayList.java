package com.example.dell_user.one.gson.reading.TimeEssayList;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wanjian on 2017/2/19.
 */

//根据年月份获取短篇文章列表

public class TimeEssayList {

    @SerializedName("res")
    private int res;

    @SerializedName("data")
    private List<Data_TimeEssayList> data ;

    public void setRes(int res){
        this.res = res;
    }
    public int getRes(){
        return this.res;
    }

    public void setData(List<Data_TimeEssayList> data){
        this.data = data;
    }
    public List<Data_TimeEssayList> getData(){
        return this.data;
    }

}
