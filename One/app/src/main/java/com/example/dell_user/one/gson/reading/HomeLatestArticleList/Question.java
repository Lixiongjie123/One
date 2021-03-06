package com.example.dell_user.one.gson.reading.HomeLatestArticleList;

import com.example.dell_user.one.gson.movie.MovieInformationList.Author_list;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wanjian on 2017/2/19.
 */

// HomeLatestArticleList（获取首页最新的文章列表）中的Data_HomeLatestArticleList方法中的Question数组,
// 共8个属性，Author_list和Asker_list两个数组，其他为String格式

public class Question {

    @SerializedName("question_id")
    private String question_id;

    @SerializedName("question_title")
    private String question_title;

    @SerializedName("answer_title")
    private String answer_title;

    @SerializedName("answer_content")
    private String answer_content;

    @SerializedName("question_makettime")
    private String question_makettime;

    @SerializedName("start_video")
    private String start_video;

    @SerializedName("author_list")
    private List<Author_list> author_list ;

    @SerializedName("asker_list")
    private List<Asker_list> asker_list ;



    public void setQuestion_id(String question_id){
        this.question_id = question_id;
    }
    public String getQuestion_id(){
        return this.question_id;
    }

    public void setQuestion_title(String question_title){
        this.question_title = question_title;
    }
    public String getQuestion_title(){
        return this.question_title;
    }

    public void setAnswer_title(String answer_title){
        this.answer_title = answer_title;
    }
    public String getAnswer_title(){
        return this.answer_title;
    }

    public void setAnswer_content(String answer_content){
        this.answer_content = answer_content;
    }
    public String getAnswer_content(){
        return this.answer_content;
    }

    public void setQuestion_makettime(String question_makettime){
        this.question_makettime = question_makettime;
    }
    public String getQuestion_makettime(){
        return this.question_makettime;
    }

    public void setStart_video(String start_video){
        this.start_video = start_video;
    }
    public String getStart_video(){
        return this.start_video;
    }

    public void setAuthor_list(List<Author_list> author_list){
        this.author_list = author_list;
    }
    public List<Author_list> getAuthor_list(){
        return this.author_list;
    }

    public void setAsker_list(List<Asker_list> asker_list){
        this.asker_list = asker_list;
    }
    public List<Asker_list> getAsker_list(){
        return this.asker_list;
    }

}
