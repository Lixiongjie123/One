package com.example.dell_user.one.gson.home.HomeLatestIdLIst;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wanjian on 2017/2/18.
 */

 //获取首页最新的图文id列表
public class HomeLatestIdLIst implements Serializable{

    @SerializedName("data")
    public List<String>data;


//    public Integer getRes() {
//        return res;
//    }
//    public void setRes(Integer res) {
//        this.res = res;
//    }
//
//    public List<String> getData() { return data;
//    }
//    public void setData(List<String> data) {
//        this.data = data;
//    }

}
