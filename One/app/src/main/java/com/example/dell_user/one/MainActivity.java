package com.example.dell_user.one;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.dell_user.one.Fragment.MovieFragment;
import com.example.dell_user.one.Fragment.HomeFragment;
import com.example.dell_user.one.Fragment.MusicFragment;
import com.example.dell_user.one.Fragment.ReadingFragment;
import com.example.dell_user.one.IntentActivity.OtherSettingsActivity;
import com.example.dell_user.one.IntentActivity.SearchActivity;
import com.example.dell_user.one.IntentActivity.UserbackActivity;

import static com.example.dell_user.one.R.id.night;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton reading;
    private ImageButton musice;
    private ImageButton home;
    private ImageButton moving;

    private FragmentManager fragmentManager;
    private HomeFragment homepageFragment;
    private ReadingFragment readFragment;
    private MusicFragment musicFragment;
    private MovieFragment movieFragment;

    public DrawerLayout mDrawerLayout;
//    public Button header_back;

    //默认是日间模式
    private int theme = R.style.AppTheme;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //判断是否有主题存储
        if (savedInstanceState!=null){
            theme=savedInstanceState.getInt("theme");
            setTheme(theme);
        }

        setContentView(R.layout.activity_main);
        init();

        //Toolbar
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        getSupportActionBar().setTitle(null);
        if (actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.mipmap.individual_center);
        }
        //DrawerLayout
        mDrawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        NavigationView navigationView=(NavigationView)findViewById(R.id.nav_view);
        navigationView.setCheckedItem(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            //点击侧滑过来菜单跳转到响应的页面
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.others_setting:
                        startActivity(new Intent(MainActivity.this, OtherSettingsActivity.class));
                        break;
                    case R.id.Users_feedback:
                        startActivity(new Intent(MainActivity.this, UserbackActivity.class));
                        break;
                    case night:
//                        mDrawerLayout.closeDrawers();
//                        break;
                        theme = (theme == R.style.AppTheme) ? R.style.NightAppTheme : R.style.AppTheme; //改变APP主题，即切换到夜间模式
                        MainActivity.this.recreate();
                }
                return true;
            }
        });
        fragmentManager=getSupportFragmentManager();
        setTabSelection(0);

//        Button header_back=(Button)findViewById(R.id.header_back);
//        header_back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mDrawerLayout.closeDrawers();
//            }
//        });
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

//        header_back.setOnClickListener(this);
    }

    //点击事件，备注：此处可能会有fragment的内容会重叠（我也不知道为什么···）
    @Override
    public void onClick(View v) {
        TextView textView_home=(TextView)findViewById(R.id.app_bar_content) ;
        TextView textView_reading=(TextView)findViewById(R.id.app_bar_content) ;
        TextView textView_music=(TextView)findViewById(R.id.app_bar_content) ;
        TextView textView_movie=(TextView)findViewById(R.id.app_bar_content) ;

        switch (v.getId()){
            case R.id.home:
                home.setImageResource(R.drawable.home_active);
                moving.setImageResource(R.drawable.movie);
                musice.setImageResource(R.drawable.music);
                moving.setImageResource(R.drawable.movie);
                textView_home.setText("one");
                setTabSelection(0);
                break;
            case R.id.reading:
                home.setImageResource(R.drawable.home);
                moving.setImageResource(R.drawable.movie);
                musice.setImageResource(R.drawable.music);
                reading.setImageResource(R.drawable.reading_active);
                textView_reading.setText("一个阅读");
                setTabSelection(1);
                break;
            case R.id.music:
                reading.setImageResource(R.drawable.reading);
                home.setImageResource(R.drawable.home);
                musice.setImageResource(R.drawable.music_active);
                moving.setImageResource(R.drawable.movie);
                textView_music.setText("一个音乐");
                setTabSelection(2);
                break;
            case R.id.movie:
                moving.setImageResource(R.drawable.movie_active);
                musice.setImageResource(R.drawable.music);
                reading.setImageResource(R.drawable.reading);
                home.setImageResource(R.drawable.home);
                textView_movie.setText("一个电影");
                setTabSelection(3);
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


    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toolbar,menu);
        return true;
    }
    //加载toolbar上各个按钮的处理事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;
            case R.id.search:
                startActivity(new Intent(MainActivity.this, SearchActivity.class));  //跳转到搜索页面
                return true;
            default:
        }
        return true;
    }


    //监听返回键
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    //实现夜间模式
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("theme", theme);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        theme = savedInstanceState.getInt("theme");
    }
}
