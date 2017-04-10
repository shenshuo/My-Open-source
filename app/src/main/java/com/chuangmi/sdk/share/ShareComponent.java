package com.chuangmi.sdk.share;

import com.chuangmi.sdk.Component;
import com.chuangmi.sdk.ComponentListener;
import com.chuangmi.sdk.ComponentType;
import com.chuangmi.sdk.share.modle.ShareInfo;

/**
 * 分享模块
 * @author SHD
 */
public abstract class ShareComponent extends Component<ShareInfo> {

    public ShareComponent(String name) {
        super(name, ComponentType.SHARE);
    }

    protected ShareInfo shareInfo;
    /**
     * 所有的分享
     */
    protected abstract void share2AllImpl();
    /**
     * 分享给好友
     */
    protected abstract void share2FriendImpl();

    /**
     *  获得返回的SDK实例
     * @return
     */
    public abstract Object getAPI();

    /**
     * 是否存在这个实例
     * @return
     */
    public abstract boolean isInstalledClient();

    public void share2Friend(ShareInfo info, ComponentListener<ShareInfo> listener) {
        share(info, listener, false);
    }

    public void share2All(ShareInfo info, ComponentListener<ShareInfo> listener) {
        share(info, listener, true);
    }

    private void share(ShareInfo info, ComponentListener<ShareInfo> listener, boolean is2All) {
        mListener = listener;
        if (!isInstalledClient()) {
            sendError("noClient");
            return;
        }

        shareInfo = info;
        if (is2All) {
            share2AllImpl();
        } else {
            share2FriendImpl();
        }
        isRunning = true;
    }




}
