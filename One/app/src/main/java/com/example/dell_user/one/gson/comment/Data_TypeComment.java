package com.example.dell_user.one.gson.comment;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wanjian on 2017/2/20.
 */

//TypeComment中的DataComment方法中的Data_TypeComment数组

public class Data_TypeComment {

    @SerializedName("id")
    private String id;

    @SerializedName("quote")
    private String quote;

    @SerializedName("content")
    private String content;

    @SerializedName("praisenum")
    private int praisenum;

    @SerializedName("device_token")
    private String device_token;

    @SerializedName("del_flag")
    private String del_flag;

    @SerializedName("reviewed")
    private String reviewed;

    @SerializedName("user_info_id")
    private String user_info_id;

    @SerializedName("input_date")
    private String input_date;

    @SerializedName("created_at")
    private String created_at;

    @SerializedName("updated_at")
    private String updated_at;

    @SerializedName("user")
    private com.example.dell_user.one.gson.comment.User user;

    @SerializedName("touser")
    private String touser;

    @SerializedName("score")
    private String score;

    @SerializedName("type")
    private int type;



    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }

    public void setQuote(String quote){
        this.quote = quote;
    }
    public String getQuote(){
        return this.quote;
    }

    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return this.content;
    }

    public void setPraisenum(int praisenum){
        this.praisenum = praisenum;
    }
    public int getPraisenum(){
        return this.praisenum;
    }

    public void setDevice_token(String device_token){
        this.device_token = device_token;
    }
    public String getDevice_token(){
        return this.device_token;
    }

    public void setDel_flag(String del_flag){
        this.del_flag = del_flag;
    }
    public String getDel_flag(){
        return this.del_flag;
    }

    public void setReviewed(String reviewed){
        this.reviewed = reviewed;
    }
    public String getReviewed(){
        return this.reviewed;
    }

    public void setUser_info_id(String user_info_id){
        this.user_info_id = user_info_id;
    }
    public String getUser_info_id(){
        return this.user_info_id;
    }

    public void setInput_date(String input_date){
        this.input_date = input_date;
    }
    public String getInput_date(){
        return this.input_date;
    }

    public void setCreated_at(String created_at){
        this.created_at = created_at;
    }
    public String getCreated_at(){
        return this.created_at;
    }

    public void setUpdated_at(String updated_at){
        this.updated_at = updated_at;
    }
    public String getUpdated_at(){
        return this.updated_at;
    }

    public void setUser(User user){
        this.user = user;
    }
    public User getUser(){
        return this.user;
    }

    public void setTouser(String touser){
        this.touser = touser;
    }
    public String getTouser(){
        return this.touser;
    }

    public void setScore(String score){
        this.score = score;
    }
    public String getScore(){
        return this.score;
    }

    public void setType(int type){
        this.type = type;
    }
    public int getType(){
        return this.type;
    }

}
