package com.example.dell_user.one.gson.reading.TopPictureInformation;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wanjian on 2017/2/19.
 */

//根据id获取顶部滚动图片点击进去的详细信息TopPictureInformationz中的Data_TopPictureInformation数组,共7个属性
//  其中item_id是文章id，备注：type为String格式，1或2或3
//  type == '1' essay(短篇)类型，type == '2' serial(连载)类型，type == '3' question(问答)类型



public class Data_TopPictureInformation {

    @SerializedName("item_id")
    private String item_id;

    @SerializedName("title")
    private String title;

    @SerializedName("author")
    private String author;

    @SerializedName("introduction")
    private String introduction;

    @SerializedName("web_url")
    private String web_url;

    @SerializedName("number")
    private int number;

    @SerializedName("type")
    private String type;

    public void setItem_id(String item_id){
        this.item_id = item_id;
    }
    public String getItem_id(){
        return this.item_id;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return this.author;
    }

    public void setIntroduction(String introduction){
        this.introduction = introduction;
    }
    public String getIntroduction(){
        return this.introduction;
    }

    public void setWeb_url(String web_url){
        this.web_url = web_url;
    }
    public String getWeb_url(){
        return this.web_url;
    }

    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return this.number;
    }

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }

}
