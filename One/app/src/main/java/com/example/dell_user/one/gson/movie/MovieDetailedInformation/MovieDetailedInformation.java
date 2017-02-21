package com.example.dell_user.one.gson.movie.MovieDetailedInformation;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wanjian on 2017/2/19.
 */

//根据id获取电影详细信息,
public class MovieDetailedInformation {

    @SerializedName("res")
    private int res;

    @SerializedName("data")
    private Data_Detailedinformation data;

    public void setRes(int res){
        this.res = res;
    }
    public int getRes(){
        return this.res;
    }

    public void setData(Data_Detailedinformation data){
        this.data = data;
    }
    public Data_Detailedinformation getData(){
        return this.data;
    }

}
