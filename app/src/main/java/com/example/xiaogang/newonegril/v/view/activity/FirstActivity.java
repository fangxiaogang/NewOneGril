package com.example.xiaogang.newonegril.v.view.activity;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

import com.example.xiaogang.newonegril.R;

import java.lang.ref.WeakReference;

public class FirstActivity extends AppCompatActivity {
    private SwitchHandler mHandler = new SwitchHandler(Looper.getMainLooper(), this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mHandler.sendEmptyMessageDelayed(1, 700);
    }


    class SwitchHandler extends Handler {
        private WeakReference<FirstActivity> mWeakReference;

        public SwitchHandler(Looper mLooper, FirstActivity activity) {
            super(mLooper);
            mWeakReference = new WeakReference<FirstActivity>(activity);
        }

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            Intent i = new Intent(FirstActivity.this, MainActivity.class);
            FirstActivity.this.startActivity(i);
            //activity切换的淡入淡出效果
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            FirstActivity.this.finish();
        }
    }
}
