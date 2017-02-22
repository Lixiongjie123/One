package com.example.dell_user.one.gson.music.TimeMusicBriefInformationList;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wanjian on 2017/2/20.
 */

//根据年月份获取音乐简略信息列表

public class TimeMusicBriefInformationList {

    @SerializedName("res")
    private int res;

    @SerializedName("data")
    private List<Data_TimeMusicBriefInformationList> data ;



    public void setRes(int res){
        this.res = res;
    }
    public int getRes(){
        return this.res;
    }

    public void setData(List<Data_TimeMusicBriefInformationList> data){
        this.data = data;
    }
    public List<Data_TimeMusicBriefInformationList> getData(){
        return this.data;
    }

}
