package com.example.dell_user.one.gson.reading.HomeLatestArticleList;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wanjian on 2017/2/19.
 */

//HomeLatestArticleList（获取首页最新的文章列表）中的Data_HomeLatestArticleList方法中的Question数组中的Asker_list数组

public class Asker_list {

    @SerializedName("user_id")
    private String user_id;

    @SerializedName("user_name")
    private String user_name;

    @SerializedName("web_url")
    private String web_url;

    @SerializedName("summary")
    private String summary;

    @SerializedName("desc")
    private String desc;

    @SerializedName("is_settled")
    private String is_settled;

    @SerializedName("settled_type")
    private String settled_type;

    @SerializedName("fans_total")
    private String fans_total;

    @SerializedName("wb_name")
    private String wb_name;


    public void setUser_id(String user_id){
        this.user_id = user_id;
    }
    public String getUser_id(){
        return this.user_id;
    }

    public void setUser_name(String user_name){
        this.user_name = user_name;
    }
    public String getUser_name(){
        return this.user_name;
    }

    public void setWeb_url(String web_url){
        this.web_url = web_url;
    }
    public String getWeb_url(){
        return this.web_url;
    }

    public void setSummary(String summary){
        this.summary = summary;
    }
    public String getSummary(){
        return this.summary;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }
    public String getDesc(){
        return this.desc;
    }

    public void setIs_settled(String is_settled){
        this.is_settled = is_settled;
    }
    public String getIs_settled(){
        return this.is_settled;
    }

    public void setSettled_type(String settled_type){
        this.settled_type = settled_type;
    }
    public String getSettled_type(){
        return this.settled_type;
    }

    public void setFans_total(String fans_total){
        this.fans_total = fans_total;
    }
    public String getFans_total(){
        return this.fans_total;
    }

    public void setWb_name(String wb_name){
        this.wb_name = wb_name;
    }
    public String getWb_name(){
        return this.wb_name;
    }

}
