package com.example.dell_user.one.db;

import android.widget.ImageView;

import com.example.dell_user.one.other.StudentPar;

/**
 * Created by DELL-USER on 2017/2/15.
 */

public class Data3 {
    public Data3(String content_id, String hp_title, String hp_makettime,String bottom_text, String cover, String makettime, String bgcolor, String hpTitle, String hpMakettime, String url){
        this.content_id=content_id;
        this.url=url;
        this.hp_title=hp_title;
        this.hp_makettime=hp_makettime;
        this.bottom_text=bottom_text;
        this.cover=cover;
        this.makettime=makettime;
        this.bgcolor=bgcolor;
    }
    private String bgcolor;
    private String makettime;
    private String cover;
    private String bottom_text;
    private String url;
    private ImageView imageView;
    private String content_id;
    private String hp_title;
    private String hp_makettime;
    private String guide_word;
    private boolean has_audio;
    private String[] author;

    public String getContent_id() {
        return content_id;
    }

    public void setContent_id(String content_id) {
        this.content_id = content_id;
    }

    public String getHp_title() {
        return hp_title;
    }

    public void setHp_title(String hp_title) {
        this.hp_title = hp_title;
    }

    public String getHp_makettime() {
        return hp_makettime;
    }

    public void setHp_makettime(String hp_makettime) {
        this.hp_makettime = hp_makettime;
    }

    public String getGuide_word() {
        return guide_word;
    }

    public void setGuide_word(String guide_word) {
        this.guide_word = guide_word;
    }

    public boolean isHas_audio() {
        return has_audio;
    }

    public void setHas_audio(boolean has_audio) {
        this.has_audio = has_audio;
    }

    public String[] getAuthor() {
        return author;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBottom_text() {
        return bottom_text;
    }

    public void setBottom_text(String bottom_text) {
        this.bottom_text = bottom_text;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}
