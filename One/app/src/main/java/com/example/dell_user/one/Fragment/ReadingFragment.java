package com.example.dell_user.one.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell_user.one.R;
import com.example.dell_user.one.db.Data3;
import com.example.dell_user.one.gson.Author;
import com.example.dell_user.one.gson.Data2;
import com.example.dell_user.one.gson.reading.HomeLatestArticleList.Asker_list;
import com.example.dell_user.one.gson.reading.ReadTopPictureList.Data_ReadTopPictureList;
import com.example.dell_user.one.other.Test;
import com.example.dell_user.one.util.HttpUtil;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by wanjian on 2017/2/14.
 */

public class ReadingFragment extends Fragment {
    private static String mYear;
    private static String mMonth;
    private static String mDay;
    private List<Data3> data3s = new ArrayList<>();
    private List<Data_ReadTopPictureList> textlist=new ArrayList<>();
    private TextView title;
    private TextView bottom_text;
    FrameLayout frg;
    RecyclerView recyclerView;
    ContactsAdapter mAdapter;
    private ImageButton imagb;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        
        final Calendar c = Calendar.getInstance();
        c.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
        mYear = String.valueOf(c.get(Calendar.YEAR));
        mMonth = String.valueOf(c.get(Calendar.MONTH) + 1);
        mDay = String.valueOf(c.get(Calendar.DAY_OF_MONTH));


        init();
        View view=inflater.inflate(R.layout.read,container,false);
        title= (TextView) view.findViewById(R.id.title_large);
        bottom_text= (TextView) view.findViewById(R.id.main);
        frg= (FrameLayout) view.findViewById(R.id.well);
        RecyclerView recyclerView= (RecyclerView) view.findViewById(R.id.reading_recle);
         mAdapter = new ContactsAdapter(data3s,getActivity());
        final LinearLayoutManager layoutManerger = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManerger);
        recyclerView.setAdapter(mAdapter);
        return view;
    }




    private void init() {
        String weatherUrl="http://v3.wufazhuce.com:8000/api/reading/carousel";
        HttpUtil.sendOkHttpRequest(weatherUrl, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {;
                final String responsetext=response.body().string();
                try {
                    JSONObject jsonObject=new JSONObject(responsetext);
                    final JSONArray jsonArray=jsonObject.getJSONArray("data");
                    for (int i=0; i<jsonArray.length();i++){
                        String reading=jsonArray.getJSONObject(i).toString();
                        Gson gson=new Gson();
                        final Data_ReadTopPictureList data2= gson.fromJson(reading,Data_ReadTopPictureList.class);
                        textlist.add(data2);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        for (Data_ReadTopPictureList data:textlist){
                            Data3 data3=new Data3(data.getId(),data.getTitle(),null,data.getBottom_text(),data.getCover(),null,null,null,null,null);
                            data3s.add(data3);
                            mAdapter.notifyDataSetChanged();
                        }
                    }
                });
            }
        });
}
        }

