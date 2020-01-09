package com.xiaohe66.apk.demo.study.view.textView;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by xiaohe
 * 17-08-18 018
 */
public class MyTextView extends TextView{
    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 是否获取焦点
     * 返回true表示任何情况下都以已获得焦点的情况来处理
     * 要实现多个textView的跑马灯的效果，需要重写该方法
     * @return
     */
    @Override
    public boolean isFocused() {
        return true;
    }
}
