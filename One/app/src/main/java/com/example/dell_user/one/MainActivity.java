package com.example.dell_user.one;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.dell_user.one.Fragment.MovieFragment;
import com.example.dell_user.one.Fragment.HomeFragment;
import com.example.dell_user.one.Fragment.MusicFragment;
import com.example.dell_user.one.Fragment.ReadingFragment;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    private ImageButton reading;
    private ImageButton musice;
    private ImageButton home;
    private ImageButton moving;

    private FragmentManager fragmentManager;
    private HomeFragment homepageFragment;
    private ReadingFragment readFragment;
    private MusicFragment musicFragment;
    private MovieFragment movieFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

       fragmentManager=getSupportFragmentManager();
        setTabSelection(0);
    }

    //初始化和实例化控件
    private void init() {
        reading= (ImageButton) findViewById(R.id.reading);
        musice= (ImageButton) findViewById(R.id.music);
        home= (ImageButton) findViewById(R.id.home);
        moving= (ImageButton) findViewById(R.id.movie);
        reading.setOnClickListener(this);
        musice.setOnClickListener(this);
        home.setOnClickListener(this);
        moving.setOnClickListener(this);
    }

    //点击事件
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.movie:
                moving.setImageResource(R.drawable.movie_active);
                musice.setImageResource(R.drawable.music);
                reading.setImageResource(R.drawable.reading);
                home.setImageResource(R.drawable.home);
                setTabSelection(3);
                break;
            case R.id.music:
                reading.setImageResource(R.drawable.reading);
                home.setImageResource(R.drawable.home);
                musice.setImageResource(R.drawable.music_active);
                moving.setImageResource(R.drawable.movie);
                setTabSelection(2);
                break;
            case R.id.reading:
                home.setImageResource(R.drawable.home);
                moving.setImageResource(R.drawable.movie);
                musice.setImageResource(R.drawable.music);
                reading.setImageResource(R.drawable.reading_active);
                setTabSelection(1);
                break;
            case R.id.home:
                home.setImageResource(R.drawable.home_active);
                moving.setImageResource(R.drawable.movie);
                musice.setImageResource(R.drawable.music);
                moving.setImageResource(R.drawable.movie);
                setTabSelection(0);
                break;
            default:
                break;
        }

    }

    //setTabSelection方法
    private void setTabSelection(int index) {
        //选中tab之前要清除之前的选中状态
        clearSelection();
        //开启一个Fragment事务
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        hideFragment(transaction);
        switch (index){
            case 0:
                home.setImageResource(R.drawable.home_active);
                if (homepageFragment==null){
                    homepageFragment=new HomeFragment();
                    transaction.add(R.id.content,homepageFragment);
                }else{
                    transaction.show(homepageFragment);
                }
                break;
            case 1:
                reading.setImageResource(R.drawable.reading_active);
                if (readFragment==null){
                    readFragment=new ReadingFragment();
                    transaction.add(R.id.content,readFragment);
                }else {
                    transaction.show(readFragment);
                }
                break;
            case 2:
                musice.setImageResource(R.drawable.music_active);
                if (musicFragment==null){
                    musicFragment=new MusicFragment();
                    transaction.add(R.id.content,musicFragment);
                }else {
                    transaction.show(musicFragment);
                }
                break;
            case 3:
            default:
                moving.setImageResource(R.drawable.movie_active);
                if (movieFragment==null){
                    movieFragment=new MovieFragment();
                    transaction.add(R.id.content,movieFragment);
                }else {
                    transaction.show(movieFragment);
                }
                break;
        }
        transaction.commit();
    }

    //clearSelection方法
    private void clearSelection() {
        home.setImageResource(R.drawable.home);
        reading.setImageResource(R.drawable.reading);
        musice.setImageResource(R.drawable.music);
        moving.setImageResource(R.drawable.movie);
    }

    //hideFragment方法
    private void hideFragment(FragmentTransaction transaction) {
        if (homepageFragment != null) {
            transaction.hide(homepageFragment);
        }
        if (readFragment != null) {
            transaction.hide(readFragment);
        }
        if (musicFragment != null) {
            transaction.hide(musicFragment);
        }
        if (movieFragment != null) {
            transaction.hide(movieFragment);
        }
    }
}
