package com.example.dell_user.one.gson.home.IdGraphicInformation;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wanjian on 2017/2/18.
 */


//根据id获取图文详细信息
public class IdGraphicInformation {
    public IdGraphicInformation(String main,String hp_title,String hp_img_url,String hp_author,String hp_content,String text_authors,String content_bgcolor,Integer praisenum){
        this.hp_title=hp_title;
        this.hp_img_url=hp_img_url;
        this.hp_author=hp_author;
        this.hp_content=hp_content;
        this.text_authors=text_authors;
        this.content_bgcolor=content_bgcolor;
        this.praisenum=praisenum;
    }

    @SerializedName("hpcontent_id")
    public String hpcontent_id;

    @SerializedName("hp_title")
    public String hp_title;

    @SerializedName("author_id")
    public String author_id;

    @SerializedName("hp_img_url")
    public String hp_img_url;

    @SerializedName("hp_img_original_url")
    public String hp_img_original_url;

    @SerializedName("hp_author")
    public String hp_author;

    @SerializedName("ipad_url")
    public String ipad_url;


    @SerializedName("hp_content")
    public String hp_content;

    @SerializedName("hp_makettime")
    public String hp_makettime;

    @SerializedName("hide_flag")
    public String hide_flag;

    @SerializedName("last_update_date")
    public String last_update_date;

    @SerializedName("web_url")
    public String web_url;

    @SerializedName("wb_img_url")
    public String wb_img_url;

    @SerializedName("image_authors")
    public String image_authors;

    @SerializedName("text_authors")
    public String text_authors;

    @SerializedName("image_from")
    public String image_from;

    @SerializedName("text_from")
    public String text_from;

    @SerializedName("content_bgcolor")
    public String content_bgcolor;

    @SerializedName("template_category")
    public String template_category;

    @SerializedName("maketime")
    public String maketime;

    @SerializedName("share_list")
    public Share_list Share_list;

    @SerializedName("praisenum")
    public Integer	 praisenum;

    @SerializedName("sharenum")
    public Integer	 sharenum;

    @SerializedName("commentnum")
    public Integer	 commentnum;


    public String getHpcontent_id() {
        return hpcontent_id;
    }
    public void setHpcontent_id(String  hpcontent_id) {
        this.hpcontent_id = hpcontent_id;
    }

    public String getHp_title() {
        return hp_title;
    }
    public void setHp_title(String  hp_title) {
        this.hp_title = hp_title;
    }

    public String getAuthor_id() {
        return author_id;
    }
    public void setAuthor_id (String  author_id) {
        this.author_id=author_id;
    }

    public String getHp_img_url() {
        return hp_img_url;
    }
    public void setHp_img_url(String hp_img_url ) {
        this.hp_img_url = hp_img_url;
    }

    public String getHp_img_original_url() {
        return hp_img_original_url;
    }
    public void setHp_img_original_url(String hp_img_original_url ) {
        this.hp_img_original_url=hp_img_original_url ;
    }

    public String getHp_author() {
        return hp_author;
    }
    public void setHp_author(String hp_author ) {
        this.hp_author= hp_author;
    }

    public String getIpad_url() {
        return ipad_url;
    }
    public void setIpad_url(String ipad_url ) {
        this.ipad_url =ipad_url ;
    }

    public String getHp_content() {
        return hp_content;
    }
    public void setHp_content(String hp_content ) {
        this.hp_content =hp_content ;
    }

    public String getHp_makettime() {
        return hp_makettime;
    }
    public void setHp_makettime(String hp_makettime ) {
        this.hp_makettime =hp_makettime ;
    }

    public String getHide_flag() {
        return hide_flag;
    }
    public void setHide_flag(String hide_flag ) {
        this.hide_flag =hide_flag ;
    }


    public String getLast_update_date() {
        return last_update_date;
    }
    public void setLast_update_date(String last_update_date ) {
        this.last_update_date =last_update_date ;
    }

    public String getWeb_url() {
        return web_url;
    }
    public void setWeb_url(String web_url ) {
        this.web_url =web_url ;
    }

    public String getWb_img_url() {
        return wb_img_url;
    }
    public void setWb_img_url(String wb_img_url ) {
        this.wb_img_url =wb_img_url ;
    }

    public String getImage_authors() {
        return image_authors;
    }
    public void setImage_authors(String image_authors ) {
        this.image_authors =image_authors ;
    }

    public String getText_authors() {
        return text_authors;
    }
    public void setText_authors(String text_authors ) {
        this.text_authors =text_authors ;
    }

    public String getImage_from() {
        return image_from;
    }
    public void setImage_from(String image_from ) {
        this.image_from =image_from ;
    }

    public String getText_from() {
        return text_from;
    }
    public void setText_from(String text_from ) {
        this.text_from =text_from ;
    }

    public String getContent_bgcolor() {
        return content_bgcolor;
    }
    public void setContent_bgcolor(String content_bgcolor ) {
        this.content_bgcolor =content_bgcolor ;
    }

    public String getTemplate_category() {
        return template_category;
    }
    public void setTemplate_category(String template_category ) {
        this.template_category =template_category ;
    }

    public String getMaketime() {
        return maketime;
    }
    public void setMaketime(String maketime ) {
        this.maketime = maketime;
    }

    public Share_list getShare_list() {
        return Share_list;
    }
    public void setShare_list(Share_list shareList) {
        this.Share_list = Share_list;
    }

    public Integer	 getPraisenum() {
        return praisenum;
    }
    public void setPraisenum(Integer praisenum) {
        this.praisenum=praisenum ;
    }

    public Integer	 getSharenum() {
        return sharenum;
    }
    public void setSharenum(Integer sharenum ) {
        this.sharenum=sharenum ;
    }

    public Integer	 getCommentnum() {
        return commentnum;
    }
    public void setCommentnum(Integer	 commentnum ) {
        this.commentnum =commentnum ;
    }

}
