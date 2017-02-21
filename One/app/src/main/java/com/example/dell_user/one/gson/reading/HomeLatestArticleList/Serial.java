package com.example.dell_user.one.gson.reading.HomeLatestArticleList;

import com.example.dell_user.one.gson.movie.MovieInformationList.Author_list;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wanjian on 2017/2/19.
 */

// HomeLatestArticleList（获取首页最新的文章列表）中的Data_HomeLatestArticleList方法中的Serial数组,
// 共8个属性，Author_list和Asker_list两个数组，其他为String格式,其中Author_list为movie中的Author_list


public class Serial {

    @SerializedName("serial_id")
    private String id;

    @SerializedName("serial_id")
    private String serial_id;

    @SerializedName("number")
    private String number;

    @SerializedName("title")
    private String title;

    @SerializedName("excerpt")
    private String excerpt;

    @SerializedName("read_num")
    private String read_num;

    @SerializedName("maketime")
    private String maketime;

    @SerializedName("start_video")
    private String start_video;

    @SerializedName("author")
    private Author author;

    @SerializedName("has_audio")
    private boolean has_audio;

    @SerializedName("author_list")
    private List<Author_list> author_list ;

    @SerializedName("serial_list")
    private List<String> serial_list ;



    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }

    public void setSerial_id(String serial_id){
        this.serial_id = serial_id;
    }
    public String getSerial_id(){
        return this.serial_id;
    }

    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        return this.number;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }

    public void setExcerpt(String excerpt){
        this.excerpt = excerpt;
    }
    public String getExcerpt(){
        return this.excerpt;
    }

    public void setRead_num(String read_num){
        this.read_num = read_num;
    }
    public String getRead_num(){
        return this.read_num;
    }

    public void setMaketime(String maketime){
        this.maketime = maketime;
    }
    public String getMaketime(){
        return this.maketime;
    }

    public void setStart_video(String start_video){
        this.start_video = start_video;
    }
    public String getStart_video(){
        return this.start_video;
    }

    public void setAuthor(Author author){
        this.author = author;
    }
    public Author getAuthor(){
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

    public void setString(List<String> serial_list){
        this.serial_list = serial_list;
    }
    public List<String> getString(){
        return this.serial_list;
    }

}
