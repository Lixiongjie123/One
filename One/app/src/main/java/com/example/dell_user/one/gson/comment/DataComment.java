package com.example.dell_user.one.gson.comment;

import com.example.dell_user.one.gson.comment.Data_TypeComment;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wanjian on 2017/2/20.
 */

//TypeComment中的DataComment方法

public class DataComment {

    @SerializedName("")
    private int count;

    @SerializedName("")
    private List<Data_TypeComment> data ;


    public void setCount(int count){
        this.count = count;
    }
    public int getCount(){
        return this.count;
    }

    public void setData(List<Data_TypeComment> data){
        this.data = data;
    }
    public List<Data_TypeComment> getData(){
        return this.data;
    }

}
