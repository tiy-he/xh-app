package com.xiaohe66.apk.demo.study.view.checkBox;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.xiaohe66.apk.demo.R;
import com.xiaohe66.apk.demo.common.L;

/**
 * Created by xiaohe
 * 17-08-18 018
 */
public class CheckBoxTest extends Activity{

    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_view_check_box);

        checkBox = (CheckBox) findViewById(R.id.stu_check_box);

        //设置监听事件，获取checkBox的状态和内容
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String str = buttonView.getText().toString();
                L.d(isChecked ? "选中了"+str : "取消"+str);
            }
        });
    }
}
