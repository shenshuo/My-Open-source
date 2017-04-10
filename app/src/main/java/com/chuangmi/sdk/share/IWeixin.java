package com.chuangmi.sdk.share;

public interface IWeixin {
	String APP_ID = "";
	String SECRET = "";
	
	String PACKAGE_VALUE = "";
	
	String PARTNER_ID = "";
	String ACCOUNT_ID = "";
	String API_KEY = "";
	
	// 微信获取openid地址
	String WEIXIN_OPENID_URL = "https://api.weixin.qq.com/sns/oauth2/access_token";
	// 微信获取用户信息地址
	String WEIXIN_USERINFO_URL = "https://api.weixin.qq.com/sns/userinfo";
		
}
