package com.chuangmi.sdk.share.modle;

import android.graphics.Bitmap;

/**
 * 分享信息
 * @author SHD
 */
public class ShareInfo {
	private String title;// 分享标题
	private String imageUrl;// 封面url
	private String shareUrl;// 即将分享的视频url
	private String summary;// 分享摘要
	private Bitmap shareBitmap; // 分享的Bitmap 不能大于32k

	public ShareInfo(String title, String imageUrl,
			String shareUrl, String summary) {
		this.title =  title;
		this.imageUrl = imageUrl;
		this.shareUrl = shareUrl;
		this.summary = summary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getShareUrl() {
		return shareUrl;
	}

	public void setShareUrl(String shareUrl) {
		this.shareUrl = shareUrl;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Bitmap getShareBitmap() {
		return shareBitmap;
	}

	public void setShareBitmap(Bitmap shareBitmap) {
		this.shareBitmap = shareBitmap;
	}


}
