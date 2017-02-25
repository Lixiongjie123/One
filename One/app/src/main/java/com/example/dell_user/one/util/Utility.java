package com.example.dell_user.one.util;


import android.graphics.Movie;

import com.example.dell_user.one.gson.Data2;
import com.example.dell_user.one.gson.Reading_gson;
import com.example.dell_user.one.gson.movie.MovieStoryInformation.Data_MovieStoryInformation;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL-USER on 2017/2/15.
 */

public class Utility {

    public static Reading_gson handleReadingResponse(String response){

        try {
        JSONObject jsonObject = new JSONObject(response);
            JSONArray jsonArray=jsonObject.getJSONArray("reading_gson");
//            for (int i=0;i<jsonArray.length();i++){
//                =jsonArray.getJSONObject(i).toString();
//            }
            String  readingcontent=jsonArray.getJSONObject(0).toString();
            return new Gson().fromJson(readingcontent,Reading_gson.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static Data2 handleReadlistResponse(String response){

        try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray=jsonObject.getJSONArray("data");
                    for (int i=0;i<jsonArray.length();i++){
                        String[] readingcontent=new String[jsonArray.length()];
                        readingcontent[i]=jsonArray.getJSONObject(i).toString();
                return new Gson().fromJson(readingcontent[i], Data2.class);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;

//            List<String> readingcontent = new ArrayList<String>();
//            for (int i=0;i<jsonArray.length();i++){
//                readingcontent.add(jsonArray.getJSONObject(i).toString());
//            }
//            for (String str : readingcontent) {
//                return new Gson().fromJson(str,Data2.class);
//            }
    }

    public static Data_MovieStoryInformation handleMovieRseponse(String response){
        try {
            JSONObject jsonObject=new JSONObject(response);
            return new Gson().fromJson(jsonObject.toString(),Data_MovieStoryInformation.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

}
