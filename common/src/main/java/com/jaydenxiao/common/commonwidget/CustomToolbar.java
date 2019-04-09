package com.jaydenxiao.common.commonwidget;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.jaydenxiao.common.R;

public class CustomToolbar extends RelativeLayout {

    private Toolbar toolbar;

    public CustomToolbar(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.include_title_layout, this);
        //
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        //
        ((AppCompatActivity) getContext()).setSupportActionBar(toolbar);
        ActionBar actionBar = ((AppCompatActivity) getContext()).getSupportActionBar();
        if (actionBar != null) {
            //是否显示默认Title
            actionBar.setDisplayShowTitleEnabled(true);
            //是否显示返回键
            actionBar.setDisplayHomeAsUpEnabled(true);
            //监听返回键
            toolbar.setNavigationOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((AppCompatActivity) getContext()).onBackPressed();
                }
            });
        }
    }

    public Toolbar getToolbar() {
        return toolbar;
    }

}
