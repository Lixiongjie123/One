package com.example.dell_user.one.gson.music.HomeLatestMusicIdList;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wanjian on 2017/2/20.
 */

//获取首页最新的音乐id列表
//问题：此处data需不需要新建data类，有何作用

public class HomeLatestMusicIdList {

    @SerializedName("res")
    private int res;

    @SerializedName("data")
    private List<String> data ;


    public void setRes(int res){
        this.res = res;
    }
    public int getRes(){
        return this.res;
    }

    public void setString(List<String> data){
        this.data = data;
    }
    public List<String> getString(){
        return this.data;
    }

}
