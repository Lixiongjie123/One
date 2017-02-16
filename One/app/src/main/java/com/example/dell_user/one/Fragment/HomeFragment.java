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
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanjian on 2017/2/14.
 */

public class HomeFragment extends Fragment{

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.home,container,false);


        return view;
    }

}
