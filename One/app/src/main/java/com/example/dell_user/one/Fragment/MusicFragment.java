package com.example.dell_user.one.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.dell_user.one.Fragment.samll_fragment.CreatActivity;
import com.example.dell_user.one.IntentActivity.MusicIntentActivity;
import com.example.dell_user.one.R;
import com.example.dell_user.one.db.Data3;
import com.example.dell_user.one.gson.music.TimeMusicBriefInformationList.Data_TimeMusicBriefInformationList;
import com.example.dell_user.one.gson.reading.ReadTopPictureList.Data_ReadTopPictureList;
import com.example.dell_user.one.util.HttpUtil;
import com.google.gson.Gson;

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

public class MusicFragment extends Fragment {

    private TextView title;
    private TextView bottom_text;
    private List<Data3> data3s = new ArrayList<>();
    private List<Data_TimeMusicBriefInformationList> textlist=new ArrayList<>();
    MusicRecyclerviewAdapter mAdapter;
    FrameLayout frg;

    private static String mYear;
    private static String mMonth;
    private static String mDay;
    private static String mWay;

    private CardView cardView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.music,container,false);



        init();
        title= (TextView) view.findViewById(R.id.music_title_large);
        bottom_text= (TextView) view.findViewById(R.id.music_main);
        frg= (FrameLayout) view.findViewById(R.id.well);
        RecyclerView recyclerView= (RecyclerView) view.findViewById(R.id.music_recle);
        mAdapter = new MusicRecyclerviewAdapter(data3s,getActivity());
        LinearLayoutManager layoutManerger = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManerger);
        recyclerView.setAdapter(mAdapter);

//        title.setOnClickListener(this);


        return view;


    }

//    @Override
//    public void onClick(View view) {
//        Intent intent=new Intent(getActivity(), MusicIntentActivity.class);
//        startActivity(intent);
//    }

    private void init() {

        Calendar c =Calendar.getInstance();
        mYear = String.valueOf(c.get(Calendar.YEAR)); // 获取当前年份
        mMonth = String.valueOf(c.get(Calendar.MONTH) + 1);// 获取当前月份

        String weatherUrl="http://v3.wufazhuce.com:8000/api/music/bymonth/"+mYear+"-"+mMonth;
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
                        final Data_TimeMusicBriefInformationList data2= gson.fromJson(reading,Data_TimeMusicBriefInformationList.class);
                        textlist.add(data2);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        for (Data_TimeMusicBriefInformationList data:textlist){
                            Data3 data3=new Data3(data.getId(),data.getStory_title(),null,data.getTitle(),data.getCover(),null,null,null,null,null);
                            Log.d("出现：",data.getId());
                            data3s.add(data3);
                            mAdapter.notifyDataSetChanged();
                        }
                    }
                });
            }
        });
    }

}
