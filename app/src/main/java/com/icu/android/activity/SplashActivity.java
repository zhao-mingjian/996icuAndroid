package com.icu.android.activity;

import android.view.View;

import com.example.jason.pageskip.R;
import com.icu.android.api.ApiConstants;
import com.jaeger.library.StatusBarUtil;
import com.jaydenxiao.common.base.BaseActivity;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.functions.Action1;

public class SplashActivity extends BaseActivity {

    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        customToolbar.setVisibility(View.GONE);
        Observable.timer(2, TimeUnit.SECONDS).subscribe(new Action1<Long>() {
            @Override
            public void call(Long aLong) {
                WebViewActivity.startAction(mContext, ApiConstants.SERVER);
                finish();
            }
        });
    }

    @Override
    protected void setStatusBar() {
        StatusBarUtil.setTranslucentForImageView(this, 0, findViewById(R.id.iv_launcher));
    }

    @Override
    protected void setFitsSystemWindows() {
    }
}
