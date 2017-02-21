package com.example.dell_user.one.gson.movie.MovieInformationList;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wanjian on 2017/2/19.
 */

//分页获取电影简略信息列表中的Data数组中的一些属性，共12个，api中实例中只有10个，分别为id，title
//  verse,verse_en,score,revisedscore,releasetime,scoretime,cover,servertime,其中title为标题，
//  releasetime、scoretime格式示例为2016-10-21 00:00:00，cover为封面图片

public class Data_MovieInformationList {

    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("verse")
    private String verse;

    @SerializedName("verse_en")
    private String verse_en;

    @SerializedName("score")
    private String score;

    @SerializedName("revisedscore")
    private String revisedscore;

    @SerializedName("releasetime")
    private String releasetime;

    @SerializedName("scoretime")
    private String scoretime;

    @SerializedName("start_video")
    private String start_video;

    @SerializedName("cover")
    private String cover;

    @SerializedName("author_list")
    private List<Author_list> author_list ;

    @SerializedName("servertime")
    private Integer servertime;

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

    public void setVerse(String verse){
        this.verse = verse;
    }
    public String getVerse(){
        return this.verse;
    }

    public void setVerse_en(String verse_en){
        this.verse_en = verse_en;
    }
    public String getVerse_en(){
        return this.verse_en;
    }

    public void setScore(String score){
        this.score = score;
    }
    public String getScore(){
        return this.score;
    }

    public void setRevisedscore(String revisedscore){
        this.revisedscore = revisedscore;
    }
    public String getRevisedscore(){
        return this.revisedscore;
    }

    public void setReleasetime(String releasetime){
        this.releasetime = releasetime;
    }
    public String getReleasetime(){
        return this.releasetime;
    }

    public void setScoretime(String scoretime){
        this.scoretime = scoretime;
    }
    public String getScoretime(){
        return this.scoretime;
    }

    public void setStart_video(String start_video){
        this.start_video = start_video;
    }
    public String getStart_video(){
        return this.start_video;
    }

    public void setCover(String cover){
        this.cover = cover;
    }
    public String getCover(){
        return this.cover;
    }

    public void setAuthor_list(List<Author_list> author_list){
        this.author_list = author_list;
    }
    public List<Author_list> getAuthor_list(){
        return this.author_list;
    }

    public void setServertime(Integer servertime){
        this.servertime = servertime;
    }
    public int getServertime(){
        return this.servertime;
    }

}
