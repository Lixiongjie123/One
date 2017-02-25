package com.example.dell_user.one.IntentActivity;


import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


import com.example.dell_user.one.R;

/**
 * Created by wanjian on 2017/2/22.
 */

public class MusicIntentActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_intent);

        imageButton =(ImageButton) findViewById(R.id.music_imageButton1);
        imageButton.setOnClickListener(this);

    }

    //点击返回图标返回
    @Override
    public void onClick(View view) {
        onBackPressed();
    }

}
