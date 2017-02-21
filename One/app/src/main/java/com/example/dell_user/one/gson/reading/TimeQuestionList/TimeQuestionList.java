package com.example.dell_user.one.gson.reading.TimeQuestionList;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wanjian on 2017/2/20.
 */

//根据年月份获取问答文章列表

public class TimeQuestionList {

    @SerializedName("")
    private int res;

    @SerializedName("")
    private List<Data_TimeQuestionList> data ;


    public void setRes(int res){
        this.res = res;
    }
    public int getRes(){
        return this.res;
    }

    public void setData(List<Data_TimeQuestionList> data){
        this.data = data;
    }
    public List<Data_TimeQuestionList> getData(){
        return this.data;
    }

}
