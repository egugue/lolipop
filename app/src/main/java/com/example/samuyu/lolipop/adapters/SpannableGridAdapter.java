package com.example.samuyu.lolipop.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.samuyu.lolipop.R;

import org.lucasr.twowayview.TwoWayLayoutManager;
import org.lucasr.twowayview.widget.SpannableGridLayoutManager;
import org.lucasr.twowayview.widget.TwoWayView;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by toyamaosamuyu on 2014/11/30.
 */
    /*
public class SpannableGridAdapter extends RecyclerView.Adapter<SpannableGridAdapter.ImageViewHolder>{
    private static final String TAG = SpannableGridAdapter.class.getSimpleName();

    private static final int COUNT = 20;
    private final List<Integer> mItemList;
    private final Context mContext;
    private final TwoWayView mRecyclerView;

    public SpannableGridAdapter(Context context, TwoWayView recyclerView) {
        mContext = context;
        mRecyclerView = recyclerView;

        mItemList = new ArrayList<Integer>();
        for (int i = 0; i < COUNT; i++) {
            mItemList.add(i);
        }
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final View view = LayoutInflater.from(mContext).inflate(R.id.list_item_text, viewGroup, null);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder imageViewHolder, int i) {

        imageViewHolder.bind(mItemList.get(i).toString());

        final View itemView = imageViewHolder.itemView;

        final SpannableGridLayoutManager.LayoutParams lp =
                (SpannableGridLayoutManager.LayoutParams) itemView.getLayoutParams();

        final int itemId = mItemList.get(i);
        boolean isVertical = (mRecyclerView.getOrientation() == TwoWayLayoutManager.Orientation.VERTICAL);

        final int span1 = (itemId == 0 || itemId == 3 ? 2 : 1);
        final int span2 = (itemId == 0 ? 2 : (itemId == 3 ? 3 : 1));

        final int colSpan = (isVertical ? span2 : span1);
        final int rowSpan = (isVertical ? span1 : span2);

        if (lp.rowSpan != rowSpan || lp.colSpan != colSpan) {
            lp.rowSpan = rowSpan;
            lp.colSpan = colSpan;
            itemView.setLayoutParams(lp);
        }
    }

    @Override
    public int getItemCount() {
        return mItemList.size();
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {

        @InjectView(R.id.list_item_text)
        TextView mTextView;

        public ImageViewHolder(View itemView) {
            super(itemView);
            ButterKnife.inject(this, itemView);
        }

        public void bind(CharSequence text) {
            mTextView.setText(text);
        }
    }


}
    */
