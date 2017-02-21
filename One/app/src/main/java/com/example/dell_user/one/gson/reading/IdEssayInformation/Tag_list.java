package com.example.dell_user.one.gson.reading.IdEssayInformation;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wanjian on 2017/2/19.
 */

//IdEssayInformation（根据id获取短篇文章详细信息）中的Data_IdEssayInformation方法中的Tag_list数组

public class Tag_list {

    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String title;


    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }

}
