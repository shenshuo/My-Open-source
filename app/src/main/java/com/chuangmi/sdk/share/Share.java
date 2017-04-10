package com.chuangmi.sdk.share;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Share extends ShareComponent implements IWeixin{
//	private IWXAPI api;
    private Context context;
	public Share() {
		super("weixin");

	}

	@Override
	public void onCreate() {
		super.onCreate();
//		api = WXAPIFactory.createWXAPI(activity, APP_ID);


	}

	@Override
	protected void share2AllImpl() {
		sendWeb(false);

	}

	@Override
	protected void share2FriendImpl() {
		sendWeb(true);
	}

	protected void sendWeb(boolean is2frd) {

/*		WXWebpageObject webpage = new WXWebpageObject();
		webpage.webpageUrl = shareInfo.getShareUrl();
		WXMediaMessage msg = new WXMediaMessage(webpage);
		msg.title = shareInfo.getTitle();
		msg.description = shareInfo.getSummary();
		*//*
		 * Bitmap thumb = BitmapFactory.decodeResource(activity.getResources(),
		 * R.drawable.ic_launcher);
		 *//*
		if (shareInfo.getShareBitmap() == null) {
			msg.thumbData = BitmapUtil.bmpToByteArray(BitmapFactory
					.decodeResource(activity.getResources(),
							R.drawable.ic_launcher), true);
		} else {
			try {
				msg.thumbData = BitmapUtil.bmpToByteArray(
						shareInfo.getShareBitmap(), false);
			} catch (Exception e) {
				sendError(e.toString());
			}
			
		}

		SendMessageToWX.Req req = new SendMessageToWX.Req();
		req.transaction = "webpage" + System.currentTimeMillis();
		req.message = msg;
		req.scene = is2frd ? SendMessageToWX.Req.WXSceneSession
				: SendMessageToWX.Req.WXSceneTimeline;
		api.sendReq(req);*/

	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {

	}

	@Override
	public Object getAPI() {
		return null;
	}
  //是否安装
	@Override
	public boolean isInstalledClient() {
		return true;
	}
}
