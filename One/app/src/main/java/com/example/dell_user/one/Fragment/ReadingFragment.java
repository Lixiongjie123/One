package com.example.dell_user.one.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dell_user.one.R;
import com.example.dell_user.one.gson.Reading_gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanjian on 2017/2/14.
 */

public class ReadingFragment extends Fragment {

    private TextView title;
    private TextView bottom_text;
    RecyclerView recyclerView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.read,container,false);
        title= (TextView) view.findViewById(R.id.title_large);
        bottom_text= (TextView) view.findViewById(R.id.main);
        RecyclerView recyclerView= (RecyclerView) view.findViewById(R.id.reading_recle);

    }

}
