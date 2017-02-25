package com.example.dell_user.one.Fragment;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.dell_user.one.IntentActivity.MusicIntentActivity;
import com.example.dell_user.one.R;
import com.example.dell_user.one.db.Data3;

import java.util.List;

/**
 * Created by DELL-USER on 2017/2/16.
 */

public class MusicRecyclerviewAdapter extends RecyclerView.Adapter<MusicRecyclerviewAdapter.ViewHolder> {

    private List<Data3> mContactsList;
    Context context;



    public static class ViewHolder extends RecyclerView.ViewHolder {

        View mView;
        ImageView mImageView;
        TextView title;
        TextView main;


        public ViewHolder(View itemView) {
            super(itemView);

            mView = itemView;
            title = (TextView) itemView.findViewById(R.id.music_title_large);
            mImageView= (ImageView) itemView.findViewById(R.id.music_image123);
            main= (TextView) itemView.findViewById(R.id.music_main);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context,MusicIntentActivity.class);
                    context.startActivity(intent);
                }
            });

        }
    }


    public MusicRecyclerviewAdapter(List<Data3> contactsList, Context context) {
        this.context=context;
        mContactsList = contactsList;
    }

    //该方法用于创建ViewHolder实例，将music_card布局加载进来并传入构造函数，最后返回holder实例
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.music_card, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    //对recyclerview的子项的数据进行赋值
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final Data3  data3 = mContactsList.get(position);
        holder.title.setText(data3.getHp_title());
        Glide.with(context).load(data3.getCover()).into(holder.mImageView);
        holder.main.setText(data3.getBottom_text());
    }

    //返回子项数
    @Override
    public int getItemCount() {
        return mContactsList.size();
    }

}
