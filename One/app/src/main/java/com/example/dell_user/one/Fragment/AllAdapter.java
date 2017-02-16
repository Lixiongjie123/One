package com.example.dell_user.one.Fragment;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell_user.one.R;
import com.example.dell_user.one.db.Data3;
import com.example.dell_user.one.gson.Data2;
import com.example.dell_user.one.gson.Reading_gson;

import java.util.List;

/**
 * Created by DELL-USER on 2017/2/15.
 */
public class AllAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Data3> data3list;
    public AllAdapter(List<Data3> data3list){
        this.data3list=data3list;
    }
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView Image;
        TextView title;
        TextView time;
        TextView main;
        public ViewHolder(View itemView) {
            super(itemView);

            Image= (ImageView) itemView.findViewById(R.id.image123);
            title= (TextView) itemView.findViewById(R.id.title_large);
            time= (TextView) itemView.findViewById(R.id.time);
            main= (TextView) itemView.findViewById(R.id.main);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        RecyclerView.ViewHolder hodler=new ViewHolder(view);
        return hodler;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Data3 data3=data3list.get(position);
        holder.title
    }

    @Override
    public int getItemCount() {
        return  data3list.size();
    }
}
