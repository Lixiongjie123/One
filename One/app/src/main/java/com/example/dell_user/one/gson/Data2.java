package com.example.dell_user.one.gson;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by DELL-USER on 2017/2/16.
 */

public class Data2 implements Serializable{
    @SerializedName("content_id")
    public String content_id;
    @SerializedName("hp_title")
    public String hp_title;
    @SerializedName("hp_makettime")
    public String hp_makettime;
    @SerializedName("guide_word")
    public String guide_word;
    @SerializedName("has_audio")
    public boolean has_audio;
}
