package com.xiaohe66.apk.demo.study.view.toggleButton;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ToggleButton;

import com.xiaohe66.apk.demo.R;
import com.xiaohe66.apk.demo.common.L;

/**
 * Created by xiaohe
 * 17-08-18 018
 *
 * ToggleButton有两种状态，两种状态可以分别设置不同的文本
 * 1.选中
 * 2.未选中
 *
 */
public class ToggleButtonTest extends Activity implements OnCheckedChangeListener{

    private ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_view_toggle_btn);

        //1.获取toggleBtn控件
        toggleButton = (ToggleButton) findViewById(R.id.stu_toggle_btn);
        //2.添加监听事件，和button的事件一样有3种方式，这里使用接口的方式
        toggleButton.setOnCheckedChangeListener(this);
        //3.重写onCheckedChanged方法
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        L.d(isChecked ? "开状态" : "关状态");
    }
}
