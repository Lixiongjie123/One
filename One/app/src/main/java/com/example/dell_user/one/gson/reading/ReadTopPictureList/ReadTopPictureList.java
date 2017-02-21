package com.example.dell_user.one.gson.reading.ReadTopPictureList;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wanjian on 2017/2/18.
 */

//获取阅读顶部的滚动图片列表
public class ReadTopPictureList {

    @SerializedName("res")
    private int res;

    @SerializedName("data")
    private List<Data_ReadTopPictureList> data ;

    public void setRes(int res){
        this.res = res;
    }
    public int getRes(){
        return this.res;
    }

    public void setData(List<Data_ReadTopPictureList> data){
        this.data = data;
    }
    public List<Data_ReadTopPictureList> getData(){
        return this.data;
    }
}
