package com.chuangmi.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/**
 * 抽象单个組件功能 ,再接入SDK的時候,可以根据实现 对于 OnCreate() .. 等方法 与activity 生命周期绑定
 *
 * @param <T>
 */
public abstract class Component<T> {

    private final ComponentType type;
    private final String name;

    public Component(String name, ComponentType login) {
        this.name = name;
        this.type = login;
    }

    //获取类型
    public ComponentType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    protected Context activity = null;

    public final void setup(Activity activity) {
        this.activity = activity;
    }

    protected boolean isRunning = false;

    public boolean isRunning() {
        return isRunning;
    }


    protected ComponentListener<T> mListener;

    public void sendError(String reason) {
        isRunning = false;
        mListener.onError(reason);
    }

    public void sendCancel() {
        isRunning = false;
        mListener.onCancel();
    }

    public void sendSuccess(T info) {
        isRunning = false;
        mListener.onSuccess(info);
    }

    public void sendLoading() {
        mListener.onLoading();
    }

    /**
     * 此处处理Activity 当前状态
     */
    public void onCreate() {

    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
    }

    public void onStart() {

    }

    public void onRestart() {
    }

    public void onResume() {
    }

    public void onPause() {
    }

    public void onStop() {
    }

    public void onDestroy() {
    }

    public void onBackPressed() {
    }
}

