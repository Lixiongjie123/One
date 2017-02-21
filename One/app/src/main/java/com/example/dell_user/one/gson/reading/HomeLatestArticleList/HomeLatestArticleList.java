package com.example.dell_user.one.gson.reading.HomeLatestArticleList;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wanjian on 2017/2/19.
 */

//获取首页最新的文章列表
public class HomeLatestArticleList {

    @SerializedName("res")
    private int res;

    @SerializedName("data")
    private Data_HomeLatestArticleList data;

    public void setRes(int res){
        this.res = res;
    }
    public int getRes(){
        return this.res;
    }

    public void setData(Data_HomeLatestArticleList data){
        this.data = data;
    }
    public Data_HomeLatestArticleList getData(){
        return this.data;
    }


}
