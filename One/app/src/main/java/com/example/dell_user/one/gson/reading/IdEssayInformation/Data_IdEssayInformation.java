package com.example.dell_user.one.gson.reading.IdEssayInformation;

import com.example.dell_user.one.gson.home.IdGraphicInformation.Share_list;
import com.example.dell_user.one.gson.movie.MovieInformationList.Author_list;
import com.example.dell_user.one.gson.reading.HomeLatestArticleList.Author;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wanjian on 2017/2/19.
 */

//根据id获取短篇文章详细信息IdEssayInformation中的Data_IdEssayInformation方法,共32个属性，
// 其中author、author_list、share_list三个数组在其他的包里 还有一个tag_list数组
// 备注：hp_author_introduce为编辑人员信息，hp_content为文章内容，audio为音频文件地址

public class Data_IdEssayInformation {

    @SerializedName("content_id")
    private String content_id;

    @SerializedName("hp_title")
    private String hp_title;

    @SerializedName("sub_title")
    private String sub_title;

    @SerializedName("hp_author")
    private String hp_author;

    @SerializedName("auth_it")
    private String auth_it;

    @SerializedName("hp_author_introduce")
    private String hp_author_introduce;

    @SerializedName("hp_content")
    private String hp_content;

    @SerializedName("hp_makettime")
    private String hp_makettime;

    @SerializedName("hide_flag")
    private String hide_flag;

    @SerializedName("wb_name")
    private String wb_name;

    @SerializedName("wb_img_url")
    private String wb_img_url;

    @SerializedName("last_update_date")
    private String last_update_date;

    @SerializedName("web_url")
    private String web_url;

    @SerializedName("guide_word")
    private String guide_word;

    @SerializedName("audio")
    private String audio;

    @SerializedName("anchor")
    private String anchor;

    @SerializedName("editor_email")
    private String editor_email;

    @SerializedName("top_media_type")
    private String top_media_type;

    @SerializedName("top_media_file")
    private String top_media_file;

    @SerializedName("top_media_image")
    private String top_media_image;

    @SerializedName("start_video")
    private String start_video;

    @SerializedName("copyright")
    private String copyright;

    @SerializedName("author")
    private List<Author> author ;

    @SerializedName("maketime")
    private String maketime;

    @SerializedName("author_list")
    private List<Author_list> author_list ;

    @SerializedName("next_id")
    private int next_id;

    @SerializedName("previous_id")
    private String previous_id;

    @SerializedName("tag_list")
    private List<Tag_list> tag_list ;

    @SerializedName("share_list")
    private Share_list share_list;

    @SerializedName("praisenum")
    private int praisenum;

    @SerializedName("sharenum")
    private int sharenum;

    @SerializedName("commentnum")
    private int commentnum;



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

    public void setSub_title(String sub_title){
        this.sub_title = sub_title;
    }
    public String getSub_title(){
        return this.sub_title;
    }

    public void setHp_author(String hp_author){
        this.hp_author = hp_author;
    }
    public String getHp_author(){
        return this.hp_author;
    }

    public void setAuth_it(String auth_it){
        this.auth_it = auth_it;
    }
    public String getAuth_it(){
        return this.auth_it;
    }

    public void setHp_author_introduce(String hp_author_introduce){
        this.hp_author_introduce = hp_author_introduce;
    }
    public String getHp_author_introduce(){
        return this.hp_author_introduce;
    }

    public void setHp_content(String hp_content){
        this.hp_content = hp_content;
    }
    public String getHp_content(){
        return this.hp_content;
    }

    public void setHp_makettime(String hp_makettime){
        this.hp_makettime = hp_makettime;
    }
    public String getHp_makettime(){
        return this.hp_makettime;
    }

    public void setHide_flag(String hide_flag){
        this.hide_flag = hide_flag;
    }
    public String getHide_flag(){
        return this.hide_flag;
    }

    public void setWb_name(String wb_name){
        this.wb_name = wb_name;
    }
    public String getWb_name(){
        return this.wb_name;
    }

    public void setWb_img_url(String wb_img_url){
        this.wb_img_url = wb_img_url;
    }
    public String getWb_img_url(){
        return this.wb_img_url;
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

    public void setEditor_email(String editor_email){
        this.editor_email = editor_email;
    }
    public String getEditor_email(){
        return this.editor_email;
    }

    public void setTop_media_type(String top_media_type){
        this.top_media_type = top_media_type;
    }
    public String getTop_media_type(){
        return this.top_media_type;
    }

    public void setTop_media_file(String top_media_file){
        this.top_media_file = top_media_file;
    }
    public String getTop_media_file(){
        return this.top_media_file;
    }

    public void setTop_media_image(String top_media_image){
        this.top_media_image = top_media_image;
    }
    public String getTop_media_image(){
        return this.top_media_image;
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

    public void setAuthor(List<Author> author){
        this.author = author;
    }
    public List<Author> getAuthor(){
        return this.author;
    }

    public void setMaketime(String maketime){
        this.maketime = maketime;
    }
    public String getMaketime(){
        return this.maketime;
    }

    public void setAuthor_list(List<Author_list> author_list){
        this.author_list = author_list;
    }
    public List<Author_list> getAuthor_list(){
        return this.author_list;
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

    public void setTag_list(List<Tag_list> tag_list){
        this.tag_list = tag_list;
    }
    public List<Tag_list> getTag_list(){
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
