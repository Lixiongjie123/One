package com.example.dell_user.one.gson.reading.TimeSerialList;

import com.example.dell_user.one.gson.reading.TimeSerialList.Data_TimeSerialList;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wanjian on 2017/2/19.
 */

//根据年月份获取连载文章列表

public class TimeSerialList {

    @SerializedName("res")
    private int res;

    @SerializedName("data")
    private List<Data_TimeSerialList> data ;


    public void setRes(int res){
        this.res = res;
    }
    public int getRes(){
        return this.res;
    }

    public void setData(List<Data_TimeSerialList> data){
        this.data = data;
    }
    public List<Data_TimeSerialList> getData(){
        return this.data;
    }
}
