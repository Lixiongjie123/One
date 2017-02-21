package com.example.dell_user.one.Fragment.samll_fragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell_user.one.R;

import java.util.List;

/**
 * Created by wanjian on 2017/2/20.
 */

public  class PageAdapter extends RecyclerView.Adapter<PageAdapter.ViewHolder>{

    private List<Samlldata> mContactsList;
    Context context;

    public PageAdapter(List<Samlldata> contactsList,Context context) {
        this.context=context;
        mContactsList = contactsList;
    }

    @Override
    public PageAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card2, parent, false);
        final PageAdapter.ViewHolder holder = new PageAdapter.ViewHolder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder(final PageAdapter.ViewHolder holder, final int position) {
        final Samlldata  samlldata = mContactsList.get(position);
       holder.title.setText(samlldata.getMain());
   //     Glide.with(context).load(data3.getUrl()).into(holder.mImageView);

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

        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
//           mImageView = (ImageView) itemView.findViewById(R.id.circle_img);
            title = (TextView) itemView.findViewById(R.id.main2);
//            mImageView= (ImageView) itemView.findViewById(R.id.image123);
        }
    }

    @Override
    public int getItemCount() {
        return mContactsList.size();
    }
}
