package com.example.samuyu.lolipop.adapters;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.samuyu.lolipop.DetailActivity;
import com.example.samuyu.lolipop.MyActivity;
import com.example.samuyu.lolipop.R;
import com.example.samuyu.lolipop.entities.Star;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by toyamaosamuyu on 2014/11/30.
 */
public class ImageListAdapter extends RecyclerView.Adapter<ImageListAdapter.ImageViewHolder>{
    private static final String TAG = ImageListAdapter.class.getSimpleName();

    private final List<Star> mItemList;
    private final Context mContext;
    private OnItemClickListener mItemClickListener;

    public static interface OnItemClickListener {
        public void onItemClick(Star star, View imageView);
    }

    public ImageListAdapter(Context context, List<Star> itemList, OnItemClickListener listener) {
        mContext = context;
        mItemList = itemList;
        mItemClickListener = listener;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_item_image, null);
        return new ImageViewHolder(view, mContext, mItemClickListener);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder imageViewHolder, int i) {
        imageViewHolder.bind(mItemList.get(i));
    }

    @Override
    public int getItemCount() {
        return mItemList.size();
    }


    public static class ImageViewHolder extends RecyclerView.ViewHolder {

        private final Context mContext;
        private OnItemClickListener mListener;

        @InjectView(R.id.list_item_image)
        ImageView mImageView;

        public ImageViewHolder(View itemView, Context context, OnItemClickListener listener) {
            super(itemView);
            mContext = context;
            ButterKnife.inject(this, itemView);
            mListener = listener;
        }

        public void bind(final Star star) {
            /*
            Picasso picasso = Picasso.with(mContext);
            picasso.setLoggingEnabled(true);
            picasso.setDebugging(true);
            picasso.setIndicatorsEnabled(true);
            picasso.load(url)
                    .into(mImageView);
                    */

            mImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mListener.onItemClick(star, mImageView);
                }
            });

            Picasso.with(mContext)
                    .load(star.imgUrl)
                    .into(mImageView);
        }
    }
}
