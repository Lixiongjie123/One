package com.example.dell_user.one.db;

import org.litepal.crud.DataSupport;

/**
 * Created by DELL-USER on 2017/2/15.
 */

public class Reading extends DataSupport {
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


}
