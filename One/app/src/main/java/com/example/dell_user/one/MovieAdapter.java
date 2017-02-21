package com.example.dell_user.one;

import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Date;
import java.util.List;

/**
 * Created by wanjian on 2017/2/20.
 */

public  class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder>{


    private List<String> mDatas;

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        public ViewHolder(View view) {
            super(view);
             textView=(TextView) view.findViewById(R.id.id_nun);
        }
    }


    public MovieAdapter(List<String> movie){
        mDatas=movie;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).
                inflate(R.layout.movie_recyclerviewitem,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(mDatas.get(position));
    }


    @Override
    public int getItemCount() {
        return mDatas.size();
    }

}
