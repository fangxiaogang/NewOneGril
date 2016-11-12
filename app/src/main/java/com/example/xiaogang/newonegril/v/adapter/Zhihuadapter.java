package com.example.xiaogang.newonegril.v.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.example.xiaogang.newonegril.v.model.Zhihu;
import com.example.xiaogang.newonegril.v.model.Zhiitem;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

/**
 * Created by xiaogang on 16/11/5.
 */

public class Zhihuadapter extends RecyclerArrayAdapter<Zhiitem> {
    public Zhihuadapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new ZhihuViewHolder(parent);
    }
}
