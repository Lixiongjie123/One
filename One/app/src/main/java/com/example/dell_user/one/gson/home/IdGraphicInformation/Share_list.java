package com.example.dell_user.one.gson.home.IdGraphicInformation;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wanjian on 2017/2/18.
 */

//图文详细信息中的sharelist
public class Share_list {

    @SerializedName("wx")
    public Wx wx;

    @SerializedName("weibo")
    public Weibo weibo;

    @SerializedName("qq")
    public Qq qq;




    public Weibo getWeibo() {
        return weibo;
    }
    public void setWeibo(Weibo weibo) {
        this.weibo = weibo;
    }

    public Qq getQq() {
        return qq;
    }
    public void setQq(Qq qq) {
        this.qq = qq;
    }

}
