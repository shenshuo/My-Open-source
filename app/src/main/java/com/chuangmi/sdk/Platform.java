package com.chuangmi.sdk;
import android.app.Activity;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *   对的抽象根据不同的功能实现编写功能的组件类，以分享模块为例子 ,
 *   有分享组建ShareComponent，以及对于的管理类 SharePlatform 。
 */

public class Platform {

    protected ArrayList<Component> components = new ArrayList<Component>();
    protected Activity activity;
    protected String activityName;

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    private boolean isSetup = false;

    public boolean isSetup() {
        return isSetup;
    }

    public void setUp(final Activity activity, List<Component> compArray) {
        this.activity = activity;
        components.addAll(compArray);
        Iterator<Component> it = components.iterator();
        while (it.hasNext()) {
            Component c = it.next();
            c.setup(this.activity);
            c.onCreate();
        }
        activityName = "";
        isSetup = true;
    }


    public void cleanUp() {
        Iterator<Component> it = components.iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        isSetup = false;
    }

    public void onStart() {
        Iterator<Component> it = components.iterator();
        while (it.hasNext()) {
            Component c = it.next();
            c.onStart();
        }
    }

    public void onRestart() {
        Iterator<Component> it = components.iterator();
        while (it.hasNext()) {
            Component c = it.next();
            c.onRestart();
        }
    }

    public void onResume() {
        Iterator<Component> it = components.iterator();
        while (it.hasNext()) {
            Component c = it.next();
            c.onResume();
        }
    }

    public void onPause() {
        Iterator<Component> it = components.iterator();
        while (it.hasNext()) {
            Component c = it.next();
            c.onPause();
        }
    }

    public void onStop() {
        Iterator<Component> it = components.iterator();
        while (it.hasNext()) {
            Component c = it.next();
            c.onStop();
        }
    }

    public void onDestroy() {
        Iterator<Component> it = components.iterator();
        while (it.hasNext()) {
            Component c = it.next();
            c.onDestroy();
        }
    }

    public void onBackPressed() {
        Iterator<Component> it = components.iterator();
        while (it.hasNext()) {
            Component c = it.next();
            c.onBackPressed();
        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Iterator<Component> it = components.iterator();
        while (it.hasNext()) {
            Component c = it.next();
            c.onActivityResult(requestCode, resultCode, data);
        }
    }

}
