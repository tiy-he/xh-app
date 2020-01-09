package com.xiaohe66.apk.demo.study.view.radio;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.xiaohe66.apk.demo.R;
import com.xiaohe66.apk.demo.common.L;

/**
 * Created by xiaohe
 * 17-08-18 018
 *
 * 单选按钮的操作
 * 一般都是使用RadioGroup获取RadioButton的状态和信息
 */
public class RadioTest extends Activity{

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_view_radio);

        radioGroup = (RadioGroup) findViewById(R.id.stu_radio_group);
        //绑定点击事件
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //checkedId为触发该事件的控件id
                switch (checkedId){
                case R.id.stu_radio_nan:
                    L.d("男");
                    break;
                case R.id.stu_radio_nv:
                    L.d("女");
                    break;
                default:
                    L.d("未知");
                }
            }
        });
    }
}
