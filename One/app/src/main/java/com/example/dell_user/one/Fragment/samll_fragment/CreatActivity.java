package com.example.dell_user.one.Fragment.samll_fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dell_user.one.MainActivity;
import com.example.dell_user.one.R;

import java.sql.Time;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Created by DELL-USER on 2017/2/19.
 */

public class CreatActivity  extends Activity{
    TextView textView;
    ImageView imageView;
    private static String mYear;
    private static String mMonth;
    private static String mDay;
    private static String mWay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creat_activity);
        imageView= (ImageView) findViewById(R.id.q6516);
        textView= (TextView) findViewById(R.id.textView2);

        final Calendar c = Calendar.getInstance();
        c.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
        mYear = String.valueOf(c.get(Calendar.YEAR)); // 获取当前年份
        mMonth = String.valueOf(c.get(Calendar.MONTH) + 1);// 获取当前月份
        mDay = String.valueOf(c.get(Calendar.DAY_OF_MONTH));// 获取当前月份的日期号码
        mWay = String.valueOf(c.get(Calendar.DAY_OF_WEEK));
        if("2".equals(mWay)){

            imageView.setImageResource(R.drawable.opening_monday);
        }else if("3".equals(mWay)){

            imageView.setImageResource(R.drawable.opening_tuesday);
        }else if("4".equals(mWay)){

            imageView.setImageResource(R.drawable.opening_wednesday);
        }else if("5".equals(mWay)){

            imageView.setImageResource(R.drawable.opening_thursday);
        }else if("6".equals(mWay)){

            imageView.setImageResource(R.drawable.opening_friday);
        }else if("7".equals(mWay)){
            imageView.setImageResource(R.drawable.opening_saturday);

        }else if("8".equals(mWay)){
            imageView.setImageResource(R.drawable.opening_sunday);

        }
        textView.setText("地球历"+mYear+"年"+mMonth+"月"+mDay+"日");


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(CreatActivity.this, MainActivity.class);
                startActivity(intent);
                CreatActivity.this.finish();
            }
        },2000);
    }
}
