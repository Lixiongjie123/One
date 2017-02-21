package com.example.dell_user.one.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by DELL-USER on 2017/2/15.
 */

public class Reading_gson {
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("id")
    public String id;
    @SerializedName("bootom_text")
    public String bootom_text;
}
