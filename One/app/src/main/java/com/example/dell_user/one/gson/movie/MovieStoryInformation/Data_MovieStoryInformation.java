package com.example.dell_user.one.gson.movie.MovieStoryInformation;

import com.example.dell_user.one.gson.movie.MovieInformationList.Author_list;

import java.util.List;

/**
 * Created by wanjian on 2017/2/19.
 */

//MovieStoryInformation中的DataCount方法中的Data_MovieStoryInformation数组的16个属性，
//  其中title为故事标题，content为故事文本，input_date为时间，格式(2016-10-21 09:06:53)，user为用户信息
public class Data_MovieStoryInformation {

    @SuppressWarnings("id")
    private String id;

    @SuppressWarnings("movie_id")
    private String movie_id;

    @SuppressWarnings("title")
    private String title;

    @SuppressWarnings("content")
    private String content;

    @SuppressWarnings("sort")
    private String sort;

    @SuppressWarnings("praisenum")
    private int praisenum;

    @SuppressWarnings("input_date")
    private String input_date;

    @SuppressWarnings("story_type")
    private String story_type;

    @SuppressWarnings("summary")
    private String summary;

    @SuppressWarnings("audio")
    private String audio;

    @SuppressWarnings("anchor")
    private String anchor;

    @SuppressWarnings("copyright")
    private String copyright;

    @SuppressWarnings("user")
    private User user;

    @SuppressWarnings("charge_edt")
    private String charge_edt;

    @SuppressWarnings("editor_email")
    private String editor_email;

    @SuppressWarnings("author_list")
    private List<Author_list> author_list ;



    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }

    public void setMovie_id(String movie_id){
        this.movie_id = movie_id;
    }
    public String getMovie_id(){
        return this.movie_id;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }

    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return this.content;
    }

    public void setSort(String sort){
        this.sort = sort;
    }
    public String getSort(){
        return this.sort;
    }

    public void setPraisenum(int praisenum){
        this.praisenum = praisenum;
    }
    public int getPraisenum(){
        return this.praisenum;
    }

    public void setInput_date(String input_date){
        this.input_date = input_date;
    }
    public String getInput_date(){
        return this.input_date;
    }

    public void setStory_type(String story_type){
        this.story_type = story_type;
    }
    public String getStory_type(){
        return this.story_type;
    }

    public void setSummary(String summary){
        this.summary = summary;
    }
    public String getSummary(){
        return this.summary;
    }

    public void setAudio(String audio){
        this.audio = audio;
    }
    public String getAudio(){
        return this.audio;
    }

    public void setAnchor(String anchor){
        this.anchor = anchor;
    }
    public String getAnchor(){
        return this.anchor;
    }

    public void setCopyright(String copyright){
        this.copyright = copyright;
    }
    public String getCopyright(){
        return this.copyright;
    }

    public void setUser(User user){
        this.user = user;
    }
    public User getUser(){
        return this.user;
    }

    public void setCharge_edt(String charge_edt){
        this.charge_edt = charge_edt;
    }
    public String getCharge_edt(){
        return this.charge_edt;
    }

    public void setEditor_email(String editor_email){
        this.editor_email = editor_email;
    }
    public String getEditor_email(){
        return this.editor_email;
    }

    public void setAuthor_list(List<Author_list> author_list){
        this.author_list = author_list;
    }
    public List<Author_list> getAuthor_list(){
        return this.author_list;
    }

}
