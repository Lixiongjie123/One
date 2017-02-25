package com.example.dell_user.one.IntentActivity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.dell_user.one.Fragment.MovieRecyclerviewAdapter;
import com.example.dell_user.one.R;
import com.example.dell_user.one.db.Data3;
import com.example.dell_user.one.gson.movie.MovieInformationList.Data_MovieInformationList;
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
 * Created by wanjian on 2017/2/22.
 */

public class MovieIntentActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView title;
    private TextView bottom_text;
    private ImageButton imageButton;

    private List<Data3> contactsList = new ArrayList<>();

    private List<Data3> data3s = new ArrayList<>();
    private List<Data_MovieInformationList> textlist=new ArrayList<>();
    MovieIntentRecyclerviewAdapter mAdapter;
    FrameLayout frg;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_intent);

        imageButton =(ImageButton) findViewById(R.id.music_imageButton1);
        imageButton.setOnClickListener(this);

        init();

        title = (TextView)findViewById(R.id.movie_infor_title);
        bottom_text= (TextView) findViewById(R.id.movie_infor_content);
        frg= (FrameLayout) findViewById(R.id.movie_infor_well);
        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.movie_intent_recle);
        mAdapter = new MovieIntentRecyclerviewAdapter(contactsList);
        LinearLayoutManager layoutManerger = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManerger);
        recyclerView.setAdapter(mAdapter);
        Log.d("出来", "ok ");
    }



    //返回fragment
    @Override
    public void onClick(View view) {
        onBackPressed();
    }


    private void init() {
        String weatherUrl="http://v3.wufazhuce.com:8000/api/movie/list/145";
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
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        for (Data_MovieInformationList data:textlist){
                            Data3 data3=new Data3(data.getId(),data.getTitle(),null,data.getScore(),data.getCover(),null,null,null,null,null);
                            data3s.add(data3);
                            Log.d("出：", data.getId());
                            mAdapter.notifyDataSetChanged();

                        }
                    }
                });
            }
        });
    }


}
