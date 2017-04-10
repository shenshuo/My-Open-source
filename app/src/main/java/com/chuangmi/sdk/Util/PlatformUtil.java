package com.chuangmi.sdk.Util;

import android.app.Activity;

import com.chuangmi.sdk.Component;
import com.chuangmi.sdk.share.SharePlatform;
import com.chuangmi.sdk.wechat.Share;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SHD on 2017/4/1.
 */

public class PlatformUtil {



    public static void setSharePlatformn(Activity mActivity,String name) {
        SharePlatform.getInstance().getShareComponent("wexin");
        List<Component> componentList = new ArrayList<>();
        componentList.add(new Share(mActivity));
        SharePlatform.getInstance().setUp(mActivity, componentList);
    }



}
