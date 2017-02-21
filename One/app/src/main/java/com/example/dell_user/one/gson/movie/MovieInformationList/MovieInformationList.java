package com.example.dell_user.one.gson.movie.MovieInformationList;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wanjian on 2017/2/19.
 */

//分页获取电影简略信息列表
public class MovieInformationList {

    @SerializedName("res")
    private Integer res;

    @SerializedName("data")
    private List<Data_MovieInformationList> data ;

    public void setRes(Integer res){
        this.res = res;
    }
    public int getRes(){
        return this.res;
    }

    public void setData(List<Data_MovieInformationList> data){
        this.data = data;
    }
    public List<Data_MovieInformationList> getData(){
        return this.data;
    }
}
