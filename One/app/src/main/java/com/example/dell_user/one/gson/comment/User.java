package com.example.dell_user.one.gson.comment;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wanjian on 2017/2/20.
 */

//TypeComment中的DataComment方法中的Data_TypeComment数组中的user方法

public class User {

    @SerializedName("user_id")
    private String user_id;

    @SerializedName("user_name")
    private String user_name;

    @SerializedName("web_url")
    private String web_url;



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

}
