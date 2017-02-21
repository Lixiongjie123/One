package com.example.dell_user.one.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell_user.one.MovieAdapter;
import com.example.dell_user.one.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanjian on 2017/2/14.
 */

public class MovieFragment extends Fragment {
    
    private RecyclerView recyclerView;
    private List<String>mDatas ;

    private SwipeRefreshLayout swipeRefresh;
    
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.movie,container,false);
        recyclerView=(RecyclerView)view.findViewById(R.id.recycler_view);
        initDatas();

       //recyclerview
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        MovieAdapter adapter=new MovieAdapter(mDatas);
        recyclerView.setAdapter(adapter);

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
        return view;
    }

    private void initDatas() {

        mDatas = new ArrayList<String>();
        for (int i = 'A'; i < 'z'; i++)
        {
            mDatas.add("" + (char) i);
        }
    }

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
//                        MovieAdapter.notifyDataSetChanged();
//                        swipeRefresh.setRefreshing(false);
//                    }
//                });
//            }
//        }).start();
//    }

}
