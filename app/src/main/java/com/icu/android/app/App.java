package com.icu.android.app;

import com.jaydenxiao.common.baseapp.BaseApplication;
import com.jaydenxiao.common.commonutils.LogUtils;

public class App extends BaseApplication {
    private static App app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        /**
         * DEBUG才打印
         */
        LogUtils.logInit(true);
    }

    public static App getApp() {
        return app;
    }
}
