package com.example.dell_user.one.Fragment.samll_fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.dell_user.one.Fragment.samll_fragment.list.Idsave;
import com.example.dell_user.one.R;
import com.example.dell_user.one.gson.home.HomeLatestIdLIst.HomeLatestIdLIst;
import com.example.dell_user.one.gson.reading.HomeLatestArticleList.HomeLatestArticleList;
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
 * Created by DELL-USER on 2017/2/18.
 */
public class      Fragment1 extends Fragment {
    List<Samlldata> samlldatalist =new ArrayList<>();
    String[] idd=new String[0];

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
      View view=inflater.inflate(R.layout.page1,container,false);


        RecyclerView  recyclerView = (RecyclerView) view.findViewById(R.id.recle2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        PageAdapter adapter=new PageAdapter(samlldatalist,getActivity());
        recyclerView.setAdapter(adapter);

        return view;
    }

              private void init() {
                  String first_itemURL = "http://v3.wufazhuce.com:8000/api/hp/idlist/0";
                  HttpUtil.sendOkHttpRequest(first_itemURL, new Callback() {
                      @Override
                      public void onFailure(Call call, IOException e) {

                      }

                      @Override
                      public void onResponse(Call call, Response response) throws IOException {
                          final String responsetext = response.body().string();
                          try {
                              JSONObject jsonObject = new JSONObject(responsetext);
                              final JSONArray jsonArray = jsonObject.getJSONArray("data");
                              String main=jsonArray.toString();
                              Gson gson=new Gson();
                              HomeLatestIdLIst home=gson.fromJson(main,HomeLatestIdLIst.class);
                              for (String id:home.data){
                                  int i=0;
                                  idd [i]=id;
                                  i++;
                              }
                              getActivity().runOnUiThread(new Runnable() {
                                  @Override
                                  public void run() {
                                      Samlldata sss = new Samlldata(idd[1]);
                                      samlldatalist.add(sss);
                                  }
                              });
                          } catch (JSONException e) {
                              e.printStackTrace();
                          }
                      }
                  });

              }
}