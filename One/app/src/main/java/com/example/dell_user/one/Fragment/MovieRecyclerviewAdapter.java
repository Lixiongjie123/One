package com.example.dell_user.one.Fragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.dell_user.one.R;
import com.example.dell_user.one.db.Data3;

import java.util.List;

/**
 * Created by wanjian on 2017/2/20.
 */

public  class MovieRecyclerviewAdapter extends RecyclerView.Adapter<MovieRecyclerviewAdapter.ViewHolder>{

    private List<Data3> mContactsList;
    Context context;


    static class ViewHolder extends RecyclerView.ViewHolder {

        View mView;
        ImageView mImageView;
        TextView title;
        TextView main;
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            title = (TextView) itemView.findViewById(R.id.movie_title_large);
            mImageView= (ImageView) itemView.findViewById(R.id.movie_image123);
            main= (TextView) itemView.findViewById(R.id.movie_main);
        }
    }


    public MovieRecyclerviewAdapter(List<Data3> contactsList, Context context) {
        this.context=context;
        mContactsList = contactsList;
    }
    @Override
    public MovieRecyclerviewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_card, parent, false);
        final MovieRecyclerviewAdapter.ViewHolder holder = new MovieRecyclerviewAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Data3  data3 = mContactsList.get(position);
        holder.title.setText(data3.getHp_title());
        Glide.with(context).load(data3.getCover()).into(holder.mImageView);
        holder.main.setText(data3.getBottom_text());
    }

    @Override
    public int getItemCount() {
        return mContactsList.size();
    }

}
