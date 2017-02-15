package com.example.dell_user.one;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton reading;
    private ImageButton musice;
    private ImageButton home;
    private ImageButton moving;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

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
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.movie:
                moving.setImageResource(R.drawable.movie_active);
                musice.setImageResource(R.drawable.music);
                reading.setImageResource(R.drawable.reading);
                home.setImageResource(R.drawable.home);
                break;
            case R.id.music:
                reading.setImageResource(R.drawable.reading);
                home.setImageResource(R.drawable.home);
                musice.setImageResource(R.drawable.music_active);
                moving.setImageResource(R.drawable.movie);
                break;
            case R.id.reading:
                home.setImageResource(R.drawable.home);
                moving.setImageResource(R.drawable.movie);
                musice.setImageResource(R.drawable.music);
                reading.setImageResource(R.drawable.reading_active);
                break;
            case R.id.home:
                home.setImageResource(R.drawable.home_active);
                reading.setImageResource(R.drawable.reading);
                musice.setImageResource(R.drawable.music);
                moving.setImageResource(R.drawable.movie);
                break;
            default:
                break;
        }

    }
}
