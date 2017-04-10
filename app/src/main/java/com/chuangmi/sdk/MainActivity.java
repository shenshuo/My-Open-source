package com.chuangmi.sdk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.chuangmi.sdk.share.ShareComponent;
import com.chuangmi.sdk.share.SharePlatform;
import com.chuangmi.sdk.share.modle.ShareInfo;
import com.chuangmi.sdk.wechat.Share;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Component> list=new ArrayList<>();

          list.add(new Share(this));
//        list.add(new qqShare());
        SharePlatform.getInstance().setUp(this,list);
        SharePlatform.getInstance().setActivityName(this.getClass().getSimpleName());

        ShareComponent wechat = SharePlatform.getInstance().getShareComponent("weixin");

        wechat.share2All(   new ShareInfo("分享","","https://www.baidu.com",""), new ComponentListener<ShareInfo>() {
            @Override
            public void onLoading() {

            }

            @Override
            public void onSuccess(ShareInfo data) {

            }

            @Override
            public void onError(String reason) {

            }

            @Override
            public void onCancel() {

            }
        });

    }
}
