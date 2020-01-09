package com.xiaohe66.apk.demo.study.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.xiaohe66.apk.demo.R;
import com.xiaohe66.apk.demo.study.activity.activityLifeCycle.ActivityLifeCycle;
import com.xiaohe66.apk.demo.study.activity.viewSkip.ViewSkip;
import com.xiaohe66.apk.demo.study.activity.gesture.GestureDetectorTest;
import com.xiaohe66.apk.demo.study.activity.gesture.GestureOverlayViewTest;

/**
 * Created by xiaohe
 * 17-08-28 028
 */
public class ActivityMain extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_act_main);
    }
    private void go(Class<?> cls){
        startActivity(new Intent(this,cls));
    }
    public void toActivity(View view) {
        go(ActivityLifeCycle.class);
    }

    public void toGesture1(View view) {
        go(GestureDetectorTest.class);
    }

    public void toGesture2(View view) {
        go(GestureOverlayViewTest.class);
    }

    public void toViewSkip(View view) {
        go(ViewSkip.class);
    }
}
