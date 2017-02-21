package com.example.dell_user.one.gson.reading.IdSerialInformation;

import com.example.dell_user.one.gson.movie.MovieDetailedInformation.Share_list;
import com.example.dell_user.one.gson.movie.MovieInformationList.Author_list;
import com.example.dell_user.one.gson.reading.HomeLatestArticleList.Author;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wanjian on 2017/2/20.
 */

//IdSerialInformation(根据id获取连载文章详细信息)中Data_IdSerialInformation数组，共31个属性
//备注：content为文章正文，charge_edt为责任编辑，audio为是否有音频，author为作者信息
//有个问题：此处的Tag_list用List<String>储存是否可以

public class Data_IdSerialInformation {

    @SerializedName("id")
    private String id;

    @SerializedName("serial_id")
    private String serial_id;

    @SerializedName("number")
    private String number;

    @SerializedName("title")
    private String title;

    @SerializedName("excerpt")
    private String excerpt;

    @SerializedName("content")
    private String content;

    @SerializedName("charge_edt")
    private String charge_edt;

    @SerializedName("read_num")
    private String read_num;

    @SerializedName("maketime")
    private String maketime;

    @SerializedName("last_update_date")
    private String last_update_date;

    @SerializedName("hide_flag")
    private String hide_flag;

    @SerializedName("audio")
    private String audio;

    @SerializedName("web_url")
    private String web_url;

    @SerializedName("input_name")
    private String input_name;

    @SerializedName("last_update_name")
    private String last_update_name;

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
    private Author author;

    @SerializedName("lastid")
    private String lastid;

    @SerializedName("nextid")
    private int nextid;

    @SerializedName("author_list")
    private List<Author_list> author_list ;

    @SerializedName("tag_list")
    private List<String> tag_list ;

    @SerializedName("share_list")
    private Share_list share_list;

    @SerializedName("praisenum")
    private int praisenum;

    @SerializedName("sharenum")
    private int sharenum;

    @SerializedName("commentnum")
    private int commentnum;



    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }

    public void setSerial_id(String serial_id){
        this.serial_id = serial_id;
    }
    public String getSerial_id(){
        return this.serial_id;
    }

    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        return this.number;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }

    public void setExcerpt(String excerpt){
        this.excerpt = excerpt;
    }
    public String getExcerpt(){
        return this.excerpt;
    }

    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return this.content;
    }

    public void setCharge_edt(String charge_edt){
        this.charge_edt = charge_edt;
    }
    public String getCharge_edt(){
        return this.charge_edt;
    }

    public void setRead_num(String read_num){
        this.read_num = read_num;
    }
    public String getRead_num(){
        return this.read_num;
    }

    public void setMaketime(String maketime){
        this.maketime = maketime;
    }
    public String getMaketime(){
        return this.maketime;
    }

    public void setLast_update_date(String last_update_date){
        this.last_update_date = last_update_date;
    }
    public String getLast_update_date(){
        return this.last_update_date;
    }

    public void setHide_flag(String hide_flag){
        this.hide_flag = hide_flag;
    }
    public String getHide_flag(){
        return this.hide_flag;
    }

    public void setAudio(String audio){
        this.audio = audio;
    }
    public String getAudio(){
        return this.audio;
    }

    public void setWeb_url(String web_url){
        this.web_url = web_url;
    }
    public String getWeb_url(){
        return this.web_url;
    }

    public void setInput_name(String input_name){
        this.input_name = input_name;
    }
    public String getInput_name(){
        return this.input_name;
    }

    public void setLast_update_name(String last_update_name){
        this.last_update_name = last_update_name;
    }
    public String getLast_update_name(){
        return this.last_update_name;
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

    public void setAuthor(Author author){
        this.author = author;
    }
    public Author getAuthor(){
        return this.author;
    }

    public void setLastid(String lastid){
        this.lastid = lastid;
    }
    public String getLastid(){
        return this.lastid;
    }

    public void setNextid(int nextid){
        this.nextid = nextid;
    }
    public int getNextid(){
        return this.nextid;
    }

    public void setAuthor_list(List<Author_list> author_list){
        this.author_list = author_list;
    }
    public List<Author_list> getAuthor_list(){
        return this.author_list;
    }

    public void setTag_list(List<String> tag_list){
        this.tag_list = tag_list;
    }
    public List<String > getTag_list(){
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
