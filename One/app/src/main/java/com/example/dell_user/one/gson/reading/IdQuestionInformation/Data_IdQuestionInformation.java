package com.example.dell_user.one.gson.reading.IdQuestionInformation;

import com.example.dell_user.one.gson.home.IdGraphicInformation.Share_list;
import com.example.dell_user.one.gson.movie.MovieInformationList.Author_list;
import com.example.dell_user.one.gson.reading.HomeLatestArticleList.Asker_list;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wanjian on 2017/2/20.
 */

//IdQuestionInformation(根据id获取问答文章详细信息)中的Data_IdQuestionInformation方法，共32个属性，其中包含Answerer和Asker两个方法 ，charge_edt为责任编辑
// 此处的tag_list由Tag_list改成了String格式，是否可以？

public class Data_IdQuestionInformation {

    @SerializedName("question_id")
    private String question_id;

    @SerializedName("question_title")
    private String question_title;

    @SerializedName("question_content")
    private String question_content;

    @SerializedName("answer_title")
    private String answer_title;

    @SerializedName("answer_content")
    private String answer_content;

    @SerializedName("question_makettime")
    private String question_makettime;

    @SerializedName("recommend_flag")
    private String recommend_flag;

    @SerializedName("charge_edt")
    private String charge_edt;

    @SerializedName("charge_email")
    private String charge_email;

    @SerializedName("last_update_date")
    private String last_update_date;

    @SerializedName("web_url")
    private String web_url;

    @SerializedName("read_num")
    private String read_num;

    @SerializedName("guide_word")
    private String guide_word;

    @SerializedName("audio")
    private String audio;

    @SerializedName("anchor")
    private String anchor;

    @SerializedName("cover")
    private String cover;

    @SerializedName("content_bgcolor")
    private String content_bgcolor;

    @SerializedName("cover_media_type")
    private String cover_media_type;

    @SerializedName("cover_media_file")
    private String cover_media_file;

    @SerializedName("start_video")
    private String start_video;

    @SerializedName("copyright")
    private String copyright;

    @SerializedName("answerer")
    private Answerer answerer;

    @SerializedName("asker")
    private Asker asker;

    @SerializedName("author_list")
    private List<Author_list> author_list ;

    @SerializedName("asker_list")
    private List<Asker_list> asker_list ;

    @SerializedName("next_id")
    private int next_id;

    @SerializedName("previous_id")
    private String previous_id;

    @SerializedName("tag_list")
    private List<String> tag_list ;

    @SerializedName("share_list")
    private Share_list share_list;

    @SerializedName("praisenum")
    private int praisenum;

    @SerializedName("sharenum")
    private int sharenum;

    @SerializedName("commentnum")
    private int commentnum;



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

    public void setQuestion_content(String question_content){
        this.question_content = question_content;
    }
    public String getQuestion_content(){
        return this.question_content;
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

    public void setRecommend_flag(String recommend_flag){
        this.recommend_flag = recommend_flag;
    }
    public String getRecommend_flag(){
        return this.recommend_flag;
    }

    public void setCharge_edt(String charge_edt){
        this.charge_edt = charge_edt;
    }
    public String getCharge_edt(){
        return this.charge_edt;
    }

    public void setCharge_email(String charge_email){
        this.charge_email = charge_email;
    }
    public String getCharge_email(){
        return this.charge_email;
    }

    public void setLast_update_date(String last_update_date){
        this.last_update_date = last_update_date;
    }
    public String getLast_update_date(){
        return this.last_update_date;
    }

    public void setWeb_url(String web_url){
        this.web_url = web_url;
    }
    public String getWeb_url(){
        return this.web_url;
    }

    public void setRead_num(String read_num){
        this.read_num = read_num;
    }
    public String getRead_num(){
        return this.read_num;
    }

    public void setGuide_word(String guide_word){
        this.guide_word = guide_word;
    }
    public String getGuide_word(){
        return this.guide_word;
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

    public void setCover(String cover){
        this.cover = cover;
    }
    public String getCover(){
        return this.cover;
    }

    public void setContent_bgcolor(String content_bgcolor){
        this.content_bgcolor = content_bgcolor;
    }
    public String getContent_bgcolor(){
        return this.content_bgcolor;
    }

    public void setCover_media_type(String cover_media_type){
        this.cover_media_type = cover_media_type;
    }
    public String getCover_media_type(){
        return this.cover_media_type;
    }

    public void setCover_media_file(String cover_media_file){
        this.cover_media_file = cover_media_file;
    }
    public String getCover_media_file(){
        return this.cover_media_file;
    }

    public void setStart_video(String start_video){
        this.start_video = start_video;
    }
    public String getStart_video(){
        return this.start_video;
    }

    public void setCopyright(String copyright){
        this.copyright = copyright;
    }
    public String getCopyright(){
        return this.copyright;
    }

    public void setAnswerer(Answerer answerer){
        this.answerer = answerer;
    }
    public Answerer getAnswerer(){
        return this.answerer;
    }

    public void setAsker(Asker asker){
        this.asker = asker;
    }
    public Asker getAsker(){
        return this.asker;
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

    public void setNext_id(int next_id){
        this.next_id = next_id;
    }
    public int getNext_id(){
        return this.next_id;
    }

    public void setPrevious_id(String previous_id){
        this.previous_id = previous_id;
    }
    public String getPrevious_id(){
        return this.previous_id;
    }

    public void setTag_list(List<String > tag_list){
        this.tag_list = tag_list;
    }
    public List<String> getTag_list(){
        return this.tag_list;
    }

    public void setShare_list(Share_list share_list){
        this.share_list = share_list;
    }
    public Share_list getShare_list(){
        return this.share_list;
    }

    public void setPraisenum(int praisenum){
        this.praisenum = praisenum;
    }
    public int getPraisenum(){
        return this.praisenum;
    }

    public void setSharenum(int sharenum){
        this.sharenum = sharenum;
    }
    public int getSharenum(){
        return this.sharenum;
    }

    public void setCommentnum(int commentnum){
        this.commentnum = commentnum;
    }
    public int getCommentnum(){
        return this.commentnum;
    }

}
