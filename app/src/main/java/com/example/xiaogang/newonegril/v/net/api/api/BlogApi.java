package com.example.xiaogang.newonegril.v.net.api.api;

import com.example.xiaogang.newonegril.v.model.Blog;
import com.example.xiaogang.newonegril.v.model.Meizi;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by xiaogang on 16/11/3.
 */

public interface BlogApi {
    String GANK_API = "http://gank.io/api/";
    @GET("data/Android/10/{page}")
    Observable<Blog> getblog (@Path("page") int page);

}
