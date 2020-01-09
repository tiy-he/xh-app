package com.xiaohe66.apk.demo.study.activity.viewSkip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.xiaohe66.apk.demo.R;
import com.xiaohe66.apk.demo.common.L;

/**
 * Created by xiaohe
 * 17-08-18 018
 */
public class ViewSkip extends Activity implements View.OnClickListener{

    private Button one,two;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_act_view_skip);

        //显示意图，无返回值
        one = (Button) findViewById(R.id.stu_act_view_skip_one);
        one.setOnClickListener(this);

        //显示意图，带返回值
        two = (Button) findViewById(R.id.stu_act_view_skip_two);
        two.setOnClickListener(this);

        textView = (TextView) findViewById(R.id.stu_act_view_skip_text);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.stu_act_view_skip_one:{
                Intent intent = new Intent(this,ViewSkipGoal.class);
                startActivity(intent);
                break;
            }
            case R.id.stu_act_view_skip_two:{
                Intent intent = new Intent(this,ViewSkipGoal.class);
                startActivityForResult(intent,1);
                break;
            }
        }

    }

    /**
     * 该方法接收通过startActivityForResult方法跳转后的返回信息
     * @param requestCode 跳转时带的requestCode
     * @param resultCode 返回信息时带的resultCode
     * @param data 返回的数据
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //1为跳转页面时设置的值，2为页面返回信息的设置的值
        if(requestCode == 1 && resultCode == 2){
            //获取数据
            String str = data.getStringExtra("data");
            L.d(str);
            //显示到文本框中
            textView.setText(str);
        }
    }
}
