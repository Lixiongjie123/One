package com.example.dell_user.one.gson.reading.TopPictureInformation;


import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wanjian on 2017/2/19.
 */

//根据id获取顶部滚动图片点击进去的详细信息
public class TopPictureInformation {

    @SerializedName("res")
    private int res;

    @SerializedName("data")
    private List<Data_TopPictureInformation> data ;

    public void setRes(int res){
        this.res = res;
    }
    public int getRes(){
        return this.res;
    }

    public void setData(List<Data_TopPictureInformation> data){
        this.data = data;
    }
    public List<Data_TopPictureInformation> getData(){
        return this.data;
    }
}
