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
 * Created by DELL-USER on 2017/2/16.
 */

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {

    private List<Data3> mContactsList;
    Context context;



    public ContactsAdapter(List<Data3> contactsList,Context context) {
        this.context=context;
        mContactsList = contactsList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final Data3  data3 = mContactsList.get(position);
       holder.title.setText(data3.getHp_title());
      Glide.with(context).load(data3.getCover()).into(holder.mImageView);
        holder.main.setText(data3.getBottom_text());

        //如果设置了回调，则设置点击事件
//        if (mOnItemClickListener != null) {
//            holder.itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    int position  = holder.getLayoutPosition();
//                    mOnItemClickListener.onItemClick(holder.itemView, contacts.getImageID(), contacts.getName());
//                }
//            });
//        }

    }

    //ItemClick的回调接口
//    public interface OnItemClickListener1 {
//        void onItemClick(View view, int position, String str);
//    }
//    private OnItemClickListener1 mOnItemClickListener;
//    public void setOnItemClickListener(OnItemClickListener1 onItemClickListener1) {
//        this.mOnItemClickListener = onItemClickListener1;
//    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        View mView;
        ImageView mImageView;
        TextView title;
        TextView main;

        public ViewHolder(View itemView) {
        super(itemView);
        mView = itemView;
        title = (TextView) itemView.findViewById(R.id.title_large);
            mImageView= (ImageView) itemView.findViewById(R.id.image123);
            main= (TextView) itemView.findViewById(R.id.main);
        }
}

    @Override
    public int getItemCount() {
        return mContactsList.size();
    }
}
