package com.example.dell_user.one.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.dell_user.one.R;
import com.example.dell_user.one.db.Data3;
import com.example.dell_user.one.gson.movie.MovieInformationList.Data_MovieInformationList;
import com.example.dell_user.one.gson.movie.MovieStoryInformation.Data_MovieStoryInformation;
import com.example.dell_user.one.gson.music.TimeMusicBriefInformationList.Data_TimeMusicBriefInformationList;
import com.example.dell_user.one.util.HttpUtil;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by wanjian on 2017/2/14.
 */

public class MovieFragment extends Fragment {

    private TextView title;
    private TextView bottom_text;
    private List<Data3> data3s = new ArrayList<>();
    private List<Data_MovieInformationList> textlist=new ArrayList<>();
    ReadingRecyclerviewAdapter mAdapter;
    FrameLayout frg;

    private SwipeRefreshLayout swipeRefresh;
    
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.movie,container,false);
        init();
        title= (TextView) view.findViewById(R.id.movie_title_large);
        bottom_text= (TextView) view.findViewById(R.id.movie_main);
        frg= (FrameLayout) view.findViewById(R.id.well);
        RecyclerView recyclerView= (RecyclerView) view.findViewById(R.id.movie_recle);
        mAdapter = new ReadingRecyclerviewAdapter(data3s,getActivity());
        LinearLayoutManager layoutManerger = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManerger);
        recyclerView.setAdapter(mAdapter);
        return view;

        //swipeRefresh
//        swipeRefresh=(SwipeRefreshLayout)view.findViewById(R.id.swipe_refresh);
////        swipeRefresh.setColorSchemeColors(R.color.colorPrimary);
//        swipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//            @Override
//            public void onRefresh() {
//               refreshDatas();
//            }
//
//
//        });
    }

//    private void initDatas() {
//
//        mDatas = new ArrayList<String>();
//        for (int i = 'A'; i < 'z'; i++)
//        {
//            mDatas.add("" + (char) i);
//        }
//    }

//    private void refreshDatas() {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                getActivity().runOnUiThread(new Runnable(){
//
//                    @Override
//                    public void run() {
//                        initDatas();
//                        MovieRecyclerviewAdapter.notifyDataSetChanged();
//                        swipeRefresh.setRefreshing(false);
//                    }
//                });
//            }
//        }).start();
//    }

    private void init() {
        String weatherUrl="http://v3.wufazhuce.com:8000/api/movie/list/0";
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
                        final Data_MovieInformationList data2= gson.fromJson(reading,Data_MovieInformationList.class);
                        textlist.add(data2);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        for (Data_MovieInformationList data:textlist){
                            Data3 data3=new Data3(data.getId(),data.getTitle(),null,data.getScore(),data.getCover(),null,null,null,null,null);
                            data3s.add(data3);
                            mAdapter.notifyDataSetChanged();
                        }
                    }
                });
            }
        });
    }
}
