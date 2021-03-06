package com.example.xiaogang.newonegril.v.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.xiaogang.newonegril.R;
import com.example.xiaogang.newonegril.v.model.Zhihu;
import com.example.xiaogang.newonegril.v.model.Zhiitem;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;

/**
 * Created by xiaogang on 16/11/5.
 */

public class ZhihuViewHolder extends BaseViewHolder<Zhiitem> {
    private ImageView imageView;
    private TextView textView;
    public ZhihuViewHolder(ViewGroup parent) {
        super(parent, R.layout.zhihu_item);
        imageView = $(R.id.zhihu_image);
        textView = $(R.id.zhihu_title);
    }

    @Override
    public void setData(Zhiitem data) {
        super.setData(data);
        Glide.with(getContext())
                .load(data.images)
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(imageView);
        textView.setText(data.title);
    }
}
