package com.example.dell_user.one.Fragment.samll_fragment;

/**
 * Created by DELL-USER on 2017/2/20.
 */

public class Samlldata {
    private String main;
    private String hp_title;
    private String hp_img_url;
    private String hp_author;
    private String hp_content;
    private String text_authors;
    private String content_bgcolor;
    private Integer praisenum;
    public Samlldata(String main,String hp_title,String hp_img_url,String hp_author,String hp_content,String text_authors,String content_bgcolor,Integer praisenum){
        this.main=main;
        this.hp_title=hp_title;
        this.hp_img_url=hp_img_url;
        this.hp_author=hp_author;
        this.hp_content=hp_content;
        this.text_authors=text_authors;
        this.content_bgcolor=content_bgcolor;
        this.praisenum=praisenum;
    }

    public Samlldata() {

    }


    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getHp_title() {
        return hp_title;
    }

    public void setHp_title(String hp_title) {
        this.hp_title = hp_title;
    }

    public String getHp_img_url() {
        return hp_img_url;
    }

    public void setHp_img_url(String hp_img_url) {
        this.hp_img_url = hp_img_url;
    }

    public String getHp_author() {
        return hp_author;
    }

    public void setHp_author(String hp_author) {
        this.hp_author = hp_author;
    }

    public String getHp_content() {
        return hp_content;
    }

    public void setHp_content(String hp_content) {
        this.hp_content = hp_content;
    }

    public String getText_authors() {
        return text_authors;
    }

    public void setText_authors(String text_authors) {
        this.text_authors = text_authors;
    }

    public String getContent_bgcolor() {
        return content_bgcolor;
    }

    public void setContent_bgcolor(String content_bgcolor) {
        this.content_bgcolor = content_bgcolor;
    }

    public Integer getPraisenum() {
        return praisenum;
    }

    public void setPraisenum(Integer praisenum) {
        this.praisenum = praisenum;
    }
}
