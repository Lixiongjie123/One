package com.example.dell_user.one.util;

import com.example.dell_user.one.db.List;
import com.example.dell_user.one.gson.Data2;
import com.example.dell_user.one.gson.Reading_gson;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by DELL-USER on 2017/2/15.
 */

public class Utility {

    public static Reading_gson handleReadingResponse(String response){

        try {
        JSONObject jsonObject = new JSONObject(response);
            JSONArray jsonArray=jsonObject.getJSONArray("reading_gson");
            String readingcontent=jsonArray.getJSONObject(0).toString();
            return new Gson().fromJson(readingcontent,Reading_gson.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static Data2 handleReadlistResponse(String response){

        try {
        JSONObject jsonObject = new JSONObject(response);
            JSONArray jsonArray=jsonObject.getJSONArray("reading_gson");
            String readingcontent=jsonArray.getJSONObject(0).toString();
            return new Gson().fromJson(readingcontent,Data2.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
