package com.example.xiaogang.newonegril.v.adapter;

import android.content.ClipData;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.xiaogang.newonegril.R;
import com.example.xiaogang.newonegril.v.model.Gril;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;

/**
 * Created by xiaogang on 16/11/2.
 */

public class MeiziViewHolder extends BaseViewHolder<Gril>{
    private ImageView image;
    public MeiziViewHolder(ViewGroup parent) {
        super(parent, R.layout.girl_item);
        image = $(R.id.image);
    }
    @Override
    public void setData(Gril data) {
        super.setData(data);
        //Log.e("GirlViewHolder",data.imageUrl);
        Glide.with(getContext())
                .load(data.Url)
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(image);
    }
}
