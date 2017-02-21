package com.example.dell_user.one.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell_user.one.Fragment.samll_fragment.CreatActivity;
import com.example.dell_user.one.R;

/**
 * Created by wanjian on 2017/2/14.
 */

public class MusicFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.music,container,false);
        return view;
    }
}
