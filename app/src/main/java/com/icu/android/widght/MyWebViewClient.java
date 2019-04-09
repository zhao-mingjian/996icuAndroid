package com.icu.android.widght;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.icu.android.activity.WebViewActivity;

public class MyWebViewClient extends WebViewClient {

    private WebViewActivity mActivity;

    public MyWebViewClient(WebViewActivity webViewActivity) {
        this.mActivity = webViewActivity;
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        mActivity.customToolbar.getToolbar().setTitle(view.getTitle());
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        // 电话、短信、邮箱
        if (url.startsWith(WebView.SCHEME_TEL) || url.startsWith("sms:") || url.startsWith(WebView.SCHEME_MAILTO)) {
            try {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                mActivity.startActivity(intent);
            } catch (ActivityNotFoundException ignored) {
            }
            return true;
        }
        view.loadUrl(url);
        return false;
    }
}
