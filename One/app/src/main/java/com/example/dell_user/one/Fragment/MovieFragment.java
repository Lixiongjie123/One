package com.example.dell_user.one.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell_user.one.R;

/**
 * Created by wanjian on 2017/2/14.
 */

public class MovieFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.movie,container,false);
        return view;
    }
}
