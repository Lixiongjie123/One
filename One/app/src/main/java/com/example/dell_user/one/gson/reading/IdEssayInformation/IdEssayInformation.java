package com.example.dell_user.one.gson.reading.IdEssayInformation;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wanjian on 2017/2/19.
 */

//根据id获取短篇文章详细信息

public class IdEssayInformation {

    @SerializedName("res")
    private int res;

    @SerializedName("data")
    private Data_IdEssayInformation data;

    public void setRes(int res){
        this.res = res;
    }
    public int getRes(){
        return this.res;
    }

    public void setData(Data_IdEssayInformation data){
        this.data = data;
    }
    public Data_IdEssayInformation getData(){
        return this.data;
    }

}
