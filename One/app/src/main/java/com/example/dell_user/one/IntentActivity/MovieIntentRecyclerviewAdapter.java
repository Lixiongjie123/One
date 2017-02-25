package com.example.dell_user.one.IntentActivity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.dell_user.one.Fragment.MovieRecyclerviewAdapter;
import com.example.dell_user.one.R;
import com.example.dell_user.one.db.Data3;

import java.util.List;

/**
 * Created by wanjian on 2017/2/24.
 */

public class MovieIntentRecyclerviewAdapter extends RecyclerView.Adapter<MovieIntentRecyclerviewAdapter.ViewHolder> {

    private List<Data3> mContactsList;
    Context context;



    public class ViewHolder extends RecyclerView.ViewHolder {

        View mView;
        ImageView mImageView;
        TextView title;
        TextView main;
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            title = (TextView) itemView.findViewById(R.id.movie_infor_title);
            mImageView= (ImageView) itemView.findViewById(R.id.movie_infor_image);
            main= (TextView) itemView.findViewById(R.id.movie_infor_content);

        }
    }


    @Override
    public MovieIntentRecyclerviewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_intent_item, parent, false);
        final MovieIntentRecyclerviewAdapter.ViewHolder holder = new MovieIntentRecyclerviewAdapter.ViewHolder(view);
        return holder;
    }



    @Override
    public void onBindViewHolder(MovieIntentRecyclerviewAdapter.ViewHolder holder, int position) {
        final Data3  data3 = mContactsList.get(position);
        holder.title.setText(data3.getHp_title());
        Glide.with(context).load(data3.getCover()).into(holder.mImageView);
        holder.main.setText(data3.getBottom_text());
    }

    public MovieIntentRecyclerviewAdapter(List<Data3> contactsList) {
        mContactsList=contactsList;
    }



    @Override
    public int getItemCount() {
        return mContactsList.size();
    }
}
