package com.xiaohe66.apk.demo.study.data;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.xiaohe66.apk.demo.R;
import com.xiaohe66.apk.demo.study.data.broadcast.BroadcastReceiverTest;
import com.xiaohe66.apk.demo.study.data.contentProvider.ContentResolverTest;
import com.xiaohe66.apk.demo.study.data.contentProvider.InsertTest;
import com.xiaohe66.apk.demo.study.data.sharedPreferences.SharedPreferencesTest;

/**
 * Created by xiaohe
 * 17-08-26 026
 */
public class DataMain extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_data_main);
    }

    private void go(Class<?> cls){
        Intent intent = new Intent(this,cls);
        startActivity(intent);
    }

    public void gotoSharedPreferences(View view) {
        go(SharedPreferencesTest.class);
    }

    public void gotoContentResolver(View view) {
        go(ContentResolverTest.class);
    }

    public void gotoInsert(View view) {
        go(InsertTest.class);
    }

    public void gotoBC(View view) {
        go(BroadcastReceiverTest.class);
    }
}
