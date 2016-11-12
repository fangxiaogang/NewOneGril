package com.example.xiaogang.newonegril.v.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.example.xiaogang.newonegril.v.model.Android;
import com.example.xiaogang.newonegril.v.model.Blog;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

/**
 * Created by xiaogang on 16/11/3.
 */

public class Blogadapter extends RecyclerArrayAdapter<Android> {
    public Blogadapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new BlogViewHolder(parent);
    }
}
