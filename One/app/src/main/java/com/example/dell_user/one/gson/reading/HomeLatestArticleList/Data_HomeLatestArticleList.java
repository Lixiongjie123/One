package com.example.dell_user.one.gson.reading.HomeLatestArticleList;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wanjian on 2017/2/19.
 */

//获取首页最新的文章列表HomeLatestArticleList中的Data_HomeLatestArticleList方法,共有 短篇文章essay、连载文章serial、问答文章question三个

public class Data_HomeLatestArticleList {

    @SerializedName("essay")
    private List<Essay> essay ;

    @SerializedName("serial")
    private List<Serial> serial ;

    @SerializedName("question")
    private List<Question> question ;


    public void setEssay(List<Essay> essay){
        this.essay = essay;
    }
    public List<Essay> getEssay(){
        return this.essay;
    }

    public void setSerial(List<Serial> serial){
        this.serial = serial;
    }
    public List<Serial> getSerial(){
        return this.serial;
    }

    public void setQuestion(List<Question> question){
        this.question = question;
    }
    public List<Question> getQuestion(){
        return this.question;
    }
}
