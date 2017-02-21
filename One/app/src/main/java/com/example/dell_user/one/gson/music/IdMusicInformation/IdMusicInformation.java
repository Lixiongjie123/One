package com.example.dell_user.one.gson.music.IdMusicInformation;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wanjian on 2017/2/20.
 */

//根据id获取音乐详细信息

public class IdMusicInformation {

    @SerializedName("res")
    private int res;

    @SerializedName("data")
    private Data_IdMusicInformation data;


    public void setRes(int res){
        this.res = res;
    }
    public int getRes(){
        return this.res;
    }

    public void setData(Data_IdMusicInformation data){
        this.data = data;
    }
    public Data_IdMusicInformation getData(){
        return this.data;
    }

}
