package com.example.dell_user.one.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell_user.one.Fragment.samll_fragment.Fragment1;
import com.example.dell_user.one.Fragment.samll_fragment.Fragment2;
import com.example.dell_user.one.Fragment.samll_fragment.Fragment3;
import com.example.dell_user.one.Fragment.samll_fragment.Fragment4;
import com.example.dell_user.one.R;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanjian on 2017/2/14.
 */

public class HomeFragment extends Fragment{
    private ViewPager pager;
    private List<Fragment> fraglist;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.home,container,false);
        pager= (ViewPager) view.findViewById(R.id.pppaaa);

        fraglist=new ArrayList<>();
        fraglist.add(new Fragment1());
        fraglist.add(new Fragment2());
        fraglist.add(new Fragment3());
        fraglist.add(new Fragment4());
        MyViewPagerAdapter adapter=new MyViewPagerAdapter(getChildFragmentManager(),fraglist);
        pager.setAdapter(adapter);
        return view;
    }

}
