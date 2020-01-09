package com.xiaohe66.apk.demo.study.view.btnListen;

import android.view.View;
import android.view.View.OnClickListener;

import com.xiaohe66.apk.demo.common.L;

/**
 * Created by xiaohe
 * 17-08-17 017
 */
public class MyOnClickListen implements OnClickListener {
    @Override
    public void onClick(View v) {
        L.d("外部类事件监听");
    }
}
