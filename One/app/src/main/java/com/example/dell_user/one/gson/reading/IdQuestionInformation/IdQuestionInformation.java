package com.example.dell_user.one.gson.reading.IdQuestionInformation;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wanjian on 2017/2/20.
 */

//根据id获取问答文章详细信息

public class IdQuestionInformation {

    @SerializedName("res")
    private int res;

    @SerializedName("data")
    private Data_IdQuestionInformation data;


    public void setRes(int res){
        this.res = res;
    }
    public int getRes(){
        return this.res;
    }

    public void setData(Data_IdQuestionInformation data){
        this.data = data;
    }
    public Data_IdQuestionInformation getData(){
        return this.data;
    }

}
