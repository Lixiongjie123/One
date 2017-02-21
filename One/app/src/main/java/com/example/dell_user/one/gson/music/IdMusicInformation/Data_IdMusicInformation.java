package com.example.dell_user.one.gson.music.IdMusicInformation;

import com.example.dell_user.one.gson.home.IdGraphicInformation.Share_list;
import com.example.dell_user.one.gson.movie.MovieInformationList.Author_list;
import com.example.dell_user.one.gson.reading.HomeLatestArticleList.Author;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wanjian on 2017/2/20.
 */

//IdMusicInformation(根据id获取音乐详细信息)中的Data_IdMusicInformation方法,
// 共37个属性，Author、Story_author和share_list三个方法，Author_list、tag_两个数组
// 问题：此处有一个Tag_list，是否需要新建类（我把它写成了list<String>）

public class Data_IdMusicInformation {

    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("cover")
    private String cover;

    @SerializedName("isfirst")
    private String isfirst;

    @SerializedName("story_title")
    private String story_title;

    @SerializedName("story")
    private String story;

    @SerializedName("lyric")
    private String lyric;

    @SerializedName("info")
    private String info;

    @SerializedName("platform")
    private String platform;

    @SerializedName("music_id")
    private String music_id;

    @SerializedName("charge_edt")
    private String charge_edt;

    @SerializedName("related_to")
    private String related_to;

    @SerializedName("web_url")
    private String web_url;

    @SerializedName("praisenum")
    private int praisenum;

    @SerializedName("hide_flag")
    private String hide_flag;

    @SerializedName("sort")
    private String sort;

    @SerializedName("maketime")
    private String maketime;

    @SerializedName("last_update_date")
    private String last_update_date;

    @SerializedName("read_num")
    private String read_num;

    @SerializedName("story_summary")
    private String story_summary;

    @SerializedName("audio")
    private String audio;

    @SerializedName("anchor")
    private String anchor;

    @SerializedName("editor_email")
    private String editor_email;

    @SerializedName("related_musics")
    private String related_musics;

    @SerializedName("album")
    private String album;

    @SerializedName("start_video")
    private String start_video;

    @SerializedName("media_type")
    private String media_type;

    @SerializedName("copyright")
    private String copyright;

    @SerializedName("author")
    private Author author;

    @SerializedName("story_author")
    private Story_author story_author;

    @SerializedName("author_list")
    private List<Author_list> author_list ;

    @SerializedName("next_id")
    private String next_id;

    @SerializedName("previous_id")
    private String previous_id;

    @SerializedName("tag_list")
    private List<String > tag_list ;

    @SerializedName("share_list")
    private Share_list share_list;

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

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }

    public void setCover(String cover){
        this.cover = cover;
    }
    public String getCover(){
        return this.cover;
    }

    public void setIsfirst(String isfirst){
        this.isfirst = isfirst;
    }
    public String getIsfirst(){
        return this.isfirst;
    }

    public void setStory_title(String story_title){
        this.story_title = story_title;
    }
    public String getStory_title(){
        return this.story_title;
    }

    public void setStory(String story){
        this.story = story;
    }
    public String getStory(){
        return this.story;
    }

    public void setLyric(String lyric){
        this.lyric = lyric;
    }
    public String getLyric(){
        return this.lyric;
    }

    public void setInfo(String info){
        this.info = info;
    }
    public String getInfo(){
        return this.info;
    }

    public void setPlatform(String platform){
        this.platform = platform;
    }
    public String getPlatform(){
        return this.platform;
    }

    public void setMusic_id(String music_id){
        this.music_id = music_id;
    }
    public String getMusic_id(){
        return this.music_id;
    }

    public void setCharge_edt(String charge_edt){
        this.charge_edt = charge_edt;
    }
    public String getCharge_edt(){
        return this.charge_edt;
    }

    public void setRelated_to(String related_to){
        this.related_to = related_to;
    }
    public String getRelated_to(){
        return this.related_to;
    }

    public void setWeb_url(String web_url){
        this.web_url = web_url;
    }
    public String getWeb_url(){
        return this.web_url;
    }

    public void setPraisenum(int praisenum){
        this.praisenum = praisenum;
    }
    public int getPraisenum(){
        return this.praisenum;
    }

    public void setHide_flag(String hide_flag){
        this.hide_flag = hide_flag;
    }
    public String getHide_flag(){
        return this.hide_flag;
    }

    public void setSort(String sort){
        this.sort = sort;
    }
    public String getSort(){
        return this.sort;
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

    public void setRead_num(String read_num){
        this.read_num = read_num;
    }
    public String getRead_num(){
        return this.read_num;
    }

    public void setStory_summary(String story_summary){
        this.story_summary = story_summary;
    }
    public String getStory_summary(){
        return this.story_summary;
    }

    public void setAudio(String audio){
        this.audio = audio;
    }
    public String getAudio(){
        return this.audio;
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

    public void setRelated_musics(String related_musics){
        this.related_musics = related_musics;
    }
    public String getRelated_musics(){
        return this.related_musics;
    }

    public void setAlbum(String album){
        this.album = album;
    }
    public String getAlbum(){
        return this.album;
    }

    public void setStart_video(String start_video){
        this.start_video = start_video;
    }
    public String getStart_video(){
        return this.start_video;
    }

    public void setMedia_type(String media_type){
        this.media_type = media_type;
    }
    public String getMedia_type(){
        return this.media_type;
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

    public void setStory_author(Story_author story_author){
        this.story_author = story_author;
    }
    public Story_author getStory_author(){
        return this.story_author;
    }

    public void setAuthor_list(List<Author_list> author_list){
        this.author_list = author_list;
    }
    public List<Author_list> getAuthor_list(){
        return this.author_list;
    }

    public void setNext_id(String next_id){
        this.next_id = next_id;
    }
    public String getNext_id(){
        return this.next_id;
    }

    public void setPrevious_id(String previous_id){
        this.previous_id = previous_id;
    }
    public String getPrevious_id(){
        return this.previous_id;
    }

    public void setTag_list(List<String> tag_list){
        this.tag_list = tag_list;
    }
    public List<String> getTag_list(){
        return this.tag_list;
    }

    public void setShare_list(Share_list share_list){
        this.share_list = share_list;
    }
    public Share_list getShare_list(){
        return this.share_list;
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
