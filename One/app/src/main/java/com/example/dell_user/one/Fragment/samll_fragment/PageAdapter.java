package com.example.dell_user.one.Fragment.samll_fragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.dell_user.one.Fragment.samll_fragment.list.DATA4;
import com.example.dell_user.one.R;
import com.example.dell_user.one.gson.music.IdMusicInformation.Data_IdMusicInformation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanjian on 2017/2/20.
 */

public  class PageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    Samlldata samlldataList;
    List<Data_IdMusicInformation> music_list=new ArrayList<>();
    List<DATA4> readinglist=new ArrayList<>();

    private static final int TYPE_lASTE=0;
    private static final int TYPE_FIREST=1;
    private static final int TYPE_READING=2;
    private static final int TYPE_MUSIC=3;

    Context context;




    @Override
    public int getItemViewType(int position) {
        if (position==0) {
          return TYPE_FIREST;
        } else if (position==1) {
            return TYPE_MUSIC;// 按钮
        } else if (1<position&&position<5) {
            return TYPE_READING;//下拉列表
        }
       else if (5==position){
            return TYPE_lASTE;
        }
        else return 0;
    }

    public PageAdapter(Samlldata samlldata, Context context, List<Data_IdMusicInformation> music_list,
                       List<DATA4> readinglist) {
        Log.d("TAG ", "PageAdapter: "+readinglist.size());
        this.context=context;
        samlldataList=samlldata;
        this.music_list=music_list;
        this.readinglist=readinglist;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType==TYPE_FIREST){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card2, parent, false);
            final Mian_ViewHolder holder = new Mian_ViewHolder(view);
            return holder;
        }
        else if (viewType==TYPE_MUSIC){
            View view1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.music_card, parent, false);
            return new Misic_ViewHolder(view1);
        }
//        else if (viewType==TYPE_MOVING){
//            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
//            return new Moving_ViewHolder(view);
//        }
        else if (viewType==TYPE_READING)
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
            final Reading_ViewHolder holder1 = new Reading_ViewHolder(view);
            return holder1;
        }
        else if (viewType==TYPE_lASTE)
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wati, parent, false);
            final Footer_ViewHolder holder3 = new Footer_ViewHolder(view);
            return holder3;
        }

         return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof Mian_ViewHolder){
            ((Mian_ViewHolder) holder).text_authors.setText(samlldataList.getText_authors());
            Glide.with(context).load(samlldataList.getHp_img_url()).into(((Mian_ViewHolder) holder).bgimage);
            ((Mian_ViewHolder)holder).hp_author.setText(samlldataList.getHp_author());
            ((Mian_ViewHolder)holder).hp_title.setText(samlldataList.getHp_title());
            ((Mian_ViewHolder)holder).hp_content.setText(samlldataList.getHp_content());
            ((Mian_ViewHolder)holder).praisenum.setText(samlldataList.getPraisenum().toString());
        }
        else if (holder instanceof Misic_ViewHolder){
            Data_IdMusicInformation data_idMusicInformation=music_list.get(position-1);
            ((Misic_ViewHolder)holder).guideworad.setText(data_idMusicInformation.getStory_title());
            ((Misic_ViewHolder)holder).titile.setText(data_idMusicInformation.getTitle());
            ((Misic_ViewHolder)holder).nono.setText(data_idMusicInformation.getCharge_edt());
            Glide.with(context).load(data_idMusicInformation.getCover()).into(((Misic_ViewHolder) holder).bb1);
        }
//        else if (holder instanceof Moving_ViewHolder){
//
//        }
        else if (holder instanceof Reading_ViewHolder){
            ((Reading_ViewHolder)holder).title.setText(readinglist.get(position-2).getTitle());
            ((Reading_ViewHolder)holder).main.setText(readinglist.get(position-2).getGuide_word());
            Glide.with(context).load(readinglist.get(position-2).getWeb_url()).into(((Reading_ViewHolder)holder).mImageView);
            Log.d("asdsa122222", "onBindViewHolder: "+readinglist.get(position-2).getWeb_url());
        }
        else if (holder  instanceof Footer_ViewHolder ) {

        }
    }


    @Override
    public int getItemCount() {
        return readinglist.size()+3;
    }

    private class Misic_ViewHolder extends RecyclerView.ViewHolder {

        TextView titile;
        TextView guideworad;
        TextView nono;
        ImageView bb1;
        public Misic_ViewHolder(View itemView) {
            super(itemView);
            nono= (TextView) itemView.findViewById(R.id.qqq);
            bb1= (ImageView) itemView.findViewById(R.id.qwer);
            guideworad= (TextView) itemView.findViewById(R.id.www);
            titile= (TextView) itemView.findViewById(R.id.title_music);
        }
    }

//    private class Moving_ViewHolder extends RecyclerView.ViewHolder {
//        public Moving_ViewHolder(View view) {
//            super(view);
//        }
//    }

    private class Reading_ViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        TextView title;
        TextView main;

        public Reading_ViewHolder(View view) {
            super(view);
            title = (TextView) itemView.findViewById(R.id.title_large);
            mImageView= (ImageView) itemView.findViewById(R.id.image123);
            main= (TextView) itemView.findViewById(R.id.main);

        }
    }

    private class Mian_ViewHolder extends RecyclerView.ViewHolder {
        ImageView bgimage;
        TextView hp_title;
        TextView hp_author;
        TextView hp_content;
        TextView text_authors;
        TextView praisenum;
        public Mian_ViewHolder(View itemView) {
            super(itemView);
            bgimage= (ImageView) itemView.findViewById(R.id.page1_iamge);
            hp_title= (TextView) itemView.findViewById(R.id.page1_title);
            hp_author= (TextView) itemView.findViewById(R.id.page1_author);
            hp_content= (TextView) itemView.findViewById(R.id.page1_content);
            text_authors= (TextView) itemView.findViewById(R.id.page1_text_authors);
            praisenum= (TextView) itemView.findViewById(R.id.page1_praisenum);
        }
    }

    private class Footer_ViewHolder extends RecyclerView.ViewHolder {
        public Footer_ViewHolder(View view) {
            super(view);

        }
    }
}