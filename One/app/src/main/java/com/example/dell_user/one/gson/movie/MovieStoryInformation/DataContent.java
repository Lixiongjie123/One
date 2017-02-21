package com.example.dell_user.one.gson.movie.MovieStoryInformation;

import com.google.gson.annotations.SerializedName;


import java.util.List;

/**
 * Created by wanjian on 2017/2/19.
 */

//MovieStoryInformation中的DataCount方法
public class DataContent {

    @SerializedName("count")
    private int count;

    @SerializedName("data")
    private List<Data_MovieStoryInformation>data;


    public void setCount(int count){
        this.count = count;
    }
    public int getCount(){
        return this.count;
    }

    public List<Data_MovieStoryInformation> getData() {
        return data;
    }
    public void setData(List<Data_MovieStoryInformation> data) {
        this.data = data;
    }
}
