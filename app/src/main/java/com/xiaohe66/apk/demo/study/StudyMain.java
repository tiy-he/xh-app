package com.xiaohe66.apk.demo.study;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.xiaohe66.apk.demo.R;
import com.xiaohe66.apk.demo.study.activity.ActivityMain;
import com.xiaohe66.apk.demo.study.view.ViewMain;

/**
 * Created by xiaohe
 * 17-08-28 028
 */
public class StudyMain extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_main);
    }

    private void go(Class cls){
        startActivity(new Intent(this,cls));
    }

    public void toView(View view) {
        go(ViewMain.class);
    }

    public void toAct(View view) {
        go(ActivityMain.class);
    }
}
