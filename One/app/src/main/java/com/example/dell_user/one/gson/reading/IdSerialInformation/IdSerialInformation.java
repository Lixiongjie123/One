package com.example.dell_user.one.gson.reading.IdSerialInformation;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wanjian on 2017/2/20.
 */

//根据id获取连载文章详细信息

public class IdSerialInformation {

    @SerializedName("res")
    private int res;

    @SerializedName("data")
    private Data_IdSerialInformation data;


    public void setRes(int res){
        this.res = res;
    }
    public int getRes(){
        return this.res;
    }

    public void setData(Data_IdSerialInformation data){
        this.data = data;
    }
    public Data_IdSerialInformation getData(){
        return this.data;
    }
}
