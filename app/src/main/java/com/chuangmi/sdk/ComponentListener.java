package com.chuangmi.sdk;

public interface ComponentListener<T> {
	public void onLoading();

	public void onSuccess(T data);

	public void onError(String reason);
	
	public void onCancel();
}
