package com.chuangmi.sdk.share;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.chuangmi.sdk.Component;
import com.chuangmi.sdk.R;

import java.util.ArrayList;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

         ArrayList<Component> components = new ArrayList<Component>();
//       components.add(new ShareWechat());   //分享微信实例
//     *//* components.add(new ShareQQ());  //  分享qq实例
        SharePlatform.getInstance().setUp(this, components);
        SharePlatform.getInstance().setActivityName(this.getClass().getSimpleName());

    }

}
