package com.xiaohe66.apk.demo.study.view.btnListen;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.xiaohe66.apk.demo.R;
import com.xiaohe66.apk.demo.common.L;

/**
 * Created by xiaohe
 * 17-08-16 016
 */
public class BtnListenActivity extends Activity implements OnClickListener{

    private Button niMing,waiBu,jieKou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_view_btn_listen);

        niMingListen();
        waiBuListen();
        jieKouListean();
    }

    private void jieKouListean() {
        jieKou = (Button) findViewById(R.id.stu_btn_listen_jie_kou);
        jieKou.setOnClickListener(this);
    }

    private void waiBuListen() {
        waiBu = (Button) findViewById(R.id.stu_btn_listen_wai_bu);

        waiBu.setOnClickListener(new MyOnClickListen());
    }

    private void niMingListen() {

        //找到该button
        niMing = (Button) findViewById(R.id.stu_btn_listen_ni_ming);
        //监听按钮，匿名内部类
        niMing.setOnClickListener(new View.OnClickListener() {
            /**
             * 按钮监听事件
             * @param v
             */
            @Override
            public void onClick(View v) {
                L.d("匿名内部类监听按钮点击");
            }
        });
    }

    @Override
    public void onClick(View v) {
        L.d("接口监听点击事件");
    }
}
