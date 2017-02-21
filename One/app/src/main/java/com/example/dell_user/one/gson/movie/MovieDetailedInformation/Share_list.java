package com.example.dell_user.one.gson.movie.MovieDetailedInformation;


import com.example.dell_user.one.gson.home.IdGraphicInformation.Qq;
import com.example.dell_user.one.gson.home.IdGraphicInformation.Weibo;
import com.example.dell_user.one.gson.home.IdGraphicInformation.Wx;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wanjian on 2017/2/19.
 */

//根据id获取电影详细信息（MovieDetailedInformation）中Data_detailedinformation中的share_list,其中Wx，Weibo和Qq是从gson包下加载的
public class Share_list {

    @SerializedName("wx")
    private Wx wx;

    @SerializedName("weibo")
    private Weibo weibo;

    @SerializedName("qq")
    private Qq qq;


    public void setWx(Wx wx){
        this.wx = wx;
    }
    public Wx getWx(){
        return this.wx;
    }

    public void setWeibo(Weibo weibo){
        this.weibo = weibo;
    }
    public Weibo getWeibo(){
        return this.weibo;
    }

    public void setQq(Qq qq){
        this.qq = qq;
    }
    public Qq getQq(){
        return this.qq;
    }

}
