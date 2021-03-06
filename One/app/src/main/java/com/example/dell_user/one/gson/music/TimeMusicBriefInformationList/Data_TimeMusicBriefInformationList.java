package com.example.dell_user.one.gson.music.TimeMusicBriefInformationList;

import com.example.dell_user.one.gson.home.IdGraphicInformation.Share_list;
import com.example.dell_user.one.gson.movie.MovieInformationList.Author_list;
import com.example.dell_user.one.gson.reading.HomeLatestArticleList.Author;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wanjian on 2017/2/20.
 */

//TimeMusicBriefInformationList(根据年月份获取音乐简略信息列表)中的Data_TimeMusicBriefInformationList方法,
//platform


public class Data_TimeMusicBriefInformationList {

//    @SerializedName("id")
//    private String id;
//
//    @SerializedName("title")
//    private String title;
//
//    @SerializedName("indexcover")
//    private String indexcover;
//
//    @SerializedName("detailcover")
//    private String detailcover;
//
//    @SerializedName("video")
//    private String video;
//
//    @SerializedName("verse")
//    private String verse;
//
//    @SerializedName("verse_en")
//    private String verse_en;
//
//    @SerializedName("score")
//    private String score;
//
//    @SerializedName("revisedscore")
//    private String revisedscore;
//
//    @SerializedName("review")
//    private String review;
//
//    @SerializedName("keywords")
//    private String keywords;
//
//    @SerializedName("movie_id")
//    private String movie_id;
//
//    @SerializedName("info")
//    private String info;
//
//    @SerializedName("officialstory")
//    private String officialstory;
//
//    @SerializedName("hide_flag")
//    private String hide_flag;
//
//    @SerializedName("charge_edt")
//    private String charge_edt;
//
//    @SerializedName("web_url")
//    private String web_url;
//
//    @SerializedName("praisenum")
//    private int praisenum;
//
//    @SerializedName("sort")
//    private String sort;
//
//    @SerializedName("releasetime")
//    private String releasetime;
//
//    @SerializedName("scoretime")
//    private String scoretime;
//
//    @SerializedName("maketime")
//    private String maketime;
//
//    @SerializedName("last_update_date")
//    private String last_update_date;
//
//    @SerializedName("read_num")
//    private String read_num;
//
//    @SerializedName("directors")
//    private String directors;
//
//    @SerializedName("editor_email")
//    private String editor_email;
//
//    @SerializedName("related")
//    private String related;
//
//    @SerializedName("directors_id")
//    private String directors_id;
//
//    @SerializedName("start_video")
//    private String start_video;
//
//    @SerializedName("media_type")
//    private String media_type;
//
//    @SerializedName("poster")
//    private String poster;
//
//    @SerializedName("photo")
//    private List<String> photo ;
//
//    @SerializedName("next_id")
//    private String next_id;
//
//    @SerializedName("previous_id")
//    private String previous_id;
//
//    @SerializedName("tag_list")
//    private List<String> tag_list ;
//
//    @SerializedName("share_list")
//    private Share_list share_list;
//
//    @SerializedName("sharenum")
//    private int sharenum;
//
//    @SerializedName("commentnum")
//    private int commentnum;
//
//    @SerializedName("servertime")
//    private int servertime;
//
//
//
//    public void setId(String id){
//        this.id = id;
//    }
//    public String getId(){
//        return this.id;
//    }
//
//    public void setTitle(String title){
//        this.title = title;
//    }
//    public String getTitle(){
//        return this.title;
//    }
//
//    public void setIndexcover(String indexcover){
//        this.indexcover = indexcover;
//    }
//    public String getIndexcover(){
//        return this.indexcover;
//    }
//
//    public void setDetailcover(String detailcover){
//        this.detailcover = detailcover;
//    }
//    public String getDetailcover(){
//        return this.detailcover;
//    }
//
//    public void setVideo(String video){
//        this.video = video;
//    }
//    public String getVideo(){
//        return this.video;
//    }
//
//    public void setVerse(String verse){
//        this.verse = verse;
//    }
//    public String getVerse(){
//        return this.verse;
//    }
//
//    public void setVerse_en(String verse_en){
//        this.verse_en = verse_en;
//    }
//    public String getVerse_en(){
//        return this.verse_en;
//    }
//
//    public void setScore(String score){
//        this.score = score;
//    }
//    public String getScore(){
//        return this.score;
//    }
//
//    public void setRevisedscore(String revisedscore){
//        this.revisedscore = revisedscore;
//    }
//    public String getRevisedscore(){
//        return this.revisedscore;
//    }
//
//    public void setReview(String review){
//        this.review = review;
//    }
//    public String getReview(){
//        return this.review;
//    }
//
//    public void setKeywords(String keywords){
//        this.keywords = keywords;
//    }
//    public String getKeywords(){
//        return this.keywords;
//    }
//
//    public void setMovie_id(String movie_id){
//        this.movie_id = movie_id;
//    }
//    public String getMovie_id(){
//        return this.movie_id;
//    }
//
//    public void setInfo(String info){
//        this.info = info;
//    }
//    public String getInfo(){
//        return this.info;
//    }
//
//    public void setOfficialstory(String officialstory){
//        this.officialstory = officialstory;
//    }
//    public String getOfficialstory(){
//        return this.officialstory;
//    }
//
//    public void setHide_flag(String hide_flag){
//        this.hide_flag = hide_flag;
//    }
//    public String getHide_flag(){
//        return this.hide_flag;
//    }
//
//    public void setCharge_edt(String charge_edt){
//        this.charge_edt = charge_edt;
//    }
//    public String getCharge_edt(){
//        return this.charge_edt;
//    }
//
//    public void setWeb_url(String web_url){
//        this.web_url = web_url;
//    }
//    public String getWeb_url(){
//        return this.web_url;
//    }
//
//    public void setPraisenum(int praisenum){
//        this.praisenum = praisenum;
//    }
//    public int getPraisenum(){
//        return this.praisenum;
//    }
//
//    public void setSort(String sort){
//        this.sort = sort;
//    }
//    public String getSort(){
//        return this.sort;
//    }
//
//    public void setReleasetime(String releasetime){
//        this.releasetime = releasetime;
//    }
//    public String getReleasetime(){
//        return this.releasetime;
//    }
//
//    public void setScoretime(String scoretime){
//        this.scoretime = scoretime;
//    }
//    public String getScoretime(){
//        return this.scoretime;
//    }
//
//    public void setMaketime(String maketime){
//        this.maketime = maketime;
//    }
//    public String getMaketime(){
//        return this.maketime;
//    }
//
//    public void setLast_update_date(String last_update_date){
//        this.last_update_date = last_update_date;
//    }
//    public String getLast_update_date(){
//        return this.last_update_date;
//    }
//
//    public void setRead_num(String read_num){
//        this.read_num = read_num;
//    }
//    public String getRead_num(){
//        return this.read_num;
//    }
//
//    public void setDirectors(String directors){
//        this.directors = directors;
//    }
//    public String getDirectors(){
//        return this.directors;
//    }
//
//    public void setEditor_email(String editor_email){
//        this.editor_email = editor_email;
//    }
//    public String getEditor_email(){
//        return this.editor_email;
//    }
//
//    public void setRelated(String related){
//        this.related = related;
//    }
//    public String getRelated(){
//        return this.related;
//    }
//
//    public void setDirectors_id(String directors_id){
//        this.directors_id = directors_id;
//    }
//    public String getDirectors_id(){
//        return this.directors_id;
//    }
//
//    public void setStart_video(String start_video){
//        this.start_video = start_video;
//    }
//    public String getStart_video(){
//        return this.start_video;
//    }
//
//    public void setMedia_type(String media_type){
//        this.media_type = media_type;
//    }
//    public String getMedia_type(){
//        return this.media_type;
//    }
//
//    public void setPoster(String poster){
//        this.poster = poster;
//    }
//    public String getPoster(){
//        return this.poster;
//    }
//
//    public void setString(List<String> photo){
//        this.photo = photo;
//    }
//    public List<String> getString(){
//        return this.photo;
//    }
//
//    public void setNext_id(String next_id){
//        this.next_id = next_id;
//    }
//    public String getNext_id(){
//        return this.next_id;
//    }
//
//    public void setPrevious_id(String previous_id){
//        this.previous_id = previous_id;
//    }
//    public String getPrevious_id(){
//        return this.previous_id;
//    }
//
//    public void setTag_list(List<String > tag_list){
//        this.tag_list = tag_list;
//    }
//    public List<String> getTag_list(){
//        return this.tag_list;
//    }
//
//    public void setShare_list(Share_list share_list){
//        this.share_list = share_list;
//    }
//    public Share_list getShare_list(){
//        return this.share_list;
//    }
//
//    public void setSharenum(int sharenum){
//        this.sharenum = sharenum;
//    }
//    public int getSharenum(){
//        return this.sharenum;
//    }
//
//    public void setCommentnum(int commentnum){
//        this.commentnum = commentnum;
//    }
//    public int getCommentnum(){
//        return this.commentnum;
//    }
//
//    public void setServertime(int servertime){
//        this.servertime = servertime;
//    }
//    public int getServertime(){
//        return this.servertime;
//    }

    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("cover")
    private String cover;

    @SerializedName("story_title")
    private String story_title;

    @SerializedName("platform")
    private String platform;

    @SerializedName("music_id")
    private String music_id;

    @SerializedName("start_video")
    private String start_video;

    @SerializedName("author")
    private Author author;

    @SerializedName("author_list")
    private List<Author_list> author_list ;



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

    public void setStory_title(String story_title){
        this.story_title = story_title;
    }
    public String getStory_title(){
        return this.story_title;
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

    public void setStart_video(String start_video){
        this.start_video = start_video;
    }
    public String getStart_video(){
        return this.start_video;
    }

    public void setAuthor(Author author){
        this.author = author;
    }
    public Author getAuthor(){
        return this.author;
    }

    public void setAuthor_list(List<Author_list> author_list){
        this.author_list = author_list;
    }
    public List<Author_list> getAuthor_list(){
        return this.author_list;
    }

}
