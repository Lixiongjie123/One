package com.example.dell_user.one.Fragment.samll_fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell_user.one.Fragment.samll_fragment.list.DATA4;
import com.example.dell_user.one.R;
import com.example.dell_user.one.gson.home.HomeLatestIdLIst.HomeLatestIdLIst;
import com.example.dell_user.one.gson.home.IdGraphicInformation.IdGraphicInformation;
import com.example.dell_user.one.gson.movie.MovieInformationList.Author_list;
import com.example.dell_user.one.gson.music.IdMusicInformation.Data_IdMusicInformation;
import com.example.dell_user.one.gson.reading.HomeLatestArticleList.Author;
import com.example.dell_user.one.gson.reading.HomeLatestArticleList.Essay;
import com.example.dell_user.one.gson.reading.HomeLatestArticleList.Question;
import com.example.dell_user.one.gson.reading.HomeLatestArticleList.Serial;
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


public class      Fragment1 extends Fragment {
    List<Data_IdMusicInformation> music_list=new ArrayList<>();
    List<Serial> serial=new ArrayList<>();
    List<Question> questionlist=new ArrayList<>();
    List<DATA4> readinglist=new ArrayList<>();
    Samlldata samlldata;
    String page1;
    PageAdapter madapter;
    public String username;
    public String userpic;
    public String username1;
    public String userpic1;
    public String username3;
    public String userpic3;
    List<Samlldata> samlldataList=new ArrayList<>();

    private RecyclerView  recyclerView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
      View view=inflater.inflate(R.layout.page1,container,false);
        init2();
        init3();
        init();

        recyclerView = (RecyclerView) view.findViewById(R.id.recle2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

//        madapter.setOnItemClickListener(new PageAdapter.OnItemClickListener() {
//            @Override
//            public void onItemClick(View view, int position) {
//                Intent intent=new Intent(getActivity(), Idsave.class);
//                startActivity(intent);
//            }
//        });
//        madapter.setOnItemLongClickListener(new PageAdapter.OnItemLongClickListener() {
//            @Override
//            public void onItemLongClick(View view, int position) {
//
//            }
//        });
        return view;
    }

    private void init3() {
        String READING_URL="http://v3.wufazhuce.com:8000/api/reading/index";
        HttpUtil.sendOkHttpRequest(READING_URL,new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String responsetext=response.body().string();
                try {
                    JSONObject jsonob=new JSONObject(responsetext);
                    Gson gson = new Gson();

                    JSONObject jsonbo=jsonob.getJSONObject("data");
                    JSONArray jsonArray=jsonbo.getJSONArray("essay");
                    JSONArray jsonArray2=jsonbo.getJSONArray("serial");
                    JSONArray jsonArray3=jsonbo.getJSONArray("question");
                    String essay=jsonArray.getJSONObject(0).toString();
                    String serial=jsonArray2.getJSONObject(0).toString();
                    String question=jsonArray3.getJSONObject(1).toString();
                    final Essay homelist=gson.fromJson(essay,Essay.class);
                   final Serial seriadlist=gson.fromJson(serial,Serial.class);
                    final Question homelist3=gson.fromJson(question,Question.class);

                    for (Author author:homelist.authorList){
                        username=author.getUser_name();
                        userpic=author.getWeb_url();
                        Log.d("QQQ", "onResponse: "+username+userpic);
                    }



                    for (Author_list author:seriadlist.getAuthor_list()){
                        username1=author.getUser_name();
                        userpic1=author.getWeb_url();
                        Log.d("QQQ", "onResponse: "+username1+userpic1);
                    }


                    for (Author_list author:homelist3.getAuthor_list()){
                        username3=author.getUser_name();
                        userpic3=author.getWeb_url();
                        Log.d("QQQ1231", "onResponse: "+username3+userpic3);
                    }
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            DATA4 data4=new DATA4(homelist.getHp_title(),username,homelist.getGuide_word(),userpic,homelist.getHp_makettime());
                            readinglist.add(data4);
                            Log.d("DAta4", "run: "+data4);
                            DATA4 data1= new DATA4(seriadlist.getTitle(),username1,seriadlist.getExcerpt(),userpic1,seriadlist.getMaketime());
                            Log.d("data1", "run: "+userpic);
                            readinglist.add(data1);
                            DATA4 data3=new DATA4(homelist3.getAnswer_title(),username3,homelist3.getAnswer_content(),userpic3,homelist3.getQuestion_makettime());
                            Log.d("dataaaa", "run: "+userpic3);
                            readinglist.add(data3);
                        }
                    });

                } catch (JSONException e)
                {
                    e.printStackTrace();
                }

            }
        });
    }

    private void init2() {
        String idmain = "http://v3.wufazhuce.com:8000/api/music/idlist/0";
        HttpUtil.sendOkHttpRequest(idmain, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String responsetext = response.body().string();
                Gson gson=new Gson();
                HomeLatestIdLIst lIst=gson.fromJson(responsetext,HomeLatestIdLIst.class);
                page1 =lIst.getData().get(0);
                Log.d(" QQQ", "onResponse: "+page1);
            }

        });
        String musicURL="http://v3.wufazhuce.com:8000/api/music/detail/"+page1;
        HttpUtil.sendOkHttpRequest(musicURL, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String responsetext1 = response.body().string();
                Log.d("CC", "onResponse: "+responsetext1);
                try {
                    JSONObject jsonObject=new JSONObject(responsetext1);
                    JSONObject jeson=jsonObject.getJSONObject("data");
                    Gson gson=new Gson();
                    final Data_IdMusicInformation data_idMusicInformation=gson.fromJson(jeson.toString(),Data_IdMusicInformation.class);
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Data_IdMusicInformation data_idMusicInformation1=new Data_IdMusicInformation(data_idMusicInformation.getCover(),data_idMusicInformation.getTitle(),data_idMusicInformation.getStory_title(),data_idMusicInformation.getCharge_edt());
                            music_list.add(data_idMusicInformation1);
                          //  madapter.notifyDataSetChanged();
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                }
                            }, 3000);
                            Log.d("TAG", "run: "+data_idMusicInformation.getAuthor_list().get(0).getWb_name());
                            Log.d("qwerty", "onCreateView: "+music_list.size());
                        }
                    });

                } catch (JSONException e) {
                    Log.d("qwe", "onResponse: ");
                    e.printStackTrace();
                }
            }
        });

    }

    private void init() {
                  String idmain = "http://v3.wufazhuce.com:8000/api/hp/idlist/0";
                      HttpUtil.sendOkHttpRequest(idmain, new Callback() {
                          @Override
                          public void onFailure(Call call, IOException e) {

                          }
                          @Override
                          public void onResponse(Call call, Response response) throws IOException {
                              String responsetext = response.body().string();
                              Gson gson=new Gson();
                              HomeLatestIdLIst lIst=gson.fromJson(responsetext,HomeLatestIdLIst.class);
                              request(lIst.getData().get(0));
                              page1 =lIst.getData().get(0);
                          }

                          private void request(String s) {
                              String first_itemURl="http://v3.wufazhuce.com:8000/api/hp/detail/"+s;
                              Log.d("first_itemURl", "request: "+first_itemURl);
                              HttpUtil.sendOkHttpRequest(first_itemURl, new Callback() {
                                  @Override
                                  public void onFailure(Call call, IOException e) {

                                  }
                                  @SuppressLint("LongLogTag")
                                  @Override
                                  public void onResponse(Call call, Response response) throws IOException {
                                      String responsetext1 = response.body().string();
                                      try {
                                          JSONObject jsonObject=new JSONObject(responsetext1);
                                          JSONObject jsonObjet=jsonObject.getJSONObject("data");
                                          Gson gson=new Gson();
                                          final IdGraphicInformation idGrahicInforma=gson.fromJson(jsonObjet.toString(),IdGraphicInformation.class);

                                          Log.d("CCC", "onResponse: "+idGrahicInforma);

                                          getActivity().runOnUiThread(new Runnable() {
                                              @Override
                                              public void run() {
                                                  Log.d("XXX1234445", "run: "+idGrahicInforma.praisenum);
                                                  Log.d("XXX123312", "run: "+idGrahicInforma.getHp_img_url());
                                                  Log.d("XXX", "run: "+idGrahicInforma.hp_img_url);
                                                  Log.d("XXX", "run: "+idGrahicInforma.hp_content);
                                                  Log.d("XXX", "run: "+idGrahicInforma.text_authors);
                                                  samlldata  =new Samlldata(null,idGrahicInforma.getHp_title(),idGrahicInforma.getHp_img_url(),idGrahicInforma.getHp_author(),idGrahicInforma.getHp_content(),idGrahicInforma.getText_authors(),idGrahicInforma.getContent_bgcolor(),idGrahicInforma.getPraisenum());
                                                  Log.d("DATA12", "run: "+idGrahicInforma.getHp_img_url());
                                                  new Handler().postDelayed(new Runnable() {
                                                      @Override
                                                      public void run() {
                                                      }
                                                  }, 1000);
                                                  madapter = new PageAdapter(samlldata, getContext(), music_list,readinglist);
                                                  recyclerView.setAdapter(madapter);
                                              }
                                          });

                                      } catch (JSONException e) {
                                          e.printStackTrace();
                                      }


                                  }
                              });

                          }


                      });

              }


}