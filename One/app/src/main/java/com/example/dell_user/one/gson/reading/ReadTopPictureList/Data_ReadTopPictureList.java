package com.example.dell_user.one.gson.reading.ReadTopPictureList;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wanjian on 2017/2/19.
 */

//获取阅读顶部的滚动图片列表ReadTopPictureList中的Data_ReadTopPictureList数组，共6个属性
public class Data_ReadTopPictureList {

    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("cover")
    private String cover;

    @SerializedName("bottom_text")
    private String bottom_text;

    @SerializedName("bgcolor")
    private String bgcolor;

    @SerializedName("pv_url")
    private String pv_url;


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

    public void setCover(String cover){
        this.cover = cover;
    }
    public String getCover(){
        return this.cover;
    }

    public void setBottom_text(String bottom_text){
        this.bottom_text = bottom_text;
    }
    public String getBottom_text(){
        return this.bottom_text;
    }

    public void setBgcolor(String bgcolor){
        this.bgcolor = bgcolor;
    }
    public String getBgcolor(){
        return this.bgcolor;
    }

    public void setPv_url(String pv_url){
        this.pv_url = pv_url;
    }
    public String getPv_url(){
        return this.pv_url;
    }

}
