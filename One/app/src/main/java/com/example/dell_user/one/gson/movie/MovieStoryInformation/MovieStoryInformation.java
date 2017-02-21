package com.example.dell_user.one.gson.movie.MovieStoryInformation;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wanjian on 2017/2/19.
 */

//根据id获取电影故事信息
public class MovieStoryInformation {

    @SerializedName("res")
    private int res;

    @SerializedName("data")
    private DataContent data;

    public void setRes(int res){
        this.res = res;
    }
    public int getRes(){
        return this.res;
    }

    public void setData(DataContent data){
        this.data = data;
    }
    public DataContent getData(){
        return this.data;
    }
}
