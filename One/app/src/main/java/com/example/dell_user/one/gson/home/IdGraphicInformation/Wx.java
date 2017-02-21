package com.example.dell_user.one.gson.home.IdGraphicInformation;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wanjian on 2017/2/18.
 */

//图文详细信息中的sharelist中的wx
public class Wx {

    @SerializedName("title")
    public String  title;

    @SerializedName("desc")
    public String  desc;

    @SerializedName("link")
    public String  link;

    @SerializedName("imgUrl")
    public String  imgUrl;


    public String getTitle() {
        return title;
    }
    public void setTitle(String  title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String  desc) {
        this.desc = desc;
    }

    public String getLink(){
        return link;
    }
    public void setLink(String link){
        this.link=link;
    }

    public String getImgUrl(){
        return imgUrl;
    }
    public void setImgUrl(String imgUrl){
        this.imgUrl=imgUrl;
    }

}
