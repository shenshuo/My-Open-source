package com.chuangmi.sdk.wechat;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.chuangmi.sdk.share.ShareComponent;
public class Share extends ShareComponent {
    private Context context;


    public Share(Context context) {
        super("weixin");
        this.context=context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
//	    WXAPIFactory.createWXAPI(activity, APP_ID);
    }

    @Override
    protected void share2AllImpl() {
        Toast.makeText(context,"ssss",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void share2FriendImpl() {

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

    }

    @Override
    public Object getAPI() {
        return null;
    }

    @Override
    public boolean isInstalledClient() {
        return true;
    }
}
