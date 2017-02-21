package com.example.dell_user.one.gson.comment;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wanjian on 2017/2/20.
 */

//根据类型分页获取评论

public class TypeComment {

    @SerializedName("res")
    private int res;

    @SerializedName("data")
    private DataComment data;


    public void setRes(int res){
        this.res = res;
    }
    public int getRes(){
        return this.res;
    }

    public void setData(DataComment data){
        this.data = data;
    }
    public DataComment getData(){
        return this.data;
    }

}
