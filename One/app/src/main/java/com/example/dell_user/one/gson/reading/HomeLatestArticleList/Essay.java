package com.example.dell_user.one.gson.reading.HomeLatestArticleList;

import com.example.dell_user.one.gson.movie.MovieInformationList.Author_list;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wanjian on 2017/2/19.
 */

// HomeLatestArticleList（获取首页最新的文章列表）中的Data_HomeLatestArticleList方法中的Essay数组,

public class Essay {

    @SerializedName("content_id")
    private String content_id;

    @SerializedName("hp_title")
    private String hp_title;

    @SerializedName("hp_makettime")
    private String hp_makettime;

    @SerializedName("guide_word")
    private String guide_word;

    @SerializedName("start_video")
    private String start_video;

    @SerializedName("author")
    private List<Author> author ;

    @SerializedName("has_audio")
    private boolean has_audio;

    @SerializedName("author_list")
    private List<Author_list> author_list ;


    public void setContent_id(String content_id){
        this.content_id = content_id;
    }
    public String getContent_id(){
        return this.content_id;
    }

    public void setHp_title(String hp_title){
        this.hp_title = hp_title;
    }
    public String getHp_title(){
        return this.hp_title;
    }

    public void setHp_makettime(String hp_makettime){
        this.hp_makettime = hp_makettime;
    }
    public String getHp_makettime(){
        return this.hp_makettime;
    }

    public void setGuide_word(String guide_word){
        this.guide_word = guide_word;
    }
    public String getGuide_word(){
        return this.guide_word;
    }

    public void setStart_video(String start_video){
        this.start_video = start_video;
    }
    public String getStart_video(){
        return this.start_video;
    }

    public void setAuthor(List<Author> author){
        this.author = author;
    }
    public List<Author> getAuthor(){
        return this.author;
    }

    public void setHas_audio(boolean has_audio){
        this.has_audio = has_audio;
    }
    public boolean getHas_audio(){
        return this.has_audio;
    }

    public void setAuthor_list(List<Author_list> author_list){
        this.author_list = author_list;
    }
    public List<Author_list> getAuthor_list(){
        return this.author_list;
    }

}
