package com.example.dell_user.one.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.dell_user.one.Fragment.samll_fragment.CreatActivity;
import com.example.dell_user.one.R;
import com.example.dell_user.one.db.Data3;
import com.example.dell_user.one.gson.reading.ReadTopPictureList.Data_ReadTopPictureList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanjian on 2017/2/14.
 */

public class MusicFragment extends Fragment {

//    private List<Data3> data3s = new ArrayList<>();
//
//    private TextView title;
//    private TextView bottom_text;
//    FrameLayout frg;
//    MusicRecyclerviewAdapter musicRecyclerviewAdapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.music,container,false);

//        initDatas();
//        RecyclerView recyclerView= (RecyclerView) view.findViewById(R.id.music_recle);
//        final LinearLayoutManager layoutManerger = new LinearLayoutManager(getActivity());
//        recyclerView.setLayoutManager(layoutManerger);
//        musicRecyclerviewAdapter = new MusicRecyclerviewAdapter(data3s,getActivity());
//        recyclerView.setAdapter(musicRecyclerviewAdapter);
         return view;
    }

//    private void initDatas() {
//
//
//    }
}
