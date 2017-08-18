package cn.xh.app.study;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cn.xh.app.R;
import cn.xh.app.study.btnListen.BtnListenActivity;

/**
 * Created by xiaohe
 * 17-08-16 016
 */
public class ViewMain extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu_view_main);
    }

    public void toBtnListen(View view) {
        Intent intent = new Intent();
        intent.setClass(this, BtnListenActivity.class);
        startActivity(intent);
    }
}
