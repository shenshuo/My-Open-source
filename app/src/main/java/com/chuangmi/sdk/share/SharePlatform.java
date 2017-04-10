package com.chuangmi.sdk.share;
import com.chuangmi.sdk.Component;
import com.chuangmi.sdk.ComponentType;
import com.chuangmi.sdk.Platform;
import java.util.Iterator;
/**
 * 发享组建管理器
 */

public class SharePlatform extends Platform {

	private static class SingletonHolder {
		public static final SharePlatform instance = new SharePlatform();
	}

	public static SharePlatform getInstance() {
		return SingletonHolder.instance;
	}

	public ShareComponent getShareComponent(final String name) {
		Iterator<Component> it = components.iterator();
		while (it.hasNext()) {
			Component c = it.next();
			if (c.getType() == ComponentType.SHARE
					&& c.getName().compareTo(name) == 0) {
				return (ShareComponent) c;
			}
		}
		return null;
	}

}
